/*
Camille COUDRAIN
TDA2
TP3
23 octobre 2023
*/
package Personnages;



/**
 *
 * @author camillecoudrain
 */
public class Guerrier extends Personnage{
    private boolean Cheval;
    
    public Guerrier(String nom, int niveauDeVie, boolean cheval) {
        super(nom, niveauDeVie);
        Cheval=cheval;
    }

    @Override
    public String toString() {
        return  "Guerrier{" + "Nom = " + Nom + "\n Niveau de vie = " + NiveauDeVie + "\n Cheval=" + Cheval + '}';
    }
    
    

    public void setCheval(boolean Cheval) {
        this.Cheval = Cheval;
    }

    public boolean isCheval() {
        return Cheval;
    }
    
    
}
