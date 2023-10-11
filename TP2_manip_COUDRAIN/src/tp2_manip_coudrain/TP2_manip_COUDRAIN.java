/*
Camille COUDRAIN
TDA2
TP2
11 octobre 2023
 */
package tp2_manip_coudrain;

/**
 *
 * @author camillecoudrain
 */
public class TP2_manip_COUDRAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tartiflette assiette1 = new Tartiflette(500) ;
       Tartiflette assiette2 = new Tartiflette(600) ;
       Tartiflette assiette3 = assiette2 ;
       System.out.println("nb de calories de Assiette 2 : "+assiette2.nbCalories);
       System.out.println("nb de calories de Assiette 3 : "+assiette3.nbCalories);
       
    }
    
}
