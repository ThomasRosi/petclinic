package be.heh.petclinic.component.pet;

import be.heh.petclinic.domain.Pet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

class PetRowMapper implements RowMapper<Pet> {

  @Override
  public Pet mapRow(ResultSet rs, int line) throws SQLException {
    PetResultExtractor extractor = new PetResultExtractor();
    return extractor.extractData(rs);
  }
}
