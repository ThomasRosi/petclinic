package be.heh.petclinic.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PetTests {

    @Test
    public void test_object_pet(){
        be.heh.petclinic.domain.Pet pet =new be.heh.petclinic.domain.Pet("Jack","James","Dog");

        assertEquals("Jack",pet.getName());
        assertEquals("James",pet.getOwner());
        assertEquals("Dog",pet.getBreed());
    }

}
