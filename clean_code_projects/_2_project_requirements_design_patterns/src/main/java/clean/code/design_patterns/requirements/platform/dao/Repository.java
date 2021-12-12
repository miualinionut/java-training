package clean.code.design_patterns.requirements.platform.dao;

import clean.code.design_patterns.requirements.platform.util.AdminInterface;
import clean.code.design_patterns.requirements.platform.util.AuditCsvService;

public final class Repository {
    private static Repository instance = null;
    private final StudentDao studentDao;
    private final TeacherDao teacherDao;
    private final TeachingAssistantDao teachingAssistantDao;
    private final CourseDao courseDao;
    private final UserCourseRepartitionDao userCourseRepartitionDao;
    private final QuizDao quizDao;
    private final AnonymousCourseFeedbackDao anonymousCourseFeedbackDao;

    private Repository() throws InterruptedException {
        AuditCsvService auditCsvService = AuditCsvService.getInstance();
        auditCsvService.writeCsv("Loading database in memory using jdbc");

        AdminInterface.clearALL();

        teacherDao = TeacherDao.getTeacherDao();
        teacherDao.start();
        studentDao = StudentDao.getStudentDao();
        studentDao.start();
        teachingAssistantDao = TeachingAssistantDao.getTeachingAssistantDao();
        teachingAssistantDao.start();
        courseDao = CourseDao.getCourseDao();
        courseDao.start();
        userCourseRepartitionDao = UserCourseRepartitionDao.getUserCourseRepartitionDao();
        userCourseRepartitionDao.start();
        quizDao = QuizDao.getQuizDao();
        quizDao.start();
        anonymousCourseFeedbackDao = AnonymousCourseFeedbackDao.getAnonymousCourseFeedbackDao();
        anonymousCourseFeedbackDao.start();

        teacherDao.join();
        studentDao.join();
        teachingAssistantDao.join();
        courseDao.join();
        userCourseRepartitionDao.join();
        quizDao.join();
        anonymousCourseFeedbackDao.join();
    }

    public static Repository getInstance() {
        if (instance == null) {
            try {
                instance = new Repository();
            } catch (InterruptedException e) {
                AuditCsvService.getInstance().writeCsv("Exception in Repository.java: getRepository: " + e);
                return getInstance();      //Repository is mandatory for the program to work
            }
        }
        return instance;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public TeacherDao getTeacherDao() {
        return teacherDao;
    }

    public TeachingAssistantDao getTeachingAssistantDao() {
        return teachingAssistantDao;
    }

    public CourseDao getCourseDao() {
        return courseDao;
    }

    public UserCourseRepartitionDao getUserCourseRepartitionDao() {
        return userCourseRepartitionDao;
    }

    public QuizDao getQuizDao() {
        return quizDao;
    }

    public AnonymousCourseFeedbackDao getAnonymousCourseFeedbackDao() {
        return anonymousCourseFeedbackDao;
    }
}
