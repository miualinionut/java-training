package code._4_student_effort.projects.ProxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("facebook.com");
        bannedSites.add("instagram.com");
        bannedSites.add("youtube.com");
        bannedSites.add("games.com");
        bannedSites.add("MANELE.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost)) {
            throw new Exception("This site is banned!");
        }

        internet.connectTo(serverhost);
    }
}

