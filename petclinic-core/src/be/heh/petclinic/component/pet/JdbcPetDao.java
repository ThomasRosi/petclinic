package be.heh.petclinic.component.pet;

import be.heh.petclinic.domain.Pet;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.List;

class JdbcPetDao {
    private DataSource dataSource;

    JdbcPetDao(DataSource dataSource){
      this.dataSource = dataSource;
    }

    Collection<Pet> getPets(){
      JdbcTemplate select = new JdbcTemplate(dataSource);
      return select.query("SELECT p.name, p.birth_date, p.species, c.* FROM pets AS p JOIN clients AS c ON (p.clients_id = c.id)", new PetRowMapper());
    }

    Collection<Pet> getPetsClientID(int client_id){
      JdbcTemplate select = new JdbcTemplate(dataSource);
      return select.query("SELECT p.name, p.birth_date, p.species, c.* FROM pets AS p JOIN clients AS c ON (p.clients_id = "+client_id+")", new PetRowMapper());
      
    }
}
