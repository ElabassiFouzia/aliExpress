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

/**
 *
 * @author SAMSUNG
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String password;
    private boolean bloquer;
    private int nombreCnxRestant;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBloquer() {
        return bloquer;
    }

    public void setBloquer(boolean bloquer) {
        this.bloquer = bloquer;
    }

    public int getNombreCnxRestant() {
        return nombreCnxRestant;
    }

    public void setNombreCnxRestant(int nombreCnxRestant) {
        this.nombreCnxRestant = nombreCnxRestant;
    }

    public User(Long id, String login, String password, boolean bloquer, int nombreCnxRestant) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.bloquer = bloquer;
        this.nombreCnxRestant = nombreCnxRestant;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.User[ id=" + id + " ]";
    }

}
