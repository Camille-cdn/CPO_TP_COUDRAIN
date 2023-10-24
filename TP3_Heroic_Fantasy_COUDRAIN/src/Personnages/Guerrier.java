/*
Camille COUDRAIN
TDA2
TP3
23 octobre 2023
*/
package Personnages;

import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;



/**
 *
 * @author camillecoudrain
 */
public class Guerrier extends Personnage{
    private boolean Cheval;
    ArrayList<Arme> TabArme = new ArrayList<Arme>();
    Arme Arme_en_main;
    int nbGuer;
    
    
    public Guerrier(String nom, int niveauDeVie, boolean cheval) {
        super(nom, niveauDeVie);
        Cheval=cheval;
        Arme_en_main=null;
        nbGuer+=1;
        
    }

    public boolean ajouter_arme(Arme arme_a_ajouter){
            if(this.TabArme.size() <=5){
                TabArme.add(arme_a_ajouter);
                return true;
            }if (this.TabArme.size()==5){
                return false;
            }
            return false;
        }
    public void choix_arme(Arme arme){
        if (TabArme.contains(arme)){
            Arme_en_main=arme;
        }else{
            System.out.println("Arme non disponible");
        }
    }

    public Arme getArme_en_main() {
        return Arme_en_main;
    }
    
    public String equiper_arme(Arme arme){
        if(TabArme.contains(arme)){
            Arme_en_main=arme;
            return Nom+ "équipe avec "+ Arme_en_main;
        }else{
            return Nom+ "n'a pas d'arme";
        }
    }
    
    public void finalize(){
        nbGuer=nbGuer-1;
    }
    
    public void attaquer(Personnage ennemi){
        int points=20;
        if(Arme_en_main instanceof Epee){
            points=20*((Epee)Arme_en_main).indiceFin;
            fatigue();
        }
        
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
