package be.heh.petclinic.component.appointment;

import be.heh.petclinic.domain.Appointment;

import java.util.Collection;

public interface AppointmentComponent {

    Collection<Appointment> getAppointments();
    Collection<Appointment> getAppointmentByVet(String vet_last_name);
    Collection<Appointment> getAppointmentByPet(String pet_name);
}
