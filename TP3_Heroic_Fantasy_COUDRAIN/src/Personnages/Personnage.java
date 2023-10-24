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
    String Armeportee=null;
    
    ArrayList<Arme> TabArme = new ArrayList<>();
       
    
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
    
    
   
        public boolean ajouter_arme(Arme arme_a_ajouter){
            if(this.TabArme.size() <=5){
                TabArme.add(arme_a_ajouter);
                return true;
            }if (this.TabArme.size()==5){
                return false;
            }
            return false;
        }
        
        public void Arme_en_main(){
            System.out.println("Voici les armes disponibles, quel sera votre choix?");
            for(int i=0;i<this.TabArme.size();i++){
                System.out.println("("+ i + ")" + this.TabArme.get(i));
            }
            
            
            
            
        }

    public String getArmeportee() {
        return Armeportee;
    }
        }



    

    

