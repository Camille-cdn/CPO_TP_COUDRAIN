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
public class Baton extends Arme{
   int Age;
    
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        Age=age;
    }
    
    @Override
    public String toString() {
    String chaine;
    chaine= Nom+""+NiveauAttaque+""+Age;
    return chaine;
    }
}
