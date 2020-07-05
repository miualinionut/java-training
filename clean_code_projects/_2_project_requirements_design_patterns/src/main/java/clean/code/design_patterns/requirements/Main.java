package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        //tema proiectului este o biblioteca
        //ma folosesc de singleton pentru management-ul bibliotecii
        //pentru a adauga carti in biblioteca ma folosesc de un builder
        Biblioteca b=Biblioteca.getInstance();
        b.addcarte("Doi ani de vacanta", "Jules Verne");
        if(b.imprumut("Doi ani de vacanta", "Jules Verne","22/07/2020")==1) System.out.println("S-a impumutat cartea cu succes");
        else System.out.println("Nu e disponibila nicio carte cu datele introduse");
        b.search("Doi ani de vacanta", "Jules Verne");
        if(b.imprumut("Doi ani de vacanta", "Jules Verne","29/07/2020")==1) System.out.println("S-a impumutat cartea cu succes");
        else System.out.println("Nu e disponibila nicio carte cu datele introduse");
        b.returnare("Doi ani de vacanta", "Jules Verne");
        b.search("Doi ani de vacanta", "Jules Verne");
        if(b.imprumut("Doi ani de vacanta", "Jules Verne","29/07/2020")==1) System.out.println("S-a impumutat cartea cu succes");
        else System.out.println("Nu e disponibila nicio carte cu datele introduse");

    }
}
