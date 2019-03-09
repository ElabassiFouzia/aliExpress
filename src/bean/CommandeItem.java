/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author SAMSUNG
 */
@Entity
public class CommandeItem implements Serializable {

    private static final long serialVersionUID = 1L;



//    public static List<CommandeItem> findByIdClient(SingularAttribute<Client, String> id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double prix;
    private long qte;
    @ManyToOne
    private Commande commande;
    @ManyToOne
    private Produit produit;

    public CommandeItem() {
    }

    public CommandeItem(Long id, double prix, long qte, Commande commande, Produit produit) {
        this.id = id;
        this.prix = prix;
        this.qte = qte;
        this.commande = commande;
        this.produit = produit;
    }
        public CommandeItem(double prix, long qte, Produit produit) {
        this.prix = prix;
        this.qte = qte;
        this.produit = produit;
    }

    public CommandeItem(Long id, double prix, long qte) {
        this.id = id;
        this.prix = prix;
        this.qte = qte;
    }

    public CommandeItem(double prix, long qte) {
        this.prix = prix;
        this.qte = qte;
    }


    
    

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public long getQte() {
        return qte;
    }

    public void setQte(long qte) {
        this.qte = qte;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommandeItem)) {
            return false;
        }
        CommandeItem other = (CommandeItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CommandeItem{" + "id=" + id + ", prix=" + prix + ", qte=" + qte + ", commande=" + commande + ", produit=" + produit + '}';
    }

   
    
}
