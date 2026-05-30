package model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;
import javax.swing.ImageIcon;

/**
 * Encapsulated class that defines the type of entity that will manage the application.
 * @author Fran Perez
 * @version 1.1.0
 */
@Entity
public class Person implements Serializable{


    @Id 
    private String nif;
    private String name;
    private String email;
    private Date dateOfBirth;
    private String phoneNumber;

    @Transient
    private ImageIcon photo;

    @Lob
    private byte[] photoOnlyJPA;

   
    
    public Person(String nif) {
        this.nif = nif;
    }
    
    public Person(String name, String nif, String phoneNumber) {
        this.name = name;
        this.nif = nif;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, String nif, String email, String phoneNumber) {
        this.name = name;
        this.nif = nif;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, String nif, String phoneNumber, Date dateOfBirth, ImageIcon photo) {
        this.name = name;      
        this.nif = nif;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.photo = photo;
    }

    /**
     * Constructor with all data
     * @author Fran Perez
     * @version 1.0
     * @param name
     * @param nif
     * @param dateOfBirth
     * @param photo
     */
    public Person(String name, String nif, String email ,  Date dateOfBirth, ImageIcon photo) {
        this.name = name;      
        this.nif = nif;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNif() {
        return nif;
    }
    

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

    public byte[] getPhotoOnlyJPA() {
        return photoOnlyJPA;
    }

    public void setPhotoOnlyJPA(byte[] photoOnlyJPA) {
        this.photoOnlyJPA = photoOnlyJPA;
    }
        
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return Objects.equals(this.hashCode(), other.hashCode());
    }

    @Override
    public String toString() {
        return "Person {" + "Name = " + name 
                + ", NIF = " + nif
                + ", Email = " + email
                + ", PhoneNumber = " + phoneNumber 
                + ", DateOfBirth = " + dateOfBirth 
                + ", Photo = " + (photo != null) + "}";
    }
}
