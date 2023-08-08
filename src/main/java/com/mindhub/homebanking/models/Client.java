package com.mindhub.homebanking.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.CommandLineRunner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //genera una tabla en la base de datos, filas = objetos y columnas = propiedades
public class Client {
    @Id //clave primaria
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String firstName ="";
    private String lastName = "";

    private String email = "";

    public Client() { }

    public Client(String first, String last,String email) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
    }

    public long getId() { return id; }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return firstName + " " + lastName + " " + email;
    }

}