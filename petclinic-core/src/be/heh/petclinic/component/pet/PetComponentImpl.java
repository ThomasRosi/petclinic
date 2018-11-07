package be.heh.petclinic.component.pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import javax.sql.DataSource;

import be.heh.petclinic.domain.Pet;
import be.heh.petclinic.component.pet.*;
import be.heh.petclinic.util.ComponentException;

class PetComponentImpl implements PetComponent {

    private JdbcPetDao petDao;

    PetComponentImpl(DataSource dataSource){
      this.petDao = new JdbcPetDao(dataSource);
    }

    @Override
    public Collection<Pet> getPets() {
      //List<Pet> pets = new ArrayList<>();
      //pets.add(new Pet("Jack","James","Dog"));
      //pets.add(new Pet("Felix","Helen","Cat"));
      //pets.add(new Pet("Maurice","Linda","Fish"));
      try{
        Collection<Pet> pets = petDao.getPets();
        return pets;
      } catch (Exception e){
        PetException pe = new PetException("Error while loading pets", e);
        throw pe;
      }
    }
}
