/*
Camille COUDRAIN
TDA
TP3
25 octobre 2023
 */
package lightoff_coudrain_version_console;

/**
 *
 * @author camillecoudrain
 */
public class LightOff_COUDRAIN_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse cellule1 = new CelluleLumineuse(true);
          cellule1.activerCellule();
        System.out.println("État initial de la cellule 1 : " + cellule1);
 
        cellule1.eteindreCellule();
        System.out.println("Nouvel état de la cellule 1 : " + cellule1);
 
        CelluleLumineuse cellule2 = new CelluleLumineuse(false);
        System.out.println("État initial de la cellule 2 : " + cellule2);
       
        cellule2.activerCellule();
        System.out.println("Nouvel état de la cellule 2 : " + cellule2);
 
        boolean estEteinte = cellule2.estEteint();
        System.out.println("La cellule 2 est éteinte : " + estEteinte);
 
        boolean etatCellule1 = cellule1.getEtat();
        System.out.println("État de la cellule 1 : " + etatCellule1);
    }
    
}
