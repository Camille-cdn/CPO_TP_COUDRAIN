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
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
} 
    public void Décapsuler(){
    if (ouverte==true){
        System.out.println("Erreur: bière déjà ouverte "+ouverte);
        
    }else{
        ouverte=true;
        System.out.println(ouverte);
    }
    }
    @Override
 public String toString() {
   String chaine_a_retourner;
   chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ; else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}

    public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie, boolean ouvert) {
   nom = unNom;
   degreAlcool = unDegre;
   brasserie = uneBrasserie;
   ouverte = ouvert;
     }
    
}
