package code._4_student_effort.Command;

//Soluție software folosita de un laborator medical pentru a gestiona cererile privind analiza
      // unor mostre de material biologic (analize de sânge). Laboratorul primește de la diferite cabinete
       // medicale cererile privind realizarea de diferite analize, pe care le salvează într-o colecție. Analizele sunt
       // realizate de diferite departamente medicale ce au echipamente speciale pentru fiecare tip de analiza.
       // Laboratoarele solicita aceste analize indicand tipul lor și numele pacientului conform interfeței
        //ISolicitareAnaliza. În momentul în care o solicitare de analiză este înregistrată în sistem, aceasta este
       // asociată departamentului specializat în acel tip de analiză. În momentul în care este obținut rezultatul
        //analizei, departamentul care a procesat analiza va trimite rezultatul pe email-ul pacientului (email-ul și
       // numele pacientului sunt înregistrate în solicitare). Având în vedere contextul actual, laboratorul va realiza
        //cu prioritate testele de tip COVID, însă toate analizele vor fi procesate la un moment dat (și nici o
       // solicitare nu va fi pierdută).
       // Se implementeaza modulul care permite gestiunea eficientă a cozii de solicitări de analize, având în
       // vedere și prioritatea testelor de tip COVID.
        //Pattern-ul este testat în main() prin crearea a cel puțin 4-5 cereri de analize de diferite tipuri, dintre care
        //cel puțin 2 să fie de tip COVID. Să exemplifice situația în care laboratorul va procesa cel puțin 3 analize
        //din coadă, printre care trebuie sa se regaseasca cele prioritare (COVID) indiferent de ordinea în care
       // acestea au fost înregistrate inițial.




public class Program {
    public static void main(String[] args) {
        GestiuneAnalize spital = new GestiuneAnalize();

        spital.inregistrareAnalizaNoua("Corina", "asafa@gmail.com", TipAnaliza.COVID);
        spital.inregistrareAnalizaNoua("Marius", "bxzbzx@gmail.com", TipAnaliza.COLESTEROL);
        spital.inregistrareAnalizaNoua("Andrei", "asafa@gmail.com", TipAnaliza.DEFICIT_VITAMINE);
        spital.inregistrareAnalizaNoua("Mariua", "maria@gmail.com", TipAnaliza.COVID);
        spital.inregistrareAnalizaNoua("Kevin", "asafa@gmail.com", TipAnaliza.COLESTEROL);

        spital.executaAnaliza();
        spital.executaAnaliza();
        spital.executaAnaliza();
        spital.executaAnaliza();
        spital.executaAnaliza();
    }

}
