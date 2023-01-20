package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Club> clubs=new ArrayList<>();
    public static void main(String[] args) {
        Club fcBarcelona= new Club();
        Club realMadrid=new Club();
        Club fcsb=new Club();
        Club dinamo=new Club();
        clubs.add(fcBarcelona);
        clubs.add(realMadrid);
        clubs.add(fcsb);
        clubs.add(dinamo);

        fcBarcelona.setName("FC Barcelona");
        fcBarcelona.setCoachName("Xavier Hernández Creus(Xavi)");
        fcBarcelona.setRecord(13,1,2);

        realMadrid.setName("Real Madrid CF");
        realMadrid.setCoachName("Carlo Ancelotti");
        realMadrid.setRecord(12,2,2);

        fcsb.setName("Steaua Bucuresti");
        fcsb.setCoachName("Leonard Strizu");
        fcsb.setRecord(11,5,5);

        dinamo.setName("Dinamo Bucuresti");
        dinamo.setCoachName("Marius Tomozei");
        dinamo.setRecord(7,6,3);

        System.out.println("Football clubs:");

        for(int i=0;i<clubs.size();i++)
        {
            System.out.println((i+1)+". "+ clubs.get(i).getName());
        }
        System.out.println("Which club are you interested in?");
        Scanner myInput=new Scanner(System.in);
        int team=myInput.nextInt();
        Club chosenTeam=clubs.get(team-1);
        System.out.println("Nume:"+ chosenTeam.getName());
        System.out.println("Nume antrenor: "+ chosenTeam.getCoachName());
        System.out.println("Victorii: "+ chosenTeam.getWins());
        System.out.println("Infrangeri: "+ chosenTeam.getLosses());
        System.out.println("Egaluri: "+ chosenTeam.getDraws());
    }
}
