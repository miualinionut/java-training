public abstract class Payment {
    private MailService mail;

    public Payment() {
        this.mail = MailService.getInstance();
    }
    public void pay () {
    }

    public void sendMail(String type) {

        try {
            mail.sendMail(type);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
