
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
* Classe que representa a tabela PRODUCT
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PRODUCT\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PRODUCT")
public class PRODUCT implements Serializable {
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
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * @generated
    */
    @Column(name = "value", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double value;


    /**
    * @generated
    */
    @Column(name = "totalQuantity", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer totalQuantity;


    /**
    * Construtor
    * @generated
    */
    public PRODUCT(){
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
    public PRODUCT setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public PRODUCT setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém value
    * return value
    * @generated
    */
    public java.lang.Double getValue() {
        return this.value;
    }

    /**
    * Define value
    * @param value value
    * @generated
    */
    public PRODUCT setValue(java.lang.Double value) {
        this.value = value;
        return this;
    }
    /**
    * Obtém totalQuantity
    * return totalQuantity
    * @generated
    */
    public java.lang.Integer getTotalQuantity() {
        return this.totalQuantity;
    }

    /**
    * Define totalQuantity
    * @param totalQuantity totalQuantity
    * @generated
    */
    public PRODUCT setTotalQuantity(java.lang.Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PRODUCT object = (PRODUCT)obj;
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