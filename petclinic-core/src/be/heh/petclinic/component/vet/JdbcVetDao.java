package be.heh.petclinic.component.vet;

import be.heh.petclinic.domain.Vet;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.List;

class JdbcVetDao {
  private DataSource dataSource;

  JdbcVetDao(DataSource dataSource){
    this.dataSource = dataSource;
  }

  Collection<Vet> getVets(){
    JdbcTemplate select = new JdbcTemplate(dataSource);
    return select.query("SELECT v.first_name, v.last_name, s.name FROM vets AS v JOIN vet_specialties AS vs ON (v.id = vs.vet_id) JOIN specialties AS s ON (s.id = vs.specialty_id)", new VetRowMapper());
  }
}
