package be.heh.petclinic.component.pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import javax.sql.DataSource;

import be.heh.petclinic.domain.*;
import be.heh.petclinic.component.pet.*;
import be.heh.petclinic.util.ComponentException;

class PetComponentImpl implements PetComponent {

    private JdbcPetDao petDao;

    PetComponentImpl(DataSource dataSource){
      this.petDao = new JdbcPetDao(dataSource);
    }

    @Override
    public Collection<Pet> getPets() {
      try{
        Collection<Pet> pets = petDao.getPets();
        return pets;
      } catch (Exception e){
        PetException pe = new PetException("Error while loading pets", e);
        throw pe;
      }
    }

    @Override
    public Collection<Pet> getPetsBySpecies(String species){
      try{
        Collection<Pet> pets = petDao.getPets();
        for (Pet pet : pets) {
          if(!pet.getSpecies().equals(species)){
            pets.remove(pet);
          }
        }
        return pets;
      } catch (Exception e){
        PetException pe = new PetException("Error while loading pets", e);
        throw pe;
      }
    }

    @Override
    public Collection<Pet> getPetsByClient(Client client){
      try{
        Collection<Pet> pets = petDao.getPets();
        for (Pet pet : pets) {
          if(!pet.getClient().equals(client)){
            pets.remove(pet);
          }
        }
        return pets;
      } catch (Exception e){
        PetException pe = new PetException("Error while loading pets", e);
        throw pe;
      }
    }
}
