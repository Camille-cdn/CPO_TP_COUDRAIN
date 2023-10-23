/*
Camille COUDRAIN
TDA2
TP3
23 octobre 2023
*/
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author camillecoudrain
 */
public class Magicien extends Personnage {
    private boolean Confirme;

    
    public Magicien(String nom, int niveauDeVie, boolean confirme) {
        super(nom, niveauDeVie);
        Confirme=confirme;
    }

    @Override
    public String toString() {
        return "Magicien{" + "Nom = " + Nom + "\n Niveau de vie = " + NiveauDeVie + "\n Confirme=" + Confirme + '}';
    }
    
    
    
    public boolean isConfirme() {
        return Confirme;
    }

    public void setConfirme(boolean Confirme) {
        this.Confirme = Confirme;
    }
    
}
