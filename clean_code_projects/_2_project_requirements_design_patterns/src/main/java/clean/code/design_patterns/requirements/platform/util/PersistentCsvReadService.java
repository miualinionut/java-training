package clean.code.design_patterns.requirements.platform.util;

import clean.code.design_patterns.requirements.platform.dao.Repository;
import clean.code.design_patterns.requirements.platform.pojo.*;

import java.io.FileInputStream;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PersistentCsvReadService {
    private final AuditCsvService auditCsvService;
    private static PersistentCsvReadService instance = null;
    private final Repository repository;
    private static final String dir = "clean_code_projects/_2_project_requirements_design_patterns/data/";

    private PersistentCsvReadService() {
        auditCsvService = AuditCsvService.getInstance();
        repository = Repository.getInstance();
        auditCsvService.writeCsv("Loading csv files in memory");
        readTeachers();
        readTeachingAssistants();
        readStudents();
        readCourses();
        readUserCourseRepartition();
        readQuizzes();
        readFeedbacks();
    }

    private void readFeedbacks() {
        try {
            Scanner fin = new Scanner(new FileInputStream(dir + "feedbacks.csv"));
            while (fin.hasNext()) {
                final String s = fin.nextLine();
                try {
                    final List<String> args = Arrays.stream(s.split(",")).map(aux -> aux.strip()).collect(Collectors.toList());
                    int courseId = Integer.parseInt(args.get(1));
                    Course course = ELearningPlatformService.findCourseById(courseId);
                    int feedbackId = Integer.parseInt(args.get(0));
                    AnonymousCourseFeedback feedback = new AnonymousCourseFeedback(feedbackId, course, args.get(2));
                    if (!AdminInterface.feedbacks.contains(feedback)) {
                        AdminInterface.feedbacks.add(feedback);
                        repository.getAnonymousCourseFeedbackDao().writeAnonymousCourseFeedback(feedback);
                    }
                } catch (Exception e) {
                    auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: ReadFeedbacks: " + e);
                }
            }
            fin.close();
        } catch (Exception e) {
            auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: ReadFeedbacks: " + e);
        }
    }

    private void readTeachingAssistants() {
        try {
            Scanner fin = new Scanner(new FileInputStream(dir + "assistants.csv"));
            while (fin.hasNext()) {
                final String s = fin.nextLine();
                try {
                    final List<String> args = Arrays.stream(s.split(",")).map(aux -> aux.strip()).collect(Collectors.toList());
                    int id = Integer.parseInt(args.get(0));
                    Date date = AdminInterface.parseDate(args.get(2), "yyyy-MM-dd");
                    int teacherId = Integer.parseInt(args.get(3));
                    Teacher teacher = (Teacher) ELearningPlatformService.findUserById(teacherId);
                    TeachingAssistant teachingAssistant = new TeachingAssistant(id, args.get(1), date, teacher, args.get(4), args.get(5));
                    if (!AdminInterface.users.contains(teachingAssistant)) {
                        AdminInterface.users.add(teachingAssistant);
                        repository.getTeachingAssistantDao().writeTeachingAssistant(teachingAssistant);
                    }
                } catch (Exception e) {
                    auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readTeachingAssistants: " + e);
                }
            }
            fin.close();
        } catch (Exception e) {
            auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readTeachingAssistants: " + e);
        }
    }

    private void readQuizzes() {
        try {
            Scanner fin = new Scanner(new FileInputStream(dir + "quizzes.csv"));
            while (fin.hasNext()) {
                final String s = fin.nextLine();
                try {
                    final List<String> args = Arrays.stream(s.split(",")).map(aux -> aux.strip()).collect(Collectors.toList());
                    int quizId = Integer.parseInt(args.get(0));
                    int courseId = Integer.parseInt(args.get(1));
                    Course course = ELearningPlatformService.findCourseById(courseId);
                    Quiz quiz = new Quiz(quizId, course, args.get(2));
                    if (!AdminInterface.quizzes.contains(quiz)) {
                        AdminInterface.quizzes.add(quiz);
                        repository.getQuizDao().writeQuiz(quiz);
                    }
                } catch (Exception e) {
                    auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readQuizzes: " + e);
                }
            }
            fin.close();
        } catch (Exception e) {
            auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readQuizzes: " + e);
        }
    }

    private void readUserCourseRepartition() {
        try {
            Scanner fin = new Scanner(new FileInputStream(dir + "repartitions.csv"));
            while (fin.hasNext()) {
                final String s = fin.nextLine();
                try {
                    final List<String> args = Arrays.stream(s.split(",")).map(aux -> aux.strip()).collect(Collectors.toList());
                    int courseId = Integer.parseInt(args.get(0));
                    Course course = ELearningPlatformService.findCourseById(courseId);
                    Date date = AdminInterface.parseDate(args.get(1), "yyyy-MM-dd");
                    int userId = Integer.parseInt(args.get(2));
                    User user = ELearningPlatformService.findUserById(userId);

                    UserCourseRepartition userCourseRepartition = new UserCourseRepartition(date, course, user);
                    if (!AdminInterface.userCourseRepartitions.contains(userCourseRepartition)) {
                        AdminInterface.userCourseRepartitions.add(userCourseRepartition);
                        repository.getUserCourseRepartitionDao().writeUserCourseRepartition(userCourseRepartition);
                    }
                } catch (Exception e) {
                    auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readUserCourseRepartition: " + e);
                }
            }
            fin.close();
        } catch (Exception e) {
            auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readUserCourseRepartition: " + e);
        }
    }

    private void readCourses() {
        try {
            Scanner fin = new Scanner(new FileInputStream(dir + "courses.csv"));
            while (fin.hasNext()) {
                final String s = fin.nextLine();
                try {
                    final List<String> args = Arrays.stream(s.split(",")).map(aux -> aux.strip()).collect(Collectors.toList());
                    int id = Integer.parseInt(args.get(0));
                    int teacherId = Integer.parseInt(args.get(1));
                    Teacher teacher = (Teacher) ELearningPlatformService.findUserById(teacherId);
                    Course course = new Course(id, teacher, args.get(2), args.get(3));
                    if (!AdminInterface.courses.contains(course)) {
                        AdminInterface.courses.add(course);
                        repository.getCourseDao().writeCourse(course);
                    }
                } catch (Exception e) {
                    auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readCourses: " + e);
                }
            }
            fin.close();
        } catch (Exception e) {
            auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readCourses: " + e);
        }
    }

    private void readStudents() {
        try {
            Scanner fin = new Scanner(new FileInputStream(dir + "students.csv"));
            while (fin.hasNext()) {
                final String s = fin.nextLine();
                try {
                    final List<String> args = Arrays.stream(s.split(",")).map(aux -> aux.strip()).collect(Collectors.toList());
                    int id = Integer.parseInt(args.get(0));
                    Date date = AdminInterface.parseDate(args.get(2), "yyyy-MM-dd");
                    Student student = new Student(id, args.get(1), date, args.get(3), args.get(4));
                    if (!AdminInterface.users.contains(student)) {
                        AdminInterface.users.add(student);
                        repository.getStudentDao().writeStudent(student);
                    }
                } catch (Exception e) {
                    auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readStudents: " + e);
                }
            }
            fin.close();
        } catch (Exception e) {
            auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readStudents: " + e);
        }
    }

    private void readTeachers() {
        try {
            Scanner fin = new Scanner(new FileInputStream(dir + "teachers.csv"));
            while (fin.hasNext()) {
                final String s = fin.nextLine();
                try {
                    final List<String> args = Arrays.stream(s.split(",")).map(aux -> aux.strip()).collect(Collectors.toList());
                    int id = Integer.parseInt(args.get(0));
                    Date date = AdminInterface.parseDate(args.get(2).strip(), "yyyy-MM-dd");
                    Teacher teacher = new Teacher(id, args.get(1), date, args.get(3), args.get(4), args.get(5));
                    if (!AdminInterface.users.contains(teacher)) {
                        AdminInterface.users.add(teacher);
                        repository.getTeacherDao().writeTeacher(teacher);
                    }
                } catch (Exception e) {
                    auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readTeachers: " + e);
                }
            }
            fin.close();
        } catch (Exception e) {
            auditCsvService.writeCsv("Exception in PersistentCsvReadService.java: readTeachers: " + e);
        }
    }

    static void init() {
        if (instance == null)
            instance = new PersistentCsvReadService();
    }
}
