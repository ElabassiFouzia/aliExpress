/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import bean.Commande;
import bean.CommandeItem;
import java.util.Date;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import util.SearchUtil;

/**
 *
 * @author SAMSUNG
 */
public class CommandeService extends AbstractFacade<Commande> {
//    CommandeService commandeService = new CommandeService();
    CommandeItemService commandeItemService = new CommandeItemService();
    Commande commande=new Commande();
    List<CommandeItem> commandeItems;

    public CommandeService() {
        super(Commande.class);
    }

    private String constractQuery(Client client, Date dateMin, Date dateMax) {
        String query = "SELECT com FROM Commande com WHERE 1=1 ";
         if(client != null && !client.equals("")){
            query += " AND com.client.id = '"+client.getId()+"'";
            return query;
        }
                  if(dateMin != null && !dateMin.equals("")){
            query += " AND com.dateCommande >= '"+dateMin+"'";
        }
                           if(dateMax != null && !dateMax.equals("")){
            query += " AND com.dateCommande< = '"+dateMax+"'";
        }
        query+=SearchUtil.addConstraintMinMaxDate("commande", "dateCommande", dateMin, dateMax);
        return query;
    }

    public List<Commande> searchByCreteria(Client client, Date dateMin, Date dateActuelle) {
        String query = constractQuery(client,dateMin, dateActuelle);
        return getEntityManager().createQuery(query).getResultList();
    }



    //trouver la liste des commandes associent à un client par son id
    public List<Commande> findByIdClient(String id) {
        String query = "SELECT com FROM Commande com WHERE com.client.id='" + id + "'";
        return getEntityManager().createQuery(query).getResultList();
    }
    //trouver la liste des commandes associent à un fournisseur
     public List<Commande> findByIdFournisseur(String id) {
        String query = "SELECT com FROM Commande com WHERE com.fournisseur.id='" + id + "'";
        return getEntityManager().createQuery(query).getResultList();
    }

    // supprimer une liste des commandes d'un client à partir de son id
    public List<Commande> deleteByIdClient(String id) {
        String query = "delete from Commande com where com.client.id='" + id + "'";
        return getEntityManager().createQuery(query).getResultList();
    }
    //calculer le montant d'une commande    

     public void calculerMontant(List<CommandeItem> commandeItems,Commande commande){
     if(commande == null){
           return ;
       }else{
           double montant=0;
           for (CommandeItem commandeItem : commandeItems) {
             montant =commandeItem.getPrix() * commandeItem.getQte();
           }
         commande.setMontantPayer(montant);
      }
      }

  

    //ajouter un client avec les listes des commandes associent
    public void save(Client client, List<Commande> commandes) {
         ClientService clientService = new ClientService();
        for (Commande commande : commandes) {
            commande.getClient(client);
            commande.setClient(client);
            create(commande);
            clientService.create(client);

        }
    }
    public int save(List<CommandeItem> commandeItems,Commande commande){
        commande.setDateCommande(new Date());
        calculerMontant(commandeItems, commande);
        create(commande);
        for (int i = 0; i < commandeItems.size(); i++) {
            CommandeItem commandeItem = commandeItems.get(i);
            commandeItem.setCommande(commande);
            commandeItemService.create(commandeItem);
            
        }
        return 1;
    }
//  public Commande createCommande(String id,Date dateCommande,Client client){
//      Commande commande = new Commande(id, dateCommande ,client);
//      commande.setDateCommande(new Date());
//      calculerMontant(commandeItems, commande);
//      create(commande);
//      return commande;
//      }
    public void createCommande(List<CommandeItem> commandeItems,Commande commande){
        commande.setId(null);
        commande.setDateCommande(new Date());
        calculerMontant(commandeItems, commande);
        create(commande);
        commandeItemService.createCommandeItem(commandeItems, commande);
    }

    void deleteByIdClient(SingularAttribute<Client, String> id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


}
