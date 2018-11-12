package be.heh.petclinic.domain;

public class Client {

  private String last_name;
  private String first_name;
  private String address;
  private String email;
  private String phone_number;

  public Client(String last_name, String first_name, String address, String email, String phone_number){
    this.last_name = last_name;
    this.first_name = first_name;
    this.address = address;
    this.email = email;
    this.phone_number = phone_number;
  }

  public String getLastName() {
      return this.last_name;
  }

  public String getFirstName() {
      return this.first_name;
  }

  public String getAddress() {
      return this.address;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPhonenumber() {
    return this.phone_number;
  }

  public void setLastName(String last_name) {
      this.last_name = last_name;
  }

  public void setFirstName(String first_name) {
      this.first_name = first_name;
  }

  public void setAddress(String Address) {
      this.address = Address;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(String phone_number) {
    this.phone_number = phone_number;
  }

}
