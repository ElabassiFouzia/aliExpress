/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author SAMSUNG
 */
@Entity
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String type;
    private double prixUnitaire;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateProduction;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateExpiration;

    public Produit() {
    }

    public Produit(String id, String type, double prixUnitaire, Date dateProduction, Date dateExpiration) {
        this.id = id;
        this.type = type;
        this.prixUnitaire = prixUnitaire;
        this.dateProduction = dateProduction;
        this.dateExpiration = dateExpiration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Date getDateProduction() {
        return dateProduction;
    }

    public void setDateProduction(Date dateProduction) {
        this.dateProduction = dateProduction;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    
    public String getId() {
        return id;
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
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", type=" + type + ", prixUnitaire=" + prixUnitaire + ", dateProduction=" + dateProduction + ", dateExpiration=" + dateExpiration + '}';
    }

   
    
}
