package be.heh.petclinic.domain;

public class Pet {

  private String name;
  private String birth_date;
  private String species;
  private Client client;

  public Pet(String name, String birth_date, String species, Client client){
    this.name = name;
    this.birth_date = birth_date;
    this.species = species;
    this.client = client;
  }

  public String getName(){
    return this.name;
  }

  public String getBirthDate(){
    return this.birth_date;
  }

  public Client getClient(){
    return this.client;
  }

  public String getSpecies(){
    return this.species;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setBirthDate(String birth_date){
    this.birth_date = birth_date;
  }

  public void setClient(Client client){
    this.client = client;
  }

  public void setSpecies(String species){
    this.species = species;
  }
}
