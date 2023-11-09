package clean.code.design_patterns.requirements;

//Interfața Iterator definește metodele hasNext() și next()
// pentru verificarea existenței unui obiect urmator(de tipul jucatorFotbal)
// și pentru a obține elementul următor din iterație.
public interface Iterator<jucatorFotbal>{
    boolean hasNext();
    jucatorFotbal next();
}
