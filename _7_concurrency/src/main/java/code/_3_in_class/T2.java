package code._3_in_class;

public class T2 implements Runnable {

    @Override
    public void run() {
        try{

            Student.INSTANCE.setNotaEngleza(3);

            Student.INSTANCE.setNotaMatematica(10);
            Student.INSTANCE.setNotaInformatica(10);
            double medie =Student.INSTANCE.getMedie();
            System.out.println("T2: "+ medie);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
