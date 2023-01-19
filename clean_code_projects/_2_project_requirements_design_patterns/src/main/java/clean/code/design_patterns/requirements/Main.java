package clean.code.design_patterns.requirements;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("The volunteers should choose the preferred day for each activity until December, 10th.");

        ArrayList <Volunteer> list = new ArrayList<Volunteer>();
        ArrayList <String> name = new ArrayList<String>();

        Volunteer volunteerSarah = new VolunteerBuilder("Saturday", "Monday", "Friday", "Monday", "Tuesday")
                .setJoiningTheCarolChoir("Sunday")
                .setBeingSantasReindeer("Wednesday")
                .build();
        list.add(volunteerSarah);
        name.add("Sarah");

        Volunteer volunteerJake = new VolunteerBuilder("Monday", "Saturday", "Saturday", "Thursday", "Monday")
                .build();
        list.add(volunteerJake);
        name.add("Jake");

        Volunteer volunteerMariah = new VolunteerBuilder("Thursday", "Friday", "Sunday", "Sunday", "Friday")
                .setJoiningTheCarolChoir("Sunday")
                .setBeingSantasReindeer("Monday")
                .setDecoratingTheTree("Monday")
                .build();
        list.add(volunteerMariah);
        name.add("Mariah");

        Volunteer volunteerJenna = new VolunteerBuilder("Tuesday", "Sunday", "Tuesday", "Tuesday", "Wednesday")
                .setDecoratingTheTree("Monday")
                .build();
        list.add(volunteerJenna);
        name.add("Jenna");

        Volunteer volunteerMarcus = new VolunteerBuilder("Wednesday", "Tuesday", "Monday", "Wednesday", "Thursday")
                .setJoiningTheCarolChoir("Sunday")
                .setBeingSantasReindeer("Saturday")
                .build();
        list.add(volunteerMarcus);
        name.add("Marcus");

        Volunteer volunteerShawn = new VolunteerBuilder("Friday", "Thursday", "Wednesday", "Saturday", "Saturday")
                .setJoiningTheCarolChoir("Sunday")
                .setDecoratingTheTree("Monday")
                .build();
        list.add(volunteerShawn);
        name.add("Shawn");

        Volunteer volunteerEmma = new VolunteerBuilder("Sunday", "Wednesday", "Thursday", "Friday", "Sunday")
                .setJoiningTheCarolChoir("Sunday")
                .setBeingSantasReindeer("Friday")
                .setDecoratingTheTree("Monday")
                .build();
        list.add(volunteerEmma);
        name.add("Emma");

        System.out.println("\nUntil now, these volunteers will participate at:");

        System.out.println("\nThe Carol Choir:\n");

        for (int i = 0; i < list.size(); ++i) {
            if(list.get(i).getJoiningTheCarolChoir() != null)
                System.out.println(name.get(i));
        }

        System.out.println("\nBeing Santa's Reindeer for the day:\n");

        for (int i = 0; i < list.size(); ++i) {
            if(list.get(i).getBeingSantasReindeer() != null)
                System.out.println(name.get(i));
        }

        System.out.println("\nDecorating the Christmas Tree:\n");

        for (int i = 0; i < list.size(); ++i) {
            if(list.get(i).getDecoratingTheTree() != null)
                System.out.println(name.get(i));
        }

        System.out.println("\nThe lists are still open! Join us, to help the mothers and children from the Boston Center feel the Christmas joy.");

        for (int i = 0; i < 50; ++i)
            System.out.println();

        System.out.println("All the invites will receive special treatments, as will follow:\n");

        CandidateFactory candidatefactory = new CandidateFactory();
        Candidate one = candidatefactory.makeCandidate(550000000, "Selena Gomez");
        Candidate two = candidatefactory.makeCandidate(60000000, "Jennifer Aniston");
        Candidate three = candidatefactory.makeCandidate(45000000, "Noah Beck");
        Candidate four = candidatefactory.makeCandidate(18000000, "Madelyn Cline");
        Candidate five = candidatefactory.makeCandidate(20000000, "Neymar");
        Candidate six = candidatefactory.makeCandidate(30000000, "Margot Robbie");
        Candidate seven = candidatefactory.makeCandidate(700000000, "Cristiano Ronaldo");
        Candidate eight = candidatefactory.makeCandidate(100000000, "Shakira");
    }
}
