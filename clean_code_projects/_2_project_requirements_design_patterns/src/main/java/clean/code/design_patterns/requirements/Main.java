package clean.code.design_patterns.requirements;

import java.util.*;

public class Main {

    public static Client[] getData(){
        Subscription employeeSubscription = new Subscription.Builder("employeeSubscription")
                .duration(365)
                .price(0)
                .access("unlimited")
                .build();
        Subscription yearlySubscription = new Subscription.Builder("yearlySubscription")
                .duration(365)
                .price(1100)
                .access("unlimited")
                .build();
        Subscription monthlySubscription = new Subscription.Builder("monthlySubscription")
                .duration(30)
                .price(100)
                .access("unlimited")
                .build();
        Subscription weeklySubscription = new Subscription.Builder("weeklySubscription")
                .duration(7)
                .price(30)
                .access("unlimited")
                .build();
        Subscription oneDayTrial = new Subscription.Builder("oneDayTrial")
                .duration(1)
                .price(0)
                .access("unlimited")
                .build();
        Subscription limitedYearlySubscription = new Subscription.Builder("limitedYearlySubscription")
                .duration(365)
                .price(900)
                .access("before 16:00 PM")
                .build();
        Subscription limitedMonthlySubscription = new Subscription.Builder("limitedMonthlySubscription")
                .duration(30)
                .price(80)
                .access("before 16:00 PM")
                .build();
        Subscription limitedWeeklySubscription = new Subscription.Builder("limitedWeeklySubscription")
                .duration(7)
                .price(20)
                .access("before 16:00 PM")
                .build();

        Client client01 = new Client.Builder("Popescu Ciprian")
                .phoneNumber("0712442201")
                .status("student")
                .subscription(limitedMonthlySubscription)
                .build();
        Client client02 = new Client.Builder("Rusu Daniel")
                .phoneNumber("0788891242")
                .status("coach")
                .subscription(employeeSubscription)
                .build();
        Client client03 = new Client.Builder("Roman Vlad")
                .phoneNumber("0754231267")
                .status("adult")
                .subscription(yearlySubscription)
                .build();
        Client client04 = new Client.Builder("Tanase Iuliana")
                .phoneNumber("07892312788")
                .status("adult")
                .subscription(limitedYearlySubscription)
                .build();
        Client client05 = new Client.Builder("Badea Alexandra")
                .phoneNumber("0743215830")
                .status("student")
                .subscription(weeklySubscription)
                .build();
        Client client06 = new Client.Builder("Georgescu Radu")
                .phoneNumber("0721412124")
                .status("student")
                .subscription(limitedWeeklySubscription)
                .build();
        Client client07 = new Client.Builder("Stoica Octavian")
                .phoneNumber("0744231297")
                .status("student")
                .subscription(yearlySubscription)
                .build();
       Client[] clientsDatabase = new Client[]{client01,client02,client03,client04,client05,client06,client07};
       return clientsDatabase;
    }

    public static void printTheMostBoughtSubscription(Client[] clientsDatabase){
        Map<String, Integer> subscriptionMap = new HashMap<>();
        for(int i =0; i< clientsDatabase.length;i++) {
            if (subscriptionMap.containsKey(clientsDatabase[i].getSubscription().getType())) {
                subscriptionMap.put(clientsDatabase[i].getSubscription().getType(), (subscriptionMap.get(clientsDatabase[i].getSubscription().getType()) + 1));
            } else {
                subscriptionMap.put(clientsDatabase[i].getSubscription().getType(), 1);
            }
        }

            int temp =0;
            String type = null;
            for(int i = 0; i < clientsDatabase.length; i++){
                if(temp<subscriptionMap.get(clientsDatabase[i].getSubscription().getType())){
                    temp = subscriptionMap.get(clientsDatabase[i].getSubscription().getType());
                    type = clientsDatabase[i].getSubscription().getType();
                }
            }
        System.out.println("The most bought subscription is " + type + " which was bought by " + temp + " customers");
    }
    public static void printMostFrequentStatusOfClients(Client[] clientsDatabase){
        Map<String, Integer> subscriptionMap = new HashMap<>();
        for(int i =0; i< clientsDatabase.length;i++) {
            if (subscriptionMap.containsKey(clientsDatabase[i].getStatus())) {
                subscriptionMap.put(clientsDatabase[i].getStatus(), (subscriptionMap.get(clientsDatabase[i].getStatus()) + 1));
            } else {
                subscriptionMap.put(clientsDatabase[i].getStatus(), 1);
            }
        }

        int temp =0;
        String type = null;
        for(int i = 0; i < clientsDatabase.length; i++){
            if(temp<subscriptionMap.get(clientsDatabase[i].getStatus())){
                temp = subscriptionMap.get(clientsDatabase[i].getStatus());
                type = clientsDatabase[i].getStatus();
            }
        }
        System.out.println("The most common customer type is " + type + " the number being " + temp);

    }
    public static void printNamesOfTheCoaches(){
        for(Client client : getData()){
            if(client.getStatus().equals("coach"))
                System.out.println(client.getName());
        }
    }
    public static void main(String[] args) {
        printNamesOfTheCoaches();
        printTheMostBoughtSubscription(getData());
        printMostFrequentStatusOfClients(getData());
    }
}
