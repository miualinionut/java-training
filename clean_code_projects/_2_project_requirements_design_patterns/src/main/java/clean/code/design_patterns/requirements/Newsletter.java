package clean.code.design_patterns.requirements;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//observer
public class Newsletter {
    private List<Subscriber> subscribers = new LinkedList<>();

    public static class Subscriber {

        private String nume;
        private String prenume;
        private String apelativ;
        private String email;

        public Subscriber(String prenume, String nume, String apelativ, String email) {
            this.nume = nume;
            this.prenume = prenume;
            this.apelativ = apelativ;
            this.email = email;
        }

        public String getNume() {
            return nume;
        }

        public String getPrenume() {
            return prenume;
        }

        public String getApelativ() {
            return apelativ;
        }

        public String getEmail() {
            return email;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public void setPrenume(String prenume) {
            this.prenume = prenume;
        }

        public void setApelativ(String apelativ) {
            this.apelativ = apelativ;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void update(String announcement) {
            System.out.println("S-a expediat un e-mail catre adresa " + email + " cu urmatorul continut:");
            System.out.println("Buna ziua, " + apelativ + " " + nume + " " + prenume);
            System.out.println(announcement);
        }

    }

    public void addObserver(Subscriber subscriber) {
        if (subscribers.parallelStream().filter(s -> s.email.toLowerCase().equals(subscriber.email.toLowerCase())).count() == 0) {
            subscribers.add(subscriber);
        }
    }

    public void removeObserver(String email) {
        subscribers = subscribers.parallelStream().filter(s -> !s.email.toLowerCase().equals(email.toLowerCase())).collect(Collectors.toList());
    }

    public void publishAnnouncement(String announcement) {
        subscribers.forEach(s -> s.update(announcement));
    }
}
