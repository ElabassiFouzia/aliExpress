;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Commande;
import bean.CommandeItem;
import java.util.List;

/**
 *
 * @author SAMSUNG
 */
public class CommandeItemService extends AbstractFacade<CommandeItem> {

    public CommandeItemService() {
        super(CommandeItem.class);
    }
    Commande commande = new Commande();
    List<CommandeItem> commandeItems;
//    public CommandeItem createCommandeItem(Produit produit,long qte, double prix){
//       if(produit != null){
//           CommandeItem commandeItem= new CommandeItem(produit,qte,prix);
//           commandeItem.setQte(0);
//           commandeItem.setCommande(null);
//           commandeItem.setPrix(produit.getPrixUnitaire()*qte);
//           return commandeItem;
//       } else{
//           return null;
//       }
//    }
    public void createCommandeItem(List<CommandeItem> commandeItems,Commande commande){
        for(int i=0; i<commandeItems.size();i++){
            CommandeItem commandeItem = commandeItems.get(i);
            commandeItem.setCommande(commande);
            create(commandeItem);
        }
    }
    

    public List<CommandeItem> findByIdClient(String id) {
        String query = "select comItem from CommandeItem comItem where comItem.client.id='" + id + "'";
        return getEntityManager().createQuery(query).getResultList();
    }

  public List<CommandeItem> findByIdCommande(long id) {
        String query = "select comItem from CommandeItem comItem where comItem.commande.id='" + id + "'";
        return getEntityManager().createQuery(query).getResultList();
    }
   public List<CommandeItem> deleteByIdCommande(long id) {
        String query = "delete comItem from CommandeItem comItem where comItem.commande.id='" + id + "'";
        return getEntityManager().createQuery(query).getResultList();
    }
    public List<CommandeItem> findByIdProduit(String id) {
        String query = "select comItem from CommandeItem comItem where comItem.produit.id='" + id + "'";
        return getEntityManager().createQuery(query).getResultList();
    }

}
