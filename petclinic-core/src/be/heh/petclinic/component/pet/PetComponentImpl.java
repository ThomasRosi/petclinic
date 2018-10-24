package be.heh.petclinic.component.pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import be.heh.petclinic.domain.*;

class PetComponentImpl implements PetComponent {

    private List<Pet> pets = new ArrayList<>();

    @Override
    public Collection<Pet> getPets() {
      pets.add(new Pet("Jack","James","Dog"));
      //pets.add(new Pet("Felix","Helen","Cat"));
      //pets.add(new Pet("Maurice","Linda","Fish"));

      return pets;
    }
}
