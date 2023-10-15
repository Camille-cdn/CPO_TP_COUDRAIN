/*
Camille COUDRAIN
TDA2
TP2
15 octobre 2023
*/
package tp2_relation_1_coudrain;

/**
 *
 * @author camillecoudrain
 */
public class Voiture {
    String Modele;
    String Marque;
    int Puissance;
    Personne Proprietaire;
   
    public Voiture(String modele, String marque,int puissance) {
        Modele=modele;
        Marque=marque;
        Puissance=puissance;
        Proprietaire=null;
       
    }
    
    @Override
    public String toString() {
        String chaine;
        chaine=Modele+" "+Marque+" "+Puissance;
        return chaine;
    }
 
    
   
    
    
}
