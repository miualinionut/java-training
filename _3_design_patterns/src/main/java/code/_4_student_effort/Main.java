package code._4_student_effort;

import code._4_student_effort._1_iterator.ArrayCustomIterator;
import code._4_student_effort._2_strategy.BubbleSort;
import code._4_student_effort._2_strategy.MergeSort;
import code._4_student_effort._2_strategy.SortingStrategy;
import code._4_student_effort._3_proxy.Apartment;
import code._4_student_effort._3_proxy.RealEstateAgentProxy;
import code._4_student_effort._3_proxy.Student;
import code._4_student_effort._4_observer.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //challenge 1 test
        testIterator();

        //challenge 2 test
        testStrategy();

        //challenge 3 test
        testProxy();

        //challenge 4 test
        testObserver();

        //challenge 5 test
        testTemplateMethod();

        //challenge 6 test
        testBuilder();

        //challenge HARD 1 test
        testDecorations();

        //challenge HARD 2 test
        testDrinkingTime();
    }

    private static void testIterator(){
        int[] ints = new int[]{1,2,3};
        List<Integer> testList = new ArrayList<>();
        ArrayCustomIterator it = new ArrayCustomIterator(ints);
        while(it.hasNext()) {
            testList.add(it.next());
        }
        assert testList.toString().equals("[1, 2, 3]");
    }

    private static void testStrategy(){
        Integer[] unorderedMergeList = new Integer[]{3, 6, 4, 1, 5, 2};
        Integer[] unorderedBubbleList = new Integer[]{3, 6, 4, 1, 5, 2};
        Integer[] orderedList = new Integer[]{1, 2, 3, 4, 5, 6};
        displaySorted(new BubbleSort(), unorderedBubbleList);
        displaySorted(new MergeSort(), unorderedMergeList);
        assert Arrays.equals(orderedList, unorderedBubbleList);
        assert Arrays.equals(orderedList, unorderedMergeList);

    }

    public static void displaySorted(SortingStrategy strategy, Integer[] list){
        strategy.sort(list);
        for(Integer integer:list)
            System.out.println(integer);
    }

    public static void testProxy(){
        Student studentValid1 = new Student("Alex", 250);
        Student studentValid2 = new Student("Andrei", 300);
        Student studentInvalid = new Student("Parizer", 100);
        Student studentBroke = new Student("Gioni", 10);

        Apartment apartment1 = new Apartment("Africa", 50);
        Apartment apartment2 = new Apartment("America", 245);
        Apartment apartment3 = new Apartment("Germany", 235);
        Apartment apartment4 = new Apartment("Cluj-Napoca", 1500);

        RealEstateAgentProxy agentProxy = new RealEstateAgentProxy();
        agentProxy.represent(apartment1, apartment2, apartment3, apartment4);

        assert agentProxy.rent(studentInvalid) == null;
        assert agentProxy.rent(studentBroke) == null;
        assert agentProxy.rent(studentValid1).toString().equals("Apartment{location='Africa', monthlyRentCost=50}");
        assert agentProxy.rent(studentValid2).toString().equals("Apartment{location='America', monthlyRentCost=245}");


    }

    public static void testObserver(){
        List<String> history = new ArrayList<>();
        code._4_student_effort._4_observer.Student student1 = new code._4_student_effort._4_observer.Student("Jimmy");
        code._4_student_effort._4_observer.Student student2 = new code._4_student_effort._4_observer.Student("Johnny");
        code._4_student_effort._4_observer.Student student3 = new code._4_student_effort._4_observer.Student("Jaxy");

        Teacher teacher = new Teacher();

        teacher.register(student1, student2, student3);
        history.add(teacher.notifyObservers("Azi e joi"));
        teacher.unregister(student1,student3);
        history.add(teacher.notifyObservers("Where did everyone go?..."));

        assert history.size() == 2;
        assert history.toString().equals("[Student Jimmy was notified: Azi e joi " +
                "Student Johnny was notified: Azi e joi " +
                "Student Jaxy was notified: Azi e joi, " +
                "Student Johnny was notified: Where did everyone go?...] ");
    }

    public static void testTemplateMethod(){
    }

    public static void testBuilder(){

    }

    public static void testDecorations(){}

    public static void testDrinkingTime(){}
}
