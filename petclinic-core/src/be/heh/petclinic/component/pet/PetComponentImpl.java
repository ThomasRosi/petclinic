package be.heh.petclinic.component.pet;

import java.util.ArrayList;
import java.util.List;

import be.heh.petclinic.domain.*;

public class PetComponentImpl implements PetComponent {

    private List<Pet> pets = new ArrayList<>();

    @Override
    public List<Pet> getPets() {
      pets.add(new Pet("Jack","James","Dog"));
      pets.add(new Pet("Felix","Helen","Cat"));
      pets.add(new Pet("Maurice","Linda","Fish"));

      return pets;
    }
}
