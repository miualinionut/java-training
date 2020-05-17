package code._4_student_effort.Challenge3;

public class GenericList<T> implements IGenericList<T> {

    private IGenericNode<T> radacina;

    public GenericList(T val) {
        this.radacina = new GenericNode<T>();
        radacina.setValue(val);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> aux= radacina;
        if(radacina==null){
          radacina=new GenericNode<T>();
          radacina.setValue(element);
        }
        else if(radacina!=null) {
            while (aux.getNext() != null) {

                aux = aux.getNext();
            }
            IGenericNode<T> elem = new GenericNode<T>();
            elem.setValue(element);
            aux.setNext(elem);
        }
    }

    @Override
    public void println() {
        IGenericNode<T> aux= radacina;
        while (aux.getNext() !=null){
            System.out.println(aux.getValue());
            aux=aux.getNext();
        }
    }
}
