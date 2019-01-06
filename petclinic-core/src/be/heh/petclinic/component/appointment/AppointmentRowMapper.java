package be.heh.petclinic.component.appointment;

import be.heh.petclinic.domain.Appointment;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AppointmentRowMapper implements RowMapper<Appointment> {


    @Override
    public Appointment mapRow(ResultSet rs, int line) throws SQLException {
        AppointmentResultExtractor extractor = new AppointmentResultExtractor();
        return extractor.extractData(rs);
    }
}
