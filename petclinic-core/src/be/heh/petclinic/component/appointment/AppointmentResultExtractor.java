package be.heh.petclinic.component.appointment;

import be.heh.petclinic.domain.Appointment;
import be.heh.petclinic.domain.Client;
import be.heh.petclinic.domain.Pet;
import be.heh.petclinic.domain.Vet;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AppointmentResultExtractor implements ResultSetExtractor<Appointment> {

    @Override
    public Appointment extractData(ResultSet rs) throws SQLException {
        Client client = new Client(rs.getInt("id"),rs.getString("c.last_name"), rs.getString("c.first_name"), rs.getString("c.address"), rs.getString("c.city"), rs.getString("c.telephone"));
        Pet pet = new Pet(rs.getString("p.name"), rs.getString("p.birth_date"), rs.getString("p.species"), client);
        Vet vet = new Vet(rs.getString("v.last_name"),rs.getString("v.first_name"),rs.getString("v.speciality"));//speciality is an entity in the database but just a string in the backend domain, maybe that can be more powerful to create a new class for it
        Appointment appointment = new Appointment(pet,vet,rs.getDate("a.visit_date"),rs.getInt("a.visit_duration"),rs.getString("a.description"));
        return appointment;
    }
}
