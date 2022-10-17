package cr.una.model;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.Date;

public class Animal {
    //attributes with annotations for Hibernate

    private String weight;
    private String feeding;
    private String breed;
    private String vaccination;
    private String DBId;
    private Owner owner;

    //Constructors

    public Animal() {
    }

    public Animal(String weight, String feeding, String breed, String vaccination, String DBId, Owner owner) {
        this.weight = weight;
        this.feeding = feeding;
        this.breed = breed;
        this.vaccination = vaccination;
        this.DBId = DBId;
        this.owner = owner;
    }

    public Animal(String weight, String feeding, String breed, String vaccination, Owner owner) {
        this.weight = weight;
        this.feeding = feeding;
        this.breed = breed;
        this.vaccination = vaccination;
        this.owner = owner;
    }

    public Animal(String weight, String feeding, String breed, String vaccination) {
        this.weight = weight;
        this.feeding = feeding;
        this.breed = breed;
        this.vaccination = vaccination;
    }

    //Setters and Getters


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getDBId() {
        return DBId;
    }

    public void setDBId(String DBId) {
        this.DBId = DBId;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight='" + weight + '\'' +
                ", feeding='" + feeding + '\'' +
                ", breed='" + breed + '\'' +
                ", vaccination='" + vaccination + '\'' +
                ", DBId='" + DBId + '\'' +
                ", owner=" + owner +
                '}';
    }
}
