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
        Collection<Pet> response = new ArrayList<Pet>();
        for (Pet pet : pets) {
          if(pet.getSpecies().toString().equals(species)){
            response.add(pet);
          }
        }
        return response;
      } catch (Exception e){
        PetException pe = new PetException("Error while loading pets", e);
        throw pe;
      }
    }

    @Override
    public Collection<Pet> getPetsByClient(int client_id){
      try{
        Collection<Pet> pets = petDao.getPetsClientID(client_id);
        Collection<Pet> response = new ArrayList<Pet>();
        for (Pet pet : pets) {
          if(pet.getClient().getClientID().equals(client_id)){
            response.add(pet);
          }
        }
        return response;
      } catch (Exception e){
        PetException pe = new PetException("Error while loading pets", e);
        throw pe;
      }
    }
}
