package be.heh.petclinic.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import be.heh.petclinic.component.pet.PetComponentImpl;
import be.heh.petclinic.domain.Pet;

import java.util.List;
import java.util.ArrayList;

@RestController

public class PetRestController {

	private PetComponentImpl petComponent = new PetComponentImpl();

	@RequestMapping("api/v1/pets")
	public List<Pet> getPets(){
		return this.petComponent.getPets();
	}
}
