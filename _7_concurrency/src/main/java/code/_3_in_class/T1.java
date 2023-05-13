package code._3_in_class;

public class T1 implements Runnable{


    @Override
    public void run() {
        try{

            Student.INSTANCE.setNotaEngleza(5);
            Thread.sleep(5*1_000);
            Student.INSTANCE.setNotaMatematica(10);
            Student.INSTANCE.setNotaInformatica(10);
            double medie =Student.INSTANCE.getMedie();
            System.out.println("T1: "+ medie);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
