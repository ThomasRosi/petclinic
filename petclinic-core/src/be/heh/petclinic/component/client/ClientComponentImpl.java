package be.heh.petclinic.component.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import javax.sql.DataSource;

import be.heh.petclinic.domain.Client;
import be.heh.petclinic.component.client.*;
import be.heh.petclinic.util.ComponentException;

class ClientComponentImpl implements ClientComponent {

    private JdbcClientDao clientDao;

    ClientComponentImpl(DataSource datasource){
        this.clientDao = new JdbcClientDao(datasource);
    }

    @Override
    public Collection<Client> getClients() {
        //clients.add(new Client("Richard","James","Mons","test@test.test","06"));
        //clients.add(new Client("Helen","Helen","Mons","test@test.test","06"));
        //clients.add(new Client("Linda","Linda","Mons","test@test.test","06"));

        try{
            Collection<Client> clients = clientDao.getClients();
            return clients;
        } catch(Exception e){
            ClientException ce = new ClientException("Error while loading Clients", e);
            throw ce;
        }
    }


}
