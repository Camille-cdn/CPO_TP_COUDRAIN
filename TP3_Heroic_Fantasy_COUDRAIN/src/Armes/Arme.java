/*
Camille COUDRAIN
TDA2
TP3
23 octobre 2023
*/
package Armes;

/**
 *
 * @author camillecoudrain
 */
public abstract class Arme {
    String Nom;
    int NiveauAttaque=100;
   
    
    public Arme(String nom, int niveauAttaque){
        Nom=nom;
        NiveauAttaque=niveauAttaque;
       
    }
    
    
    @Override
    public String toString() {
    String chaine;
    chaine= "Nom : " + Nom +" "+ "Niveau d'attaque : " + NiveauAttaque;
    return chaine;
    }
    
  
}
