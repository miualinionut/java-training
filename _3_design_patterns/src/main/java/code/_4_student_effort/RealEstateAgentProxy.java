package code._4_student_effort;

public class RealEstateAgentProxy {

    Apartment[] apartments = new Apartment[10];
    Integer[] removedIndexes;

    void represent(Apartment apartment){
            //TODO: Implement represent
    }

    Apartment rent(Student student){
        Apartment returnedApp = null;
        int i;
        char firstLetter = student.name.charAt(0);
        if(firstLetter != 'P' || firstLetter != 'p'){
            for(i = 0; i < apartments.length; i++){
                if (student.money > apartments[i].monthlyRentCost && removedIndexes[i] != 1){
                    returnedApp = apartments[i];
                    removedIndexes[i] = 1;
                    return returnedApp;

                }
            }
        }

        return returnedApp;
    }
}
