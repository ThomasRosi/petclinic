package be.heh.petclinic.component.pet;

import be.heh.petclinic.domain.Pet;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

class PetResultExtractor implements ResultSetExtractor<Pet> {
  @Override
  public Pet extractData(ResultSet rs) throws SQLException {
    Pet pet = new Pet(rs.getString("name"), rs.getString("owner"), rs.getString("breed"));
    return pet;
  }
}
