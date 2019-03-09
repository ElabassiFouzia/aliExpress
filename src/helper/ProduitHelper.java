/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Produit;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class ProduitHelper extends AbstractHelper<Produit> {
    
    
     private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("IDENTIFIANT  ", "id"),
            new AbstractHelperItem("TYPE ", "type"),
            new AbstractHelperItem("PRIX UNITAIRE  ", "prixUnitaire"),
            new AbstractHelperItem("DATE PRODUCTION", "dateProduction"),
             new AbstractHelperItem("DATE EXPIRATION", "dateExpiration"),
            
        };
           
           // new AbstractHelperItem("Identifiant", "id"),};
    }

     public ProduitHelper(JTable jTable,List<Produit> list) {
        super(titres, jTable, list);
    }
      public ProduitHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public ProduitHelper( JTable jTable) {
        super(titres, jTable);
    }


   






   
    
    
}
