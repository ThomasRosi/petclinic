package be.heh.petclinic.component.vet;

import java.util.List;
import be.heh.petclinic.domain.Vet;
import be.heh.petclinic.domain.ContentSource;

public interface VetComponent {

  List<Vet> getVets();

  List<Vet> getVets(ContentSource contentSource);
}
