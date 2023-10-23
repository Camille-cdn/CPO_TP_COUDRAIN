/*
Camille COUDRAIN
TDA2
TP3
23 octobre 2023
*/
package tp3_heroic_fantasy_coudrain;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author camillecoudrain
 */
public class TP3_Heroic_Fantasy_COUDRAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur",7,5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        
        Baton baton1 = new Baton("Chene", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);
        
        
        ArrayList<Arme> TabArme = new ArrayList<>();
        TabArme.add(epee1);
        TabArme.add(epee2);
        TabArme.add(baton1);
        TabArme.add(baton2);
        
        for (int i=0;i<TabArme.size();i++){
            System.out.println(TabArme.get(i));
        }
        
        Magicien magicien1 = new Magicien("Gandalf",65,true);
        Magicien magicien2 = new Magicien("Garcimore",44,false);
        
        Guerrier guerrier1 = new Guerrier("Conan",78,false);
        Guerrier guerrier2 = new Guerrier("Lanister",45,true);
        
        ArrayList<Personnage> TabPersonnage = new ArrayList<>();
        TabPersonnage.add(magicien1);
        TabPersonnage.add(magicien2);
        TabPersonnage.add(guerrier1);
        TabPersonnage.add(guerrier2);
        
        for (int i=0;i<TabPersonnage.size();i++){
            System.out.println(TabPersonnage.get(i));
        }
        
        
        
        
        
        
        
    }
    
}
