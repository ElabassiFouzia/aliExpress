/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Fournisseur;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class FournisseurHelper extends AbstractHelper<Fournisseur> {
    
    
     private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            
            new AbstractHelperItem("ID  ", "id"),
            new AbstractHelperItem("NOM", "nom"),
            new AbstractHelperItem("SOLDE", "solde"),
            new AbstractHelperItem("TYPE", "type"),
             new AbstractHelperItem("ADRESSE", "adresse"),
        };
           
           // new AbstractHelperItem("Identifiant", "id"),};
    }

   

    public FournisseurHelper( JTable jTable, List<Fournisseur> list) {
        super(titres, jTable, list);
    }
     public FournisseurHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public FournisseurHelper( JTable jTable) {
        super(titres, jTable);
    }

   
    
    
}
