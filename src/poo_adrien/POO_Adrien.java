/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_adrien;

import Entities.Personne;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ikikay
 */
public class POO_Adrien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // DEBUT DU JEU DE TEST
        //Nos variables utiles
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateTampon = null;
        String dateNaissanceTampon = "";

        //Nos personnes
        Personne suzane = new Personne();
        suzane.setPrenom("Suzane");
        suzane.setNom("");
        dateNaissanceTampon = "19/05/1888";
        dateTampon = simpleDateFormat.parse(dateNaissanceTampon);
        suzane.setDateNaissance(dateTampon);

        Personne yves = new Personne();
        yves.setPrenom("yves");
        yves.setNom("");
        dateNaissanceTampon = "27/02/1858";
        dateTampon = simpleDateFormat.parse(dateNaissanceTampon);
        yves.setDateNaissance(dateTampon);

        Personne michelle = new Personne();
        michelle.setPrenom("michelle");
        michelle.setNom("");
        dateNaissanceTampon = "17/12/1884";
        dateTampon = simpleDateFormat.parse(dateNaissanceTampon);
        michelle.setDateNaissance(dateTampon);

        Personne jean = new Personne();
        jean.setPrenom("jean");
        jean.setNom("FORT");
        dateNaissanceTampon = "19/11/1884";
        dateTampon = simpleDateFormat.parse(dateNaissanceTampon);
        jean.setDateNaissance(dateTampon);

        Personne fabienne = new Personne();
        fabienne.setPrenom("fabienne");
        fabienne.setNom("");
        dateNaissanceTampon = "19/08/1969";
        dateTampon = simpleDateFormat.parse(dateNaissanceTampon);
        fabienne.setDateNaissance(dateTampon);
        fabienne.setMaman(suzane);
        suzane.getEnfants().add(fabienne);
        fabienne.setPapa(yves);
        yves.getEnfants().add(fabienne);

        Personne jeanl = new Personne();
        jeanl.setPrenom("jean luc");
        jeanl.setNom("FORT");
        dateNaissanceTampon = "19/07/1965";
        dateTampon = simpleDateFormat.parse(dateNaissanceTampon);
        jeanl.setDateNaissance(dateTampon);
        jeanl.setMaman(michelle);
        michelle.getEnfants().add(jeanl);
        jeanl.setPapa(jean);
        jean.getEnfants().add(jeanl);

        Personne anne = new Personne();
        anne.setPrenom("anne");
        anne.setNom("FORT");
        dateNaissanceTampon = "02/12/1995";
        dateTampon = simpleDateFormat.parse(dateNaissanceTampon);
        anne.setDateNaissance(dateTampon);
        anne.setMaman(fabienne);
        fabienne.getEnfants().add(anne);
        anne.setPapa(jeanl);
        jeanl.getEnfants().add(anne);

        Personne adrien = new Personne();
        adrien.setPrenom("adrien");
        adrien.setNom("FORT");
        dateNaissanceTampon = "19/12/1997";
        dateTampon = simpleDateFormat.parse(dateNaissanceTampon);
        adrien.setDateNaissance(dateTampon);
        adrien.setMaman(fabienne);
        fabienne.getEnfants().add(adrien);
        adrien.setPapa(jeanl);
        jeanl.getEnfants().add(adrien);

        // FIN DU JEU DE TEST
        System.out.println(fabienne);
    }
}
