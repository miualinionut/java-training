package clean.code.design_patterns.requirements.loop;

import clean.code.design_patterns.requirements.iterator.Schedule;
import clean.code.design_patterns.requirements.iterator.ScheduleIterator;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ApplicationLoop {
    // the instance of the application loop using Singleton design pattern
    private static ApplicationLoop instance;

    // task list that stores the user defined tasks
    private Schedule taskList = new Schedule();

    private ApplicationLoop() { loop(); }

    private void loop() {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("notes> ");
            String command = scanner.nextLine();

            if (command.equals("exit"))
                break;

            if (command.equals("add")) {
                try {
                    String title = input("title: ");
                    int type     = 0;
                    int duration = 0;

                    // handles the illegal input exception
                    try {
                        type     = Integer.parseInt(input("type: "));
                        duration = Integer.parseInt(input("duration: "));
                    } catch (Exception e) {
                        System.out.println("error encountered while trying to parse the integers. please try again\n");
                        continue;
                    }

                    if(input("do you want to add a timeframe to your task? yes/no: ").equals("no")) {
                        Task task = new Task.Builder(title, type, duration).build();
                        taskList.add(task);
                    }
                    else {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                        System.out.println("date format: dd.mm.yyyy hh:mm");

                        try {
                            Date startDate = sdf.parse(input("start date: "));
                            Date endDate   = sdf.parse(input("end date: "));

                            Task task = new Task.Builder(title, type, duration).setTimeframe(startDate, endDate).build();
                            taskList.add(task);

                        } catch (ParseException e) {
                            System.out.println("error encountered while parsing one of the dates. please try again\n");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println();
            }

            if (command.equals("print")) {
                print();
            }
        }
    }

    private String input(String message) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);

        return scanner.nextLine();
    }

    private void print() {
        System.out.println("your scheduled tasks:");

        ScheduleIterator iterator = taskList.iterator();

        int index = 1;
        while(iterator.hasNext()) {
            Task aux = iterator.next();

            if (aux.hasTimeframe()) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                String startingTime  = sdf.format(aux.getStartingTime());
                String endingTime    = sdf.format(aux.getEndingTime());

                String output = index + ". " + aux.getTitle() + ": " + aux.getDuration() + " minutes, (" + startingTime + " - " + endingTime + ")";
                System.out.println(output);
            }
            else {
                String output = index + ". " + aux.getTitle() + ": " + aux.getDuration() + " minutes ";
                System.out.println(output);
            }
            index++;
        }

        System.out.println();
    }

    // skeleton for object removal
    private void remove(int pos) {
        if(taskList.size() == 0)
            System.out.println("you don't have any tasks in your schedule to be removed\n");

        if(pos > taskList.size())
            System.out.println("requested position is out of bounds. task list size is " + taskList.size() + '\n');
    }

    // instance getter in Singleton Lazy Implementation design pattern
    public static ApplicationLoop getInstance() {
        if(instance == null)
            instance = new ApplicationLoop();

        return instance;
    }
}
