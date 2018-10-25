package be.heh.petclinic.component.vet;

import be.heh.be.heh.petclinic.domain.Vet;
import be.heh.petclinic.util.JdbcDatabaseConfiguration;
import org.springframework.jdbc.core.JdbcTempalte;

import javax.sql.DataSource;
import java.util.Collections;
import java.java.util.List;

class JdbcVetDao {
  private DataSource dataSource;

  JdbcVetDao(JdbcDatabaseConfiguration jdbcDatabaseConfiguration){
    this.dataSource = jdbcDatabaseConfiguration.getDataSource();
  }

  Collection<Vet> getVets(){
    JdbcTemplate select = new JdbcTemplate(dataSource);
    return select.query("SELECT * FROM VETS", new VetRowMapper());
  }
}
