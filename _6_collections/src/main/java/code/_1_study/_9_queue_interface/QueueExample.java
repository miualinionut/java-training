package code._1_study._9_queue_interface;

import java.util.*;

public class QueueExample {

  public static void main(String[] args) {
    Queue<Integer> queue01 = new PriorityQueue<>(); //capacity-restricted queue - backed by array
    Queue<Integer> queue02 = new LinkedList<>(); //backed by double linked list

    for (int i = 0; i < 10; i++) {
      queue01.add(i); //in case of no more space in the queue will throw IllegalStateException
      queue02.add(i);

      queue01.offer(i); //in case of no more space in the queue will return false
      queue02.offer(i);
    }

    Integer head = queue01.remove(); //will return and remove the head of the queue; throws an exception if this queue is empty.
    Integer newHead = queue01.poll(); //will return and remove the head of the queue; returns null if empty


    List<Student> list = new ArrayList<>();
    list.add(new Student("nelu", 1.9d, 6.0d));
    list.add(new Student("gigi", 1.75d, 9.3d));
    list.add(new Student("vasi", 1.6d, 8.6d));
    list.add(new Student("popa", 1.83d, 9.8d));

    display(heapSortUsingPriorityQueue(list, new StudentNameComparator()));
    display(heapSortUsingPriorityQueue(list, new StudentHeightComparator()));
    display(heapSortUsingPriorityQueue(list, new StudentGradeComparator()));
  }

  static void display(List<Student> list) {
    System.out.println("-------------");
    for (Student s : list) System.out.println(s);
  }

  static List<Student> heapSortUsingPriorityQueue(List<Student> list, Comparator<Student> comparator) {
    Queue<Student> queue = new PriorityQueue<>(comparator);
    for (Student s : list) queue.offer(s);

    List<Student> sortedList = new ArrayList<>();
    while (!queue.isEmpty()) sortedList.add(queue.remove());
    Iterator<Student> iterator = queue.iterator();
    //while(iterator.hasNext()) sortedList.add(iterator.next()); //queue iterator is not guaranteed to traverse elements in any particular order

    return sortedList;
  }

  static class Student {
    public String name;
    public Double height;
    public Double grade;

    public Student(String name, Double height, Double grade) {
      this.name = name;
      this.height = height;
      this.grade = grade;
    }

    @Override
    public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", height=" + height +
              ", grade=" + grade +
              '}';
    }
  }

  static class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
      return o1.name.compareTo(o2.name);
    }
  }

  static class StudentGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
      return o1.grade.compareTo(o2.grade);
    }
  }

  static class StudentHeightComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
      return o1.height.compareTo(o2.height);
    }
  }
}


