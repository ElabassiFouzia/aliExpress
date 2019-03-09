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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author SAMSUNG
 */
@Entity
public class Reception implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateReception;
    @OneToMany(mappedBy = "reception")
    private List<Commande> commandes;
    @OneToMany(mappedBy = "reception")
    private List<ReceptionItem> receptionItems;

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public List<ReceptionItem> getReceptionItems() {
        return receptionItems;
    }

    public void setReceptionItems(List<ReceptionItem> receptionItems) {
        this.receptionItems = receptionItems;
    }

    
    public Reception() {
    }

    public Reception(String id, Date dateReception) {
        this.id = id;
        this.dateReception = dateReception;
    }

    public Reception(String id, Date dateReception, Commande commande) {
        this.id = id;
        this.dateReception = dateReception;
    }
    
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
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
        if (!(object instanceof Reception)) {
            return false;
        }
        Reception other = (Reception) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reception{" + "id=" + id + ", dateReception=" + dateReception + '}';
    }

   

  
    
}
