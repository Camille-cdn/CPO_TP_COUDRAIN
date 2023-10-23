/*
Camille COUDRAIN
TDA2
TP3
23 octobre 2023
*/
package Armes;

import Armes.Arme;

/**
 *
 * @author camillecoudrain
 */
public class Epee extends Arme{
   int Finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        Finesse=finesse;
    }
    
    @Override
    public String toString() {
    return "Epée{" + "Nom = " + Nom + "\n Niveau d'attaque = " + NiveauAttaque + "\n Finesse = " + Finesse + "}";
    }
    
}
