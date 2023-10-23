/*
Camille COUDRAIN
TDA2
TP3
23 octobre 2023
*/
package Personnages;

import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author camillecoudrain
 */
public abstract class Personnage {
    String Nom;
    int NiveauDeVie=0;
    int nbArmes=0;
    
    public Personnage(String nom, int niveauDeVie){
        Nom=nom;
        NiveauDeVie=niveauDeVie;
    }
    
    
    @Override
    public String toString() {
    String chaine;
    chaine= Nom+""+NiveauDeVie;
    return chaine;
    }
    
    ArrayList<Arme> TabArme = new ArrayList<>();
        TabArme.add(epee1);
        TabArme.add(epee2);
        TabArme.add(baton1);
        TabArme.add(baton2);
   
        

    }
    

    

