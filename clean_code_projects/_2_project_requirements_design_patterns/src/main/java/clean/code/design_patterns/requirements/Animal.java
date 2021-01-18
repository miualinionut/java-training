package clean.code.design_patterns.requirements;


//Factory Design Pattern


public interface Animal {

    void ComeHere();
    void Sit();
}

class DogRex implements Animal {

    @Override
    public void ComeHere() {
        System.out.println("Come Here Rex");
    }

    @Override
    public void Sit() {
        System.out.println("Sit There Rex");
    }
}



class CatFluff implements Animal {

    @Override
    public void ComeHere() {
        System.out.println("Come Here Fluff");
    }

    @Override
    public void Sit() {
        System.out.println("Sit There Fluff");

    }

}
class FactoryAnimal {


    public Animal SelectAnimal(String type){


        if("DogRex".equals(type)) {
            return new DogRex();

        }
        else if ("CatFluff".equals(type)) {
            return new CatFluff();
        }

return null;

}

}