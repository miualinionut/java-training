package code._4_student_effort.projects.ProxyDesignPattern;

public class RealInternet implements Internet
{
    @Override
    public void connectTo(String serverhost)
    {
        System.out.println("Redirecting to "+ serverhost);
    }
}
