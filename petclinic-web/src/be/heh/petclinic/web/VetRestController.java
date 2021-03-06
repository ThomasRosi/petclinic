package be.heh.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;

import be.heh.petclinic.component.vet.VetComponent;
import be.heh.petclinic.domain.Vet;

import java.util.List;
import java.util.Collection;

@RestController
public class VetRestController {

	@Autowired
	private VetComponent vetComponent;

	//@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping("api/v1/vets")
	public ResponseEntity<Collection<Vet>> getVets(){

		Collection<Vet> vets = vetComponent.getVets();
		if(vets.isEmpty()){
			return new ResponseEntity<Collection<Vet>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Vet>>(vets, HttpStatus.OK);
	}

	@RequestMapping("api/v1/vetsbyspecialty")
	public ResponseEntity<Collection<Vet>> getVetsBySpecialty(@RequestParam(value="specialty", defaultValue="none") String specialty){

		Collection<Vet> vets = vetComponent.getVetsBySpecialty(specialty);
		if(vets.isEmpty()){
			return new ResponseEntity<Collection<Vet>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Vet>>(vets, HttpStatus.OK);
	}

}
