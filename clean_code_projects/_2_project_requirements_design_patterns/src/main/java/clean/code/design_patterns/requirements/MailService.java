// Singleton pattern - mail service se instantiaza doar o singura data ca fiecare payment sa fie procesat o singura data

public class MailService {
    private  static MailService instance;
    private MailService() { }
    static {
        try {
            instance = new MailService();
        } catch (Exception e) {
            throw  new RuntimeException("Cannot create instance.");
        }
    }
    public  static  MailService getInstance() { return instance; }

    public void sendMail(String type) throws InterruptedException {
        String intro= "[" +  type + "]";
        System.out.println( intro + "Checking transaction...");
        Thread.sleep(2000);
        System.out.println( intro +"Sending payment mail...");
        Thread.sleep(1000);
        System.out.println( intro +"Thank you!");
    }
}
