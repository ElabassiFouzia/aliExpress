/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Commande;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class CommandeHelper1 extends AbstractHelper<Commande> {
    
    
     private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            
            new AbstractHelperItem("IDENTIFIANT  ", "id"),
            new AbstractHelperItem("DATE COMMANDE", "dateCommande"),
            
           
        };
       

           
           // new AbstractHelperItem("Identifiant", "id"),};
    }

     public CommandeHelper1(JTable jTable,List<Commande> commandes) {
        super(titres, jTable, commandes);
    }
      public CommandeHelper1(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public CommandeHelper1( JTable jTable) {
        super(titres, jTable);
    }


   






   
    
    
}
