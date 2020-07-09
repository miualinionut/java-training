package code._4_student_effort;

import java.util.*;

public class Challenge4 {

    // varianta 1, in care se modifica in mod complet ordinea elemntelor
    public static List<Integer> arrange(List<Integer> input){
        List<Integer> result = new ArrayList<>();
        Comparator<Integer> asc = (x1,x2) -> x1-x2;
        input.sort(asc);

        Deque<Integer> ascSorted = new LinkedList<>();
        for(int i = 0; i < input.size(); i++){
            ascSorted.addLast(input.get(i));
        }

        for(int i = 0; i < input.size(); i = i+2){
           if(!ascSorted.isEmpty()) result.add(i,ascSorted.removeFirst());
           if(!ascSorted.isEmpty()) result.add(i+1, ascSorted.removeLast());
        }

        return result;
    }

    //varianta 2, in care nu modificam complet oridnea elementelor
    public static List<Integer> arrangeVar2(List<Integer> input){
        List<Integer> result = new ArrayList<>(input);
        boolean smaller = true; //trebuie sa facem <, iar daca e fals, trebuie sa facem >
        int aux = 0;

        for(int i = 0; i < input.size() - 1; i++){
            if(smaller){
                if(result.get(i) > result.get(i+1)){
                    aux = result.get(i);
                    result.set(i,result.get(i+1));
                    result.set(i+1, aux);
                }
            }
            else{
                if(result.get(i) < result.get(i+1)){
                    aux = result.get(i);
                    result.set(i,result.get(i+1));
                    result.set(i+1, aux);
                }
            }
            smaller = !smaller;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4,3,7,8,6,2,1));
        List<Integer> arrangedList = arrange(list);
        List<Integer> arrangedList2 = arrangeVar2(Arrays.asList(4,3,7,8,6,2,1));

        for(Integer item : arrangedList){
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("Varianta a 2a: ");
        for(Integer item : arrangedList2){
            System.out.print(item + " ");
        }

    }
}
