package clean.code.design_patterns.requirements;

public class OmFactory {
    public Om getOm(String type){
        if(type == null)
            return new OmCareNuExista();
        else {
            switch (type) {
                case "A" : return new OmA();
                case "B" : return new OmB();
                case "C" : return new OmC();
                default : return new OmCareNuExista();
            }
        }

    }
}
