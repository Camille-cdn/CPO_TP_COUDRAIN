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
public class Baton extends Arme{
   int Age;
    
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        Age=age;
    }
    
    @Override
    public String toString() {
         return "Baton{" + "Nom = " + Nom + "\n Niveau d'attaque = " + NiveauAttaque + "\n Age = " + Age + "}";
    } 
}
