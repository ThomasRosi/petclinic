package be.heh.petclinic.component.pet;

import be.heh.petclinic.domain.*;

import java.util.Collection;

public interface PetComponent{

    Collection<Pet> getPets();

    Collection<Pet> getPetsBySpecies(String species);

    Collection<Pet> getPetsByClient(Client client);

}
