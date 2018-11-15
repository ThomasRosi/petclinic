package be.heh.petclinic.component.client;

import be.heh.petclinic.domain.Client;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

class ClientResultExtrator implements ResultSetExtractor<Client>{
    @Override
    public  Client extractData(ResultSet rs) throws SQLException {
        Client client = new Client(rs.getInt("id"),rs.getString("last_name"),rs.getString("first_name"),rs.getString("address"),rs.getString("city"),rs.getString("telephone"));
        return client;
    }
}