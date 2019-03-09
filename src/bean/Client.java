/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * @author SAMSUNG
 */
@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nom;
    private double solde;
    private String adresse;
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    public Client() {
    }

    public Client(String id) {
        this.id = id;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
    

    public Client(String id, String nom, double solde, String adresse) {
        this.id = id;
        this.nom = nom;
        this.solde = solde;
        this.adresse = adresse;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Client(SingularAttribute<Client, String> id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNom() {
        return nom;
    }

    public double getSolde() {
        return solde;
    }

    public String getAdresse() {
        return adresse;
    }
    
    

    public String getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    

    public void setId(String id) {
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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", solde=" + solde + ", adresse=" + adresse + '}';
    }
    
    

    
    
}
