package code._4_student_effort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        //Code challenge 1

        /*int[] arr = new int[] {1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        //----------------------------------------------------------------------

        //Code Challenge 2

        /*Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01OfArr = Arrays.copyOf(arr,arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr,arr.length);

        displaySorted2(new BubleSort(), copy01OfArr);
        displaySorted2(new MergeSort(), copy02OfArr);*/

        //Code Challenge 3

        //incomplet

        //Code challenge 4

        /*Teacher teacher = new Teacher();
        Student_4_observer s01 = new Student_4_observer("Popescu");
        Student_4_observer s02 = new Student_4_observer("Ionescu");
        Student_4_observer s03 = new Student_4_observer("Dragomirescu");
        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);
        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };
        for(int i=0;i<javaTopics.length;i++){
            teacher.teach(javaTopics[i]);
        }*/

        //Code Challenge 5

        /*Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01OfArr = Arrays.copyOf(arr,arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr,arr.length);

        AscBubleSort asc =new AscBubleSort();
        asc.sort(copy01OfArr);
        DescBubleSort desc = new DescBubleSort();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);*/


        //Code Challenge 6

        /*Person person = new Person.Builder("Vlad").setIsMarried(false).setDrivingLicense(true).setUniversity("Romanian-American University").build();
        System.out.println(person.name.toString());
        System.out.println(person.isMarried.toString());
        System.out.println(person.university.toString());
        System.out.println(person.drivingLicense.toString());*/

    }

    public static void displaySorted(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void displaySorted2(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
