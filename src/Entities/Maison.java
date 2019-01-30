/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Ikikay
 */
public class Maison {

    /*
    les propriétés
     */
    private Integer id;
    private Integer numRue;
    private String rue;
    private Integer cp;
    private String ville;

    /*
    les constructeurs (generé par clic droit)
     */
    public Maison() {
    }

    public Maison(Integer numRue, String rue, Integer cp, String ville) {
        this.numRue = numRue;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }


    /*
    les getters and setters(généré par clic droit) :
    les gets permettent de recupérer le contenu des variables (proprietées)
    les sets permettent de modifier le contenu des variables (proprietées)
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumRue() {
        return numRue;
    }

    public void setNumRue(Integer numRue) {
        this.numRue = numRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    /*
    Les surcharges de méthodes (refefinir les actions d'une fonction)
     */
    //ToString : Permet de redéfinir l'affichage, lors de l'appelle d'une variable
    @Override
    public String toString() {
        String sautDeLigne = System.getProperty("line.separator");
        return this.numRue + " " + this.rue + " "
                + sautDeLigne
                + this.cp + " " + this.ville;
    }
    /*
    nos fonctions
     */
}
