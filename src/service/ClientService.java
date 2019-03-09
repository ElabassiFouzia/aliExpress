/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import static bean.Client_.id;
import bean.Commande;
import java.util.List;

/**
 *
 * @author SAMSUNG
 */
public class ClientService extends AbstractFacade<Client> {

// CommandeService commandeService = new CommandeService();

    public ClientService() {
        super(Client.class);
    }


    // supprimer un client et les listes de commandes qui lui associent

    public void deleteById(String Id) {
        CommandeService commandeService = new CommandeService();
        commandeService.deleteByIdClient(id);
        
        remove(new Client(id));

    }

    //sauvgarder un client avec ses commandes
    public void save(Client client, List<Commande> commandes) {
        CommandeService commandeService = new CommandeService();
        for (Commande commande : commandes) {
            commande.getClient(client);
            commande.setClient(client);
            create(client);
            commandeService.create(commande);

        }
    }

}
