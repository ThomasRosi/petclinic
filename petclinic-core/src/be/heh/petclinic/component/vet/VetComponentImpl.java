package be.heh.petclinic.component.vet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import be.heh.petclinic.domain.Vet;
import be.heh.petclinic.component.vet;

class VetComponentImpl implements VetComponent {

    private JdbcVetDao vetDao;

    VetComponentImpl(JdbcDatabaseConfiguration jdbcDatabaseConfiguration){
      this.vetDao = new JdbcVetDao(jdbcDatabaseConfiguration);
    }

    @Override
    public Collection<Vet> getVets() {
      //List<Vet> vets = new ArrayList<>();
      //vets.add(new Vet("James","James","none"));
      //vets.add(new Vet("Helen","Helen","radiology"));
      //vets.add(new Vet("Linda","Linda","surgery"));

      try {
        return Collection<Vet> vets = vetDao.getVets();
      } catch (Exception e) {
        VetException ve = new VetException("Error while loading vets", e);
        logError(ve);
        throw ve;
      }

      return vets;
    }

}
