package be.heh.petclinic.component.client;

import be.heh.petclinic.domain.Client;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

class ClientResultExtrator implements ResultSetExtractor<Client>{
    @Override
    public  Client extractData(ResultSet rs) throws SQLException {
        Client client = new Client(rs.getString("lastName"),rs.getString("firstName"),rs.getString("address"),rs.getString("email"),rs.getString("phoneNumber"));
        return client;
    }
}