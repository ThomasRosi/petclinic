package be.heh.petclinic.domain;

public class Client {

  private String lastName;
  private String firstName;
  private String address;
  private String email;
  private String phonenumber;

  public Client(String lastName, String firstName, String address, String email, String phonenumber){
    this.lastName = lastName;
    this.firstName = firstName;
    this.address = address;
    this.email = email;
    this.phonenumber = phonenumber;
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
    return this.phonenumber;
}
}
