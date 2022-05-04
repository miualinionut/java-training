package clean.code.design_patterns.requirements;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

// SINGLETON + OBSERVER

public class Memo {
    //SINGLETON COMPONENT - creational
    private static final Memo SINGLETON = new Memo();
    private Memo(){}
    public static Memo theInstance(){
        return SINGLETON;
    }

    private List<Member> members = new LinkedList<>();

    //OBSERVER COMPONENT - behavioural

    public static class Member {
        private String firstName;
        private String lastName;
        private String eMail;

        public Member(String firstName, String lastName, String eMail){
            this.firstName = firstName;
            this.lastName = lastName;
            this.eMail = eMail;
        }

        public void post(String message){
            System.out.println(firstName + " " + lastName + ", we haven't seen you in a while.");
            System.out.println("You should check our new discounts on shorts and denim jackets!");
            System.out.println(message);
        }

        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public String getEMail(){
            return eMail;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public void seteMail(String eMail){
            this.eMail = eMail;
        }

    }

    public void addMember(Member member){
        if(members.parallelStream().filter(x -> x.eMail.equalsIgnoreCase(member.eMail)).count() == 0)
            members.add(member);
    }

    public void removeMember(String eMail){
        members = members.parallelStream().filter(x -> !x.eMail.toLowerCase(Locale.ROOT).equalsIgnoreCase(eMail)).collect(Collectors.toList());
    }

    public void postMessage(String message){
        members.forEach(x -> x.post(message));
    }
}
