package be.heh.petclinic.component.appointment;

import be.heh.petclinic.domain.Appointment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Collection;

public class JdbcAppointmentDao {

    private DataSource dataSource;

    JdbcAppointmentDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    Collection<Appointment> getAppointments() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT a.*, c.*, p.*, v.* FROM appointment AS a inner JOIN pets AS p ON a.pet_id = p.id inner JOIN clients AS c ON p.clients_id = c.id inner JOIN vets AS v ON a.vet_id = v.id", new AppointmentRowMapper());
    }

    Appointment getById(int id){
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT a.*, c.*, p.*, v.* FROM appointment AS a inner JOIN pets AS p ON a.pet_id = p.id inner JOIN clients AS c ON p.clients_id = c.id inner JOIN vets AS v ON a.vet_id = v.id where a.id = ? ",new Object[] {id}, new AppointmentRowMapper()).get(0);
    }
}