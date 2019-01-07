package be.heh.petclinic.domain;

import java.sql.Date;
import java.time.LocalDateTime;

public class Appointment {

    private int appointment_id;
    private Pet pet;
    private Vet vet;
    private Date visit_date;
    private int visit_duration;
    private String description;

    public Appointment(int appointment_id,Pet pet, Vet vet,
                       Date visit_date,
                       int visit_duration, String description) {
        this.appointment_id = appointment_id;
        this.pet = pet;
        this.vet = vet;
        this.visit_date = visit_date;
        this.visit_duration = visit_duration;
        this.description = description;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Date getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(Date visit_date) {
        this.visit_date = visit_date;
    }

    public int getVisit_duration() {
        return visit_duration;
    }

    public void setVisit_duration(int visit_duration) {
        this.visit_duration = visit_duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
