package code._4_student_effort;

public class PairOf2 {
    public static void main(String[] args) {
    int[] numere = {5,9,-5,7,-5};
    int[] pozitiiFolosite = new int[numere.length];
    int nrElementeFolosite = 0;
    boolean folosit;
    int numarPerechi = 0;
        for (int i = 0; i < numere.length - 1; i++) {
            for (int j = i + 1; j < numere.length; j++) {
                folosit = false;
                for(int k = 0; k < nrElementeFolosite; k++) {
                    if (pozitiiFolosite[k] == i || pozitiiFolosite[k] == j)
                        folosit = true;
                }
                    if(!folosit && numere[i] + numere[j] == 0){
                        pozitiiFolosite[nrElementeFolosite] = i;
                        nrElementeFolosite++;
                        pozitiiFolosite[nrElementeFolosite] = j;
                        nrElementeFolosite++;
                        numarPerechi++;
                    }
            }
        }
    System.out.println(numarPerechi);
    }
}
