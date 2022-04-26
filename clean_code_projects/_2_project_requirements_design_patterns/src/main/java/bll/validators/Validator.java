package bll.validators;

/**
 * This interface represents the main validator - a contract for the classes that implements this interface
 * and have to implement the method validate() for it's purpose in the object validation
 */

public interface Validator <T>{
    public void validate(T t);
}
