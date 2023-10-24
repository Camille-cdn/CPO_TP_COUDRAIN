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
    String Arme_en_main=null;
    
    ArrayList<Arme> TabArme = new ArrayList<>();
       
    
    public Personnage(String nom, int niveauDeVie){
        Nom=nom;
        NiveauDeVie=niveauDeVie;
    }
    
    
    @Override
    public String toString() {
    String chaine;
    chaine= Nom +" "+ NiveauDeVie;
    return chaine;
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

    public String getArme_en_main() {
        return Arme_en_main;
    }
        
        public void equiper_arme (Arme arme){
        for (int i=0 ; i<TabArme.size() ; i++){
            if (TabArme.get(i).equals(arme)){
                Arme_en_main=TabArme.get(i);
                System.out.println("L'arme à été trouvée et équipée");
                return;
            }
        }  
        System.out.println("L'arme n'a pas été trouvée");
        }
            
            
            
        

    
        



    

    

