package clean.code.design_patterns.requirements.Data;

import java.io.Serializable;
import java.util.ArrayList;

public class AllUsers implements Serializable {

    private ArrayList<Person> list;

    public AllUsers(ArrayList<Person> list){
        this.list = list;
    }

    public PersonTypes checkExistence(Person person){

        for (Person auxPer: list) {
            if(auxPer.getName().equals(person.getName())){
                if(auxPer.getPass().equals(person.getPass())){
                    return auxPer.getType();
                }
                return PersonTypes.BAD;
            }
        }

        return PersonTypes.NONEXISTENT;

    }

    public void add(Person person){
        list.add(person);
    }
}
