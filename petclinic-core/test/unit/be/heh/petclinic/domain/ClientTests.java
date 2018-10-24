package be.heh.petclinic.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClientTests {

    @Test
    public void test_object_client(){
        be.heh.petclinic.domain.Client client = new be.heh.petclinic.domain.Client("Richard","James","Mons","test@test.test","06");

        assertEquals("Richard",client.getLastName());
        assertEquals("James",client.getFirstName());
        assertEquals("Mons",client.getAddress());
        assertEquals("test@test.test",client.getEmail());
        assertEquals("06",client.getPhonenumber());
    }

}
