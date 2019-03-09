/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Client;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class ClientHelper extends AbstractHelper<Client> {
    
    
     private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("IDENTIFIANT  ", "id"),
            new AbstractHelperItem("NOM  ", "nom"),
            new AbstractHelperItem("SOLDE  ", "solde"),
            new AbstractHelperItem("ADRESSE  ", "adresse"),
            
        };
           
           // new AbstractHelperItem("Identifiant", "id"),};
    }

     public ClientHelper(JTable jTable,List<Client> clients) {
        super(titres, jTable, clients);
    }

    public ClientHelper( JTable jTable) {
        super(titres, jTable);
    }


   






   
    
    
}
