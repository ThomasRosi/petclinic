package be.heh.petclinic.util;

public abstract class ComponentException extends RuntimeException {

    public ComponentException(String message, Throwable cause) {
        super(message, cause);
    }

}
