package be.heh.petclinic.component.client;

import be.heh.petclinic.util.ComponentException;

public class ClientException extends ComponentException {

    public ClientException(String message, Throwable cause){
        super(message,cause);
    }
}