/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author SAMSUNG
 */
@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCommande;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Fournisseur fournisseur;
    private double totale;
    private double montantPayer;
    @ManyToOne
    private Reception reception;
    @OneToMany(mappedBy = "commande")
    private List<CommandeItem> commandeItems;
    @OneToMany(mappedBy = "commande")
    private List<Paiement> paiements;

    public Commande() {
    }

    public Commande(Long id, Date dateCommande, Client client, Fournisseur fournisseur, double totale, double montantPayer, Reception reception) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.client = client;
        this.fournisseur = fournisseur;
        this.totale = totale;
        this.montantPayer = montantPayer;
        this.reception = reception;
    }

    public Commande(Long id, Date dateCommande, double totale, double montantPayer) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.totale = totale;
        this.montantPayer = montantPayer;
    }

    public Commande(String id, Date dateCommande, Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public List<CommandeItem> getCommandeItems() {
        return commandeItems;
    }

    public void setCommandeItems(List<CommandeItem> commandeItems) {
        this.commandeItems = commandeItems;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

    public double getMontantPayer() {
        return montantPayer;
    }

    public void setMontantPayer(double montantPayer) {
        this.montantPayer = montantPayer;
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
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", dateCommande=" + dateCommande + ", client=" + client + ", fournisseur=" + fournisseur + ", totale=" + totale + ", montantPayer=" + montantPayer + '}';
    }

    public void getClient(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
