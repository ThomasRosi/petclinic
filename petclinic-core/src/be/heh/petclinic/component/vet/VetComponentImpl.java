package be.heh.petclinic.component.vet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import javax.sql.DataSource;

import be.heh.petclinic.domain.Vet;
import be.heh.petclinic.component.vet.*;
import be.heh.petclinic.util.ComponentException;

class VetComponentImpl implements VetComponent {

    private JdbcVetDao vetDao;

    VetComponentImpl(DataSource dataSource){
      this.vetDao = new JdbcVetDao(dataSource);
    }

    @Override
    public Collection<Vet> getVets() {
      //List<Vet> vets = new ArrayList<>();
      //vets.add(new Vet("James","James","none"));
      //vets.add(new Vet("Helen","Helen","radiology"));
      //vets.add(new Vet("Linda","Linda","surgery"));
      try {
        Collection<Vet> vets = vetDao.getVets();
        return vets;
      } catch (Exception e) {
        VetException ve = new VetException("Error while loading vets", e);
        //logError(ve);
        throw ve;
      }
    }

}
