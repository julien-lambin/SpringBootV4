package com.kf.demo.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Game {

    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private int id;
    private String nom;
    private int prix;
    private String dateSortie;



    public boolean checkGameIsValid(){
        return  (id >= 0
                && !StringUtils.isEmpty(nom)
                && nom.length() > 0
                && !StringUtils.isEmpty(dateSortie)
                && dateSortie.length() > 0
                && prix >= 0);
    }


    //constructeur par défaut
    public Game() {
    }

    //constructeur pour nos tests
    public Game(int id, String nom, int prix, String dateSortie) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.dateSortie = dateSortie;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {

        this.prix = prix;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}

