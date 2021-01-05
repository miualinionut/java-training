package clean.code.design_patterns.requirements.NullObjectPattern;

public class OmService {

    public static final String[] names = {"Cristi", "Andrei", "Ionut"};

    public static OmAbstract getOm(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)){
                return new Om(name);
            }
        }
        return new Animal();
    }

}
