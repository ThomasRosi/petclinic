package be.heh.petclinic.component.vet;

import be.heh.petclinic.domain.Vet;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

class VetResultExtractor implements ResultSetExtractor<Vet> {
  @Override
  public Vet extractData(ResultSet rs) throws SQLException {
    Vet vet = new Vet(rs.getString("lastName"), rs.getString("firstName"), rs.getString("speciality"));
    return vet;
  }
}
