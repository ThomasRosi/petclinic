package be.heh.petclinic.component.client;

import be.heh.petclinic.domain.Client;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.List;

class JdbcClientDao {
    private DataSource datasource;

    JdbcClientDao(DataSource dataSource){
        this.datasource = dataSource;
    }

    Collection<Client> getClients(){
        JdbcTemplate select = new JdbcTemplate(datasource);
        return select.query("SELECT * FROM clients", new ClientRowMapper());
    }
}
