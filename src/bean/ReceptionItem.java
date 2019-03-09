/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;

/**
 *
 * @author SAMSUNG
 */
@Entity
public class ReceptionItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private long qte;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Reception reception;

    public ReceptionItem() {
    }

    public ReceptionItem(String id, long qte, Produit produit, Reception reception) {
        this.id = id;
        this.qte = qte;
        this.produit = produit;
        this.reception = reception;
    }

    public long getQte() {
        return qte;
    }

    public void setQte(long qte) {
        this.qte = qte;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
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
        if (!(object instanceof ReceptionItem)) {
            return false;
        }
        ReceptionItem other = (ReceptionItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ReceptionItem{" + "id=" + id + ", qte=" + qte + ", produit=" + produit + ", reception=" + reception + '}';
    }

}
