package entities;

import service.abstracts.IEntity;

import java.util.Date;


public class Customer implements IEntity {
    int id;
    String firstName;
    String lastName;
    Date dateOfBirth;
    String nationalofId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalofId() {
        return nationalofId;
    }

    public void setNationalofId(String nationalofId) {
        this.nationalofId = nationalofId;
    }
}
