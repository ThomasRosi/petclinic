package be.heh.petclinic.component.vet;

import java.util.ArrayList;
import java.util.List;

import be.heh.petclinic.domain.*;

public class VetComponentImpl implements VetComponent {

    private List<Vet> vets = new ArrayList<>();

    @Override
    public List<Vet> getVets() {
      vets.add(new Vet("James","James","none"));
      vets.add(new Vet("Helen","Helen","radiology"));
      vets.add(new Vet("Linda","Linda","surgery"));
      
      return vets;
    }


}