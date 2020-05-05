package code._3_in_class.AnotherThing;

public class Main {
    public static void main(String[] args) {

    }
    void m() throws ExceptiaMeaUnchecked01{

    }
}

interface InterfataMeaCuExceptii{
    void m() throws ExceptiaMeaUnchecked01;
}

class clasaInterfata implements InterfataMeaCuExceptii{
    @Override
    public void m() throws ExceptiaMeaUnchecked02 {  //se bazeaza pe polimorfism
        //pot sa arunce o execptie mai specifica decat cea prezentata in contract
    }
}

class ExceptiaMeaUnchecked01 extends RuntimeException{

}

class ExceptiaMeaUnchecked02 extends RuntimeException{
    private String mesaj="nu mere";
}

class ExceptiaMeaChecked extends Exception{

}