package code._4_student_effort;

public class PairOf3 {
    public static void main(String[] args) {
        int[] numere = {-1, -1, -1, 2, -2, 3};
        int[] pozitiFolosite = new int[numere.length];
        int nrElementeFolosite = 0;
        boolean folosit;
        int numarPerechi = 0;
        for(int i = 0; i < numere.length - 2; i++){
            for(int j = i + 1; j < numere.length - 1; j++){
                for(int l = j +1; l < numere.length; l++){
                    folosit = false;
                    for(int k = 0; k< nrElementeFolosite; k++){
                        if (pozitiFolosite[k] == i || pozitiFolosite[k] == j || pozitiFolosite[k] == l) {
                            folosit = true;
                            break;
                        }
                    }
                    if(!folosit && numere[i] + numere[j] + numere[l] == 0){
                        pozitiFolosite[nrElementeFolosite] = i;
                        nrElementeFolosite++;
                        pozitiFolosite[nrElementeFolosite] = j;
                        nrElementeFolosite++;
                        pozitiFolosite[nrElementeFolosite] = l;
                        numarPerechi++;
                    }
                }
            }
        }
        System.out.println(numarPerechi);
    }
}
