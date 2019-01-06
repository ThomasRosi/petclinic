package be.heh.petclinic.component.appointment;

import be.heh.petclinic.domain.Appointment;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Collection;

public class AppointmentComponentImpl implements AppointmentComponent {

    private JdbcAppointmentDao appointmentDao;

    public AppointmentComponentImpl(DataSource dataSource) {
        this.appointmentDao = new JdbcAppointmentDao(dataSource);
    }

    @Override
    public Collection<Appointment> getAppointments() {
        try {
            Collection<Appointment> appointments = appointmentDao.getAppointments();
            return appointments;
        } catch (Exception e) {
            AppointmentException ae = new AppointmentException("Error while loading appointments", e);
            throw ae;
        }
    }

    @Override
    public Collection<Appointment> getAppointmentByVet(String vet_last_name) {
        try {
            Collection<Appointment> appointments = appointmentDao.getAppointments();
            Collection<Appointment> response = new ArrayList<>();
            appointments.stream()
                    .filter(appointment -> appointment.getVet().getLastName().equals(vet_last_name))
                    .forEach(response::add);
            return response;
        } catch (Exception e) {
            AppointmentException ae = new AppointmentException("Error while loading appointments", e);
            throw ae;
        }
    }

    @Override
    public Collection<Appointment> getAppointmentByPet(String pet_name) {
        try {
            Collection<Appointment> appointments = appointmentDao.getAppointments();
            Collection<Appointment> response = new ArrayList<>();
            appointments.stream()
                    .filter(appointment -> appointment.getPet().getName().equals(pet_name))
                    .forEach(response::add);
            return response;
        } catch (Exception e) {
            AppointmentException ae = new AppointmentException("Error while loading appointments", e);
            throw ae;
        }
    }
}
