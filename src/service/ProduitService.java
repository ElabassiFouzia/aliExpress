/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CommandeItem;
import bean.Produit;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SAMSUNG
 */
public class ProduitService extends AbstractFacade<Produit>{

    public ProduitService(){
        super(Produit.class);
    }
      
    public Produit AjouterProduit(String id, String type, double prixUnitaire, Date dateProduction, Date dateExpiration,double prix){
        Produit p=new Produit();
        p.setId(id);
        p.setType(type);
        p.setPrixUnitaire(prixUnitaire);
        p.setDateProduction(dateProduction);
        p.setDateExpiration(dateExpiration);
        create(p);
        return p;
    }
   


    


   

   
    
    
}
