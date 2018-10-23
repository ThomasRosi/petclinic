package be.heh.petclinic.domain;

public class Pet {

  private String name;
  private String owner;
  private String breed;

  public Pet(String name, String owner, String breed){
    this.name = name;
    this.owner = owner;
    this.breed = breed;
  }

  public String getName(){
    return this.name;
  }

  public String getOwner(){
    return this.owner;
  }

  public String getBreed(){
    return this.breed;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setOwner(String owner){
    this.owner = owner;
  }

  public void setBreed(String breed){
    this.breed = breed;
  }
}
