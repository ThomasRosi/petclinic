package be.heh.petclinic.component.appointment;

import be.heh.petclinic.domain.Appointment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Collection;

public class JdbcAppointmentDao {

    private DataSource dataSource;

    JdbcAppointmentDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    Collection<Appointment> getAppointments(){
        JdbcTemplate select = new JdbcTemplate(dataSource);
        //todo join avec pet et vet table
        return select.query("SELECT a.* FROM petclinic_db.appointment AS a", new AppointmentRowMapper());
    }
}
