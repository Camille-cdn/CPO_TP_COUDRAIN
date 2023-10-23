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
    Personnage Proprietaire;
    
    public Arme(String nom, int niveauAttaque){
        Nom=nom;
        NiveauAttaque=niveauAttaque;
        Proprietaire=null;
    }
    
    
    @Override
    public String toString() {
    String chaine;
    chaine= Nom+""+NiveauAttaque;
    return chaine;
    }
    
  
}
