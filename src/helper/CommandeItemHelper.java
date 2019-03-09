/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.CommandeItem;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class CommandeItemHelper extends AbstractHelper<CommandeItem> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("PRODUIT", "produit"),
            new AbstractHelperItem("PRIX", "prix"),
            new AbstractHelperItem("QTE", "qte"),
            new AbstractHelperItem("DATE PRODUCTION", "dateProduction"),
            new AbstractHelperItem("DATE EXPIRATION", "dateExpiration"),
        };

        // new AbstractHelperItem("Identifiant", "id"),};
    }

    public CommandeItemHelper(JTable jTable, List<CommandeItem> commandeItems) {
        super(titres, jTable, commandeItems);
    }
 public CommandeItemHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }
    public CommandeItemHelper(JTable jTable) {
        super(titres, jTable);
    }

}
