package be.heh.petclinic.domain;

public class Client {

  private Integer client_id;
  private String last_name;
  private String first_name;
  private String city;
  private String address;
  private String telephone;

  public Client(Integer client_id,String last_name, String first_name, String address, String city, String telephone){
    this.client_id = client_id;
    this.last_name = last_name;
    this.first_name = first_name;
    this.city = city;
    this.address = address;
    this.telephone = telephone;
  }

  public Integer getClientID(){
      return this.client_id;
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

  public String getCity() {
      return this.city;
  }

  public String getTelephone() {
    return this.telephone;
  }

  public void setClientID(Integer client_id){
      this.client_id = client_id;
  }

  public void setLastName(String last_name) {
      this.last_name = last_name;
  }

  public void setFirstName(String first_name) {
      this.first_name = first_name;
  }

  public void setAddress(String address) {
      this.address = address;
  }

  public void setCity(String city) {
      this.city = city;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

}
