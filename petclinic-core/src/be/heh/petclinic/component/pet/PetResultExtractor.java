package be.heh.petclinic.component.pet;

import be.heh.petclinic.domain.*;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

class PetResultExtractor implements ResultSetExtractor<Pet> {
  @Override
  public Pet extractData(ResultSet rs) throws SQLException {
    Client client = new Client(rs.getString("c.last_name"), rs.getString("c.first_name"), rs.getString("c.address"), rs.getString("c.city"), rs.getString("c.telephone"));
    Pet pet = new Pet(rs.getString("p.name"), rs.getString("p.birth_date"), rs.getString("p.species"), client);
    return pet;
  }
}
