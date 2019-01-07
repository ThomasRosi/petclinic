package be.heh.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;

import be.heh.petclinic.component.client.ClientComponent;
import be.heh.petclinic.domain.Client;

import java.util.List;
import java.util.Collection;

@RestController
public class ClientRestController {

	@Autowired
	private ClientComponent clientComponent;

	//@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping("api/v1/clients")
	public ResponseEntity<Collection<Client>> getClients(){

		Collection<Client> clients = clientComponent.getClients();
		if(clients.isEmpty()){
			return new ResponseEntity<Collection<Client>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Client>>(clients, HttpStatus.OK);
	}
}
