package be.heh.petclinic.domain;

public class Client {

  private String lastName;
  private String firstName;
  private String address;
  private String email;
  private String phoneNumber;

  public Client(String lastName, String firstName, String address, String email, String phoneNumber){
    this.lastName = lastName;
    this.firstName = firstName;
    this.address = address;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public String getLastName() {
      return this.lastName;
  }

  public String getFirstName() {
      return this.firstName;
  }

  public String getAddress() {
      return this.address;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPhonenumber() {
    return this.phoneNumber;
  }

  public void setLastName(String lastName) {
      this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  public void setAddress(String Address) {
      this.address = Address;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhonenumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}
