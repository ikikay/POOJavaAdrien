/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ikikay
 */
public class Personne {

    /*
    les propriétés
     */
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Personne papa;
    private Personne maman;
    private ArrayList<Personne> enfants = new ArrayList<Personne>();
    private Maison maison;

    /*
    les constructeurs (generé par clic droit)
     */
    public Personne() {
    }


    /*
    les getters and setters(généré par clic droit) :
    les gets permettent de recupérer le contenu des variables (proprietées)
    les sets permettent de modifier le contenu des variables (proprietées)
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Personne getPapa() {
        return papa;
    }

    public void setPapa(Personne papa) {
        this.papa = papa;
    }

    public Personne getMaman() {
        return maman;
    }

    public void setMaman(Personne maman) {
        this.maman = maman;
    }

    public ArrayList<Personne> getEnfants() {
        return enfants;
    }

    public void setEnfants(ArrayList<Personne> enfants) {
        this.enfants = enfants;
    }

    public Maison getMaison() {
        return maison;
    }

    public void setMaison(Maison maison) {
        this.maison = maison;
    }

    /*
    Les surcharges de méthodes (refefinir les actions d'une fonction)
     */
    //ToString : Permet de redéfinir l'affichage, lors de l'appelle d'une variable
    @Override
    public String toString() {

        return this.nom.toUpperCase() + " " + this.prenom.substring(0, 1).toUpperCase() + this.prenom.substring(1).toLowerCase();

    }
    /*
    nos fonctions
     */

}
