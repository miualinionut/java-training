package clean.code.design_patterns.requirements.platform.util;

import org.jetbrains.annotations.NotNull;
import clean.code.design_patterns.requirements.platform.dao.Repository;
import clean.code.design_patterns.requirements.platform.pojo.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class ELearningPlatformService implements AdminInterface {
    private final AuditCsvService auditCsvService;
    private final PersistentCsvWriteService persistentCsvWriteService;
    private final Repository repository;
    private static ELearningPlatformService instance = null;

    private ELearningPlatformService() {
        auditCsvService = AuditCsvService.getInstance();
        persistentCsvWriteService = PersistentCsvWriteService.getInstance();
        repository = Repository.getInstance();
    }

    public static ELearningPlatformService getInstance() {
        if (instance == null) {
            instance = new ELearningPlatformService();
        }
        return instance;
    }

    @Override
    public @NotNull Date parseDate(@NotNull Scanner cin) throws RuntimeException {
        Date date = AdminInterface.super.parseDate(cin);
        cin.nextLine();
        return date;
    }

    public void readFromCsv(@NotNull Scanner cin) {
        try {
            System.out.println("Do you want to read from csv too? y/N");
            String ans = cin.nextLine();
            if (ans.strip().toLowerCase().charAt(0) == 'y')
                PersistentCsvReadService.init();
            else
                auditCsvService.writeCsv("No csv read");
        } catch (Exception e) {
            auditCsvService.writeCsv("No csv read because of: " + e);
        }
    }

    private void addUser(@NotNull Scanner in, final StringBuilder name, final Date date,
                         final StringBuilder address, final StringBuilder phoneNumber) throws RuntimeException {
        System.out.println("name");
        name.setLength(0);
        name.append(in.nextLine().strip());
        if (name.length() == 0)
            throw new IllegalArgumentException("empty name");

        System.out.println("Date yyyy-MM-dd");
        date.setTime(parseDate(in).getTime());

        System.out.println("address");
        address.setLength(0);
        address.append(in.nextLine().strip());
        if (address.length() == 0)
            throw new IllegalArgumentException("empty address");


        System.out.println("phone");
        phoneNumber.setLength(0);
        phoneNumber.append(in.nextLine().strip());
        if (!phoneNumber.toString().matches("[0-9]{10}")) {
            throw new IllegalArgumentException("incorrect phone number");
        }
    }

    @Override
    public Teacher addTeacher(@NotNull Scanner in) throws RuntimeException {
        StringBuilder name = new StringBuilder();
        Date birthDate = new Date(0);
        StringBuilder address = new StringBuilder();
        StringBuilder phoneNumber = new StringBuilder();
        addUser(in, name, birthDate, address, phoneNumber);

        System.out.println("rank");
        String rank = in.nextLine().strip();
        if (rank.length() == 0)
            throw new IllegalArgumentException("empty rank");


        Teacher teacher = new Teacher(name.toString(), birthDate, rank, address.toString(), phoneNumber.toString());
        users.add(teacher);
        repository.getTeacherDao().writeTeacher(teacher);
        return persistentCsvWriteService.writeTeacher(teacher);
    }

    @Override
    public Student addStudent(@NotNull Scanner in) throws RuntimeException {
        StringBuilder name = new StringBuilder();
        Date birthDate = new Date(0);
        StringBuilder address = new StringBuilder();
        StringBuilder phoneNumber = new StringBuilder();
        addUser(in, name, birthDate, address, phoneNumber);

        Student student = new Student(name.toString(), birthDate, address.toString(), phoneNumber.toString());
        users.add(student);
        repository.getStudentDao().writeStudent(student);
        return persistentCsvWriteService.writeStudent(student);
    }

    @Override
    public TeachingAssistant addTeachingAssistant(@NotNull Scanner in) throws RuntimeException {
        StringBuilder name = new StringBuilder();
        Date birthDate = new Date(0);
        StringBuilder address = new StringBuilder();
        StringBuilder phoneNumber = new StringBuilder();
        addUser(in, name, birthDate, address, phoneNumber);

        System.out.println("teacherId");
        int teacherId = in.nextInt();
        in.nextLine();
        Teacher teacher = (Teacher) findUserById(teacherId);

        TeachingAssistant teachingAssistant =
                new TeachingAssistant(name.toString(), birthDate, teacher, address.toString(), phoneNumber.toString());
        users.add(teachingAssistant);
        repository.getTeachingAssistantDao().writeTeachingAssistant(teachingAssistant);
        return persistentCsvWriteService.writeTeachingAssistant(teachingAssistant);
    }

    @Override
    public Course addCourse(@NotNull Scanner in) throws RuntimeException {
        System.out.println("id prof");
        int teacherId = in.nextInt();
        in.nextLine();
        User teacher = findUserById(teacherId);

        System.out.println("course name");
        String courseName = in.nextLine().strip();
        if (courseName.length() == 0)
            throw new IllegalArgumentException("empty course name");

        System.out.println("desc");
        String description = in.nextLine().strip();
        if (description.length() == 0)
            throw new IllegalArgumentException("empty course description");

        Course course = new Course(teacher, courseName, description);
        courses.add(course);
        repository.getCourseDao().writeCourse(course);
        return persistentCsvWriteService.writeCourse(course);
    }

    @Override
    public UserCourseRepartition addUserCourseRepartition(@NotNull Scanner in) throws RuntimeException {
        System.out.println("id curs");
        int idCourse = in.nextInt();
        in.nextLine();
        Course course = findCourseById(idCourse);

        System.out.println("date yyyy-MM-dd");
        Date startDate = parseDate(in);

        System.out.println("id user");
        int idUser = in.nextInt();
        in.nextLine();

        if (course.getTeacher().getId() == idUser)
            throw new IllegalArgumentException("a teacher cannot be a student to its own course");

        User user = findUserById(idUser);
        UserCourseRepartition userCourseRepartition = new UserCourseRepartition(startDate, course, user);
        userCourseRepartitions.add(userCourseRepartition);
        repository.getUserCourseRepartitionDao().writeUserCourseRepartition(userCourseRepartition);
        return persistentCsvWriteService.writeUserCourseRepartition(userCourseRepartition);
    }

    @Override
    public Quiz addQuiz(@NotNull Scanner in) throws RuntimeException {
        System.out.println("id curs");
        int courseId = in.nextInt();
        in.nextLine();
        Course course = findCourseById(courseId);

        System.out.println("quiz content");
        String quizContent = in.nextLine().strip();
        if (quizContent.length() == 0)
            throw new IllegalArgumentException("empty quiz content");

        Quiz quiz = new Quiz(course, quizContent);
        quizzes.add(quiz);
        repository.getQuizDao().writeQuiz(quiz);
        return persistentCsvWriteService.writeQuiz(quiz);
    }

    @Override
    public AnonymousCourseFeedback addFeedback(@NotNull Scanner in) throws RuntimeException {
        System.out.println("id curs");
        int courseId = in.nextInt();
        in.nextLine();
        Course course = findCourseById(courseId);

        System.out.println("feedback description");
        String feedbackContent = in.nextLine().strip();
        if (feedbackContent.length() == 0)
            throw new IllegalArgumentException("empty feedback content");

        AnonymousCourseFeedback feedback = new AnonymousCourseFeedback(course, feedbackContent);
        feedbacks.add(feedback);
        repository.getAnonymousCourseFeedbackDao().writeAnonymousCourseFeedback(feedback);
        return persistentCsvWriteService.writeFeedback(feedback);
    }

    public static @NotNull Quiz findQuizById(int quizId) throws NullPointerException {
        synchronized (quizzes) {
            for (Quiz quiz : quizzes) {
                if (quiz.getId() == quizId)
                    return quiz;
            }
        }
        throw new NullPointerException("Exception in ELearningPlatformService.java: findQuizById: no quiz found");
    }

    public static @NotNull Course findCourseById(int courseId) throws NullPointerException {
        synchronized (courses) {
            for (Course course : courses) {
                if (course.getId() == courseId)
                    return course;
            }
        }
        throw new NullPointerException("Exception in ELearningPlatformService.java: findCourseById: no course found");
    }

    public static @NotNull User findUserById(int userId) throws NullPointerException {
        synchronized (users) {
            for (User user : users) {
                if (user.getId() == userId)
                    return user;
            }
        }
        throw new NullPointerException("Exception in ELearningPlatformService.java: findUserById: no user found");
    }

    public static @NotNull TreeSet<UserCourseRepartition> findSpecificStudentCourseRepartitionsByStudentId(int userId) {
        TreeSet<UserCourseRepartition> repartitions =
                new TreeSet<>((userCourseRepartition, t1) -> userCourseRepartition.getStartDate().compareTo(t1.getStartDate()));
        synchronized (userCourseRepartitions) {
            for (UserCourseRepartition userCourseRepartition : userCourseRepartitions) {
                if (userCourseRepartition.getUser().getId() == userId)
                    repartitions.add(userCourseRepartition);
            }
        }
        return repartitions;
    }

    public static @NotNull TreeSet<UserCourseRepartition> findUserCourseRepartitionByCourseId(int courseId) {
        TreeSet<UserCourseRepartition> repartitions =
                new TreeSet<>((userCourseRepartition, t1) -> userCourseRepartition.getStartDate().compareTo(t1.getStartDate()));
        synchronized (userCourseRepartitions) {
            for (UserCourseRepartition userCourseRepartition : userCourseRepartitions) {
                if (userCourseRepartition.getCourse().getId() == courseId)
                    repartitions.add(userCourseRepartition);
            }
        }
        return repartitions;
    }

    public static @NotNull ArrayList<AnonymousCourseFeedback> findFeedbacksByCourseId(int courseId) {
        ArrayList<AnonymousCourseFeedback> ans = new ArrayList<>();
        synchronized (feedbacks) {
            for (AnonymousCourseFeedback feedback : feedbacks) {
                if (feedback.getCourse().getId() == courseId)
                    ans.add(feedback);
            }
        }
        return ans;
    }
}
