
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela INPUT
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"INPUT\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.INPUT")
public class INPUT implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_PRODUCT", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private PRODUCT prODUCT;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date date;


    /**
    * @generated
    */
    @Column(name = "quantity", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String quantity;


    /**
    * Construtor
    * @generated
    */
    public INPUT(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public INPUT setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém prODUCT
    * return prODUCT
    * @generated
    */
    public PRODUCT getPrODUCT() {
        return this.prODUCT;
    }

    /**
    * Define prODUCT
    * @param prODUCT prODUCT
    * @generated
    */
    public INPUT setPrODUCT(PRODUCT prODUCT) {
        this.prODUCT = prODUCT;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public INPUT setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém date
    * return date
    * @generated
    */
    public java.util.Date getDate() {
        return this.date;
    }

    /**
    * Define date
    * @param date date
    * @generated
    */
    public INPUT setDate(java.util.Date date) {
        this.date = date;
        return this;
    }
    /**
    * Obtém quantity
    * return quantity
    * @generated
    */
    public java.lang.String getQuantity() {
        return this.quantity;
    }

    /**
    * Define quantity
    * @param quantity quantity
    * @generated
    */
    public INPUT setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
INPUT object = (INPUT)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}