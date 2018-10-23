package be.heh.petclinic.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VetTests {

    @Test
    public void test_object_vet(){
        be.heh.petclinic.domain.Vet vet =new be.heh.petclinic.domain.Vet("James","James","none");

        assertEquals("James",vet.getLastName());
        assertEquals("James",vet.getFirstName());
        assertEquals("none",vet.getSpeciality());
    }

}
