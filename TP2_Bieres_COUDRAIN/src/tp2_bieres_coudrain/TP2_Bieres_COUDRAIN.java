/*
Camille COUDRAIN
TDA2
TP2
4 octobre 2023
 */
package tp2_bieres_coudrain;

/**
 *
 * @author camillecoudrain
 */
public class TP2_Bieres_COUDRAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
  BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson",false);
  uneBiere.lireEtiquette();
  System.out.println(uneBiere) ;
  uneBiere.Décapsuler();
  
  
  BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe",true);
  deuxBiere.lireEtiquette();
  System.out.println(deuxBiere) ;
  deuxBiere.Décapsuler();
  
        
  BouteilleBiere troisBiere = new BouteilleBiere("JUL",8.9,"D'or et de platine",false);
  troisBiere.lireEtiquette();
  System.out.println(troisBiere) ;
  troisBiere.Décapsuler();
 
  
  BouteilleBiere quatreBiere = new BouteilleBiere("Lacrim",4.3,"Gustavo Gavaria",false);
  quatreBiere.lireEtiquette();
  System.out.println(quatreBiere);
  quatreBiere.Décapsuler();
   
  
  BouteilleBiere cinqBiere = new BouteilleBiere("Kalash",9.9,"Tombolo",false);
  cinqBiere.lireEtiquette();
  System.out.println(cinqBiere);
  cinqBiere.Décapsuler();
 
    }
    
}
