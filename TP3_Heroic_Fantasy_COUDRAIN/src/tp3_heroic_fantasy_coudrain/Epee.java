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
public class Epee extends Arme{
   int Finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        Finesse=finesse;
    }
    
    @Override
    public String toString() {
    String chaine;
    chaine= Nom+""+NiveauAttaque+""+Finesse;
    return chaine;
    }
    
}
