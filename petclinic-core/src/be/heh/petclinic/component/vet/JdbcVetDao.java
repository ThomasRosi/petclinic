package be.heh.petclinic.component.vet;

import be.heh.petclinic.domain.Vet;
import be.heh.petclinic.util.JdbcDatabaseConfiguration;
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
    return select.query("SELECT * FROM VETS", new VetRowMapper());
  }
}
