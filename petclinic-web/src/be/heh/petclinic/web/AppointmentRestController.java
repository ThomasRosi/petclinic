package be.heh.petclinic.web;

import be.heh.petclinic.component.appointment.AppointmentComponent;
import be.heh.petclinic.domain.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AppointmentRestController {

    @Autowired
    private AppointmentComponent appointmentComponent;

    @RequestMapping("api/v1/appointments")
    public ResponseEntity<Collection<Appointment>> getAppointments(){
        Collection<Appointment> appointments = appointmentComponent.getAppointments();

        if (appointments.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(appointments, HttpStatus.OK);
    }

}
