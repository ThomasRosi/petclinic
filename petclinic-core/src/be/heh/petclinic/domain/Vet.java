package be.heh.petclinic.domain;

public class Vet {

  private String lastName;
  private String firstName;
  private String speciality;

  public Vet(String lastName, String firstName, String speciality){
    this.lastName = lastName;
    this.firstName = firstName;
    this.speciality = speciality;
  }

  public String getLastName() {
      return this.lastName;
  }

  public String getFirstName() {
      return this.firstName;
  }

  public String getSpeciality() {
      return this.speciality;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  
  public void setSpeciality(String speciality){
    this.speciality = speciality;
  }
}
