package code._4_student_effort.projects.ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();
        try
        {
            internet.connectTo("google.com");
            internet.connectTo("MANELE.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

