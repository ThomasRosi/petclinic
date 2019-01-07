package be.heh.petclinic.component.client;

import be.heh.petclinic.domain.Client;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

class ClientRowMapper implements RowMapper<Client>{

    @Override
    public Client mapRow(ResultSet rs, int line) throws SQLException{
        ClientResultExtrator extrator = new ClientResultExtrator();
        return extrator.extractData(rs);
    }
}