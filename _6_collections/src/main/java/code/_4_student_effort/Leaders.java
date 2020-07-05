package code._4_student_effort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Leaders {
    List<Integer> arr;

    public Leaders() {
        arr = new ArrayList<>();
    }

    public Leaders(List<Integer> arr) {
        this.arr = arr;
    }

    public void insert(Integer element) {
        arr.add(element);
    }

    public void delete(Integer element) {
        arr.remove(element);
    }

/*
    arr:        9 8 5 0 7 4 3 6 1 => 9 8 7 6
    sorted_arr: 9 8 7 6 5 4 3 1 0

    Plec cu un for si merg pe ambele arrayuri( si cel sortat si cel nesortat)
    si decid daca numarul respectiv poate fi sau nu un leader:
    - primul din arr este 9
    - primul nr din sorted este tot 9 => este leader pentru ca nu poate fi ceva mai mare

    -al doilea din arr este 8
    -al doilea din sorted este tot 8, deci este in regula, poate fi un leader

    -al treilea din arr este 5
    -al treilea nu poate fi un leader deoarece exista 7, care este mai mare decat 5
    -merg la urmatorul pana cand gasesc numarul 7. Acesta este urmatorul leader

    -dupa ce ajung pe pozitia lui 7 in cel nesortat, pot sa continui in cel sortat

    -ajung la 7 si merg inca o pozitie pentru ca acesta este leader(merg la 4)
    -in array ul sortat ajung la 6, care este mai mare decat 4
    -deci trebuie sa caut in cel nesortat pozitia lui 6 si acesta va fi un leader

    !!-daca vreunul din aceste numere este ultima pozitie => algoritmul se termina

 */

    private boolean checkEnd(int i, int size) {
        return i >= size - 2;
    }

    public List<Integer> getAllLeaders() {
        List<Integer> leaders = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>(arr);
        sorted.sort(Comparator.reverseOrder());

        int i_arr = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (sorted.get(i) > arr.get(i_arr)) {
                while (!sorted.get(i).equals(arr.get(i_arr))) {
                    i_arr++;
                    if (checkEnd(i, arr.size())) {
                        break;
                    }
                }
            }
            leaders.add(sorted.get(i));
            if (checkEnd(i_arr, arr.size()))
                break;
            i_arr++;

        }
        leaders.add(arr.get(arr.size() - 1));
        return leaders;
    }

    public static void main(String[] args) {
        Leaders l = new Leaders();
        l.insert(3);
        l.insert(9);
        l.insert(2);
        l.insert(4);
        l.insert(8);
        l.insert(7);
        l.insert(6);

//        l.insert(9);
//        l.insert(8);
//        l.insert(5);
//        l.insert(0);
//        l.insert(7);
//        l.insert(4);
//        l.insert(3);
//        l.insert(6);
//        l.insert(1);

        List<Integer> leaders = l.getAllLeaders();

        for (Integer i : leaders) {
            System.out.print(i + " ");
        }

    }
}
