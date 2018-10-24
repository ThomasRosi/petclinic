package be.heh.petclinic.component.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import be.heh.petclinic.domain.*;

class ClientComponentImpl implements ClientComponent {

    private List<Client> clients = new ArrayList<>();

    @Override
    public Collection<Client> getClients() {
        clients.add(new Client("Richard","James","Mons","test@test.test","06"));
        //clients.add(new Client("Helen","Helen","Mons","test@test.test","06"));
        //clients.add(new Client("Linda","Linda","Mons","test@test.test","06"));

        return clients;
    }


}
