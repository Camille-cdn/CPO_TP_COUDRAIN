/*
Camille COUDRAIN
TDA2
TP3
23 octobre 2023
*/
package tp3_heroic_fantasy_coudrain;

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
    chaine= Nom+""+NiveauAttaque;
    return chaine;
    }
    
  
}
