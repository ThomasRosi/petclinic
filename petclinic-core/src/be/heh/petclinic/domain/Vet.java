package be.heh.petclinic.domain;

public class Vet {

  private String last_name;
  private String first_name;
  private String specialty;

  public Vet(String last_name, String first_name, String specialty){
    this.last_name = last_name;
    this.first_name = first_name;
    this.speciality = specialty;
  }

  public String getLastName() {
      return this.last_name;
  }

  public String getFirstName() {
      return this.first_name;
  }

  public String getSpeciality() {
      return this.speciality;
  }

  public void setLastName(String last_name){
    this.last_name = last_name;
  }

  public void setFirstName(String first_name){
    this.first_name = first_name;
  }

  public void setSpecialty(String speciality){
    this.specialty = specialty;
  }
}
