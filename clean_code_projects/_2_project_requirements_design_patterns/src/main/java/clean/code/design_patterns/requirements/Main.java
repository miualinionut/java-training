package clean.code.design_patterns.requirements;

import clean.code.design_patterns.requirements.platform.dao.Repository;
import clean.code.design_patterns.requirements.platform.pojo.*;
import clean.code.design_patterns.requirements.platform.util.AuditCsvService;
import clean.code.design_patterns.requirements.platform.util.ELearningPlatformService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        final Scanner cin = new Scanner(System.in);
        final AuditCsvService auditCsvService = AuditCsvService.getInstance();
        final ELearningPlatformService eLearningPlatformService = ELearningPlatformService.getInstance();
        final Repository repository = Repository.getInstance();
        eLearningPlatformService.readFromCsv(cin);

        System.out.println("Type option");
        int opt = -1;
        do {
            try {
                printMenuOptions();
                opt = cin.nextInt();
                cin.nextLine();
                switch (opt) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Add Teacher");
                        System.out.println(eLearningPlatformService.addTeacher(cin));
                        break;
                    case 2:
                        System.out.println("Add Student");
                        System.out.println(eLearningPlatformService.addStudent(cin));
                        break;
                    case 3:
                        System.out.println("Add Teaching Assistant");
                        System.out.println(eLearningPlatformService.addTeachingAssistant(cin));
                        break;
                    case 4:
                        System.out.println("Add Course");
                        System.out.println(eLearningPlatformService.addCourse(cin));
                        break;
                    case 5:
                        System.out.println("Add Quiz");
                        System.out.println(eLearningPlatformService.addQuiz(cin));
                        break;
                    case 6:
                        System.out.println("Add Feedback");
                        System.out.println(eLearningPlatformService.addFeedback(cin));
                        break;
                    case 7:
                        System.out.println("Add a Repartition of an User to a Course");
                        System.out.println(eLearningPlatformService.addUserCourseRepartition(cin));
                        break;
                    case 8: {
                        System.out.println("Find User");
                        System.out.println("Type id user");
                        int id = cin.nextInt();
                        System.out.println(ELearningPlatformService.findUserById(id));
                        break;
                    }
                    case 9: {
                        System.out.println("Find Course");
                        System.out.println("Type id curs");
                        int id = cin.nextInt();
                        System.out.println(ELearningPlatformService.findCourseById(id));
                        break;
                    }
                    case 10: {
                        System.out.println("Find Quiz");
                        System.out.println("Type id quiz");
                        int id = cin.nextInt();
                        System.out.println(ELearningPlatformService.findQuizById(id));
                        break;
                    }
                    case 11: {
                        System.out.println("Show Repartitions to a Course");
                        System.out.println("Type id curs");
                        int id = cin.nextInt();
                        TreeSet<UserCourseRepartition> userCourseRepartitions = ELearningPlatformService.findUserCourseRepartitionByCourseId(id);
                        userCourseRepartitions.forEach(aux -> System.out.println(aux));
                        break;
                    }
                    case 12: {
                        System.out.println("Show Repartitions of a Specific Student");
                        System.out.println("Type id student");
                        int id = cin.nextInt();
                        TreeSet<UserCourseRepartition> userCourseRepartitions = ELearningPlatformService.findSpecificStudentCourseRepartitionsByStudentId(id);
                        userCourseRepartitions.forEach(aux -> System.out.println(aux));
                        break;
                    }
                    case 13: {
                        System.out.println("Show Feedbacks to a Specific Course");
                        System.out.println("Type id course");
                        int id = cin.nextInt();
                        ArrayList<AnonymousCourseFeedback> feedbacks = ELearningPlatformService.findFeedbacksByCourseId(id);
                        feedbacks.forEach(aux -> System.out.println(aux));
                        break;
                    }
                    case 14:
                        System.out.println("Show All Users");
                        ELearningPlatformService.users.forEach(aux -> System.out.println(aux));
                        break;
                    case 15:
                        System.out.println("Show All Courses");
                        ELearningPlatformService.courses.forEach(aux -> System.out.println(aux));
                        break;
                    case 16:
                        System.out.println("Delete Student by Id");
                        repository.getStudentDao().deleteStudent(cin.nextInt());
                        break;
                    case 17:
                        System.out.println("Delete Teacher by Id");
                        repository.getTeacherDao().deleteTeacher(cin.nextInt());
                        break;
                    case 18:
                        System.out.println("Delete Teaching Assistant by Id");
                        repository.getTeachingAssistantDao().deleteTeachingAssistant(cin.nextInt());
                        break;
                    case 19:
                        System.out.println("Delete Course by Id");
                        repository.getCourseDao().deleteCourse(cin.nextInt());
                        break;
                    case 20:
                        System.out.println("Delete Quiz by Id");
                        repository.getQuizDao().deleteQuiz(cin.nextInt());
                        break;
                    case 21:
                        System.out.println("Delete Feedback by CourseId and Index");
                        ArrayList<AnonymousCourseFeedback> feedbacks = ELearningPlatformService.findFeedbacksByCourseId(cin.nextInt());
                        System.out.println(feedbacks);
                        AnonymousCourseFeedback feedback = feedbacks.get(cin.nextInt());
                        repository.getAnonymousCourseFeedbackDao().deleteAnonymousCourseFeedback(feedback);
                        break;
                    case 22:
                        System.out.println("Delete repartition by CourseId and Index");
                        TreeSet<UserCourseRepartition> userCourseRepartitionTreeSet = ELearningPlatformService.findUserCourseRepartitionByCourseId(cin.nextInt());
                        ArrayList<UserCourseRepartition> userCourseRepartitions = new ArrayList<>(userCourseRepartitionTreeSet);
                        System.out.println(userCourseRepartitions);
                        UserCourseRepartition userCourseRepartition = userCourseRepartitions.get(cin.nextInt());
                        repository.getUserCourseRepartitionDao().deleteUserCourseRepartition(userCourseRepartition);
                        break;
                    case 23:
                        System.out.println("Update Course Description by Id (format: id\\n desc\\n)");
                        System.out.print("id: ");
                        int id = cin.nextInt();
                        cin.nextLine();
                        System.out.print("description: ");
                        String content = cin.nextLine().strip();
                        repository.getCourseDao().updateCourseDescription(id, content);
                        break;
                    case 24:
                        System.out.println("Update Quiz by Id  (format: quizId\\n content\\n)");
                        System.out.print("id: ");
                        id = cin.nextInt();
                        cin.nextLine();
                        System.out.print("content: ");
                        content = cin.nextLine().strip();
                        repository.getQuizDao().updateQuizContent(id, content);
                        break;
                    case 25:
                        System.out.println("Update Teacher Ranking by Id (format: teacherId\\n rank\\n)");
                        System.out.print("id: ");
                        id = cin.nextInt();
                        cin.nextLine();
                        System.out.print("rank: ");
                        content = cin.nextLine().strip();
                        repository.getTeacherDao().updateTeacherRanking(id, content);
                        break;
                    case 26:
                        System.out.println("Update User Address and PhoneNumber (format: userId\\n address\\n phoneNumber\\n)");
                        System.out.println("enter '*' to address or phoneNumber to not update that value");
                        System.out.print("id: ");
                        id = cin.nextInt();
                        cin.nextLine();
                        System.out.print("address: ");
                        content = cin.nextLine().strip();
                        System.out.print("phone: ");
                        String content2 = cin.nextLine().strip();
                        repository.getStudentDao().updateUserPhoneAddress(id, content, content2);
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } catch (Exception e) {
                auditCsvService.writeCsv("Exception in Main.java: " + e);
            } finally {
                System.out.println("Please press enter");
                cin.nextLine();
            }
        } while (opt != 0);
        System.out.println("Good Bye!");
    }

    private static void printMenuOptions() {
        System.out.println("0. Exit");
        System.out.println("1. Add Teacher");
        System.out.println("2. Add Student");
        System.out.println("3. Add Teaching Assistant");
        System.out.println("4. Add Course");
        System.out.println("5. Add Quiz");
        System.out.println("6. Add Feedback");
        System.out.println("7. Add a Repartition of an User to a Course");
        System.out.println("8. Find User");
        System.out.println("9. Find Course");
        System.out.println("10. Find Quiz");
        System.out.println("11. Show Repartitions to a Course");
        System.out.println("12. Show Repartitions of a Specific Student");
        System.out.println("13. Show Feedbacks to a Specific Course");
        System.out.println("14. Show All Users");
        System.out.println("15. Show All Courses");
        System.out.println("16. Delete Student by Id");
        System.out.println("17. Delete Teacher by Id");
        System.out.println("18. Delete Teaching Assistant by Id");
        System.out.println("19. Delete Course by Id");
        System.out.println("20. Delete Quiz by Id");
        System.out.println("21. Delete Feedback by CourseId and Index");
        System.out.println("22. Delete repartition by CourseId and Index");
        System.out.println("23. Update Course Description by Id");
        System.out.println("24. Update Quiz by Id");
        System.out.println("25. Update Teacher Ranking by Id");
        System.out.println("26. Update User Address and PhoneNumber");
        System.out.print("Your option is: ");
    }
}
