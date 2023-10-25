/*
Camille COUDRAIN
TDA
projet
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
        CelluleLumineuse cellule1 = new CelluleLumineuse();
          cellule1.activerCellule();
        System.out.println("État initial de la cellule 1 : " + cellule1);
 
        cellule1.eteindreCellule();
        System.out.println("Nouvel état de la cellule 1 : " + cellule1);
 
        CelluleLumineuse cellule2 = new CelluleLumineuse();
        System.out.println("État initial de la cellule 2 : " + cellule2);
       
        cellule2.activerCellule();
        System.out.println("Nouvel état de la cellule 2 : " + cellule2);
 
        boolean estEteinte = cellule2.estEteint();
        System.out.println("La cellule 2 est éteinte : " + estEteinte);
 
        boolean etatCellule1 = cellule1.getEtat();
        System.out.println("État de la cellule 1 : " + etatCellule1);
        
        
        
      
        GrilleDeJeu grille = new GrilleDeJeu(5, 5);

        
        System.out.println("Grille initiale (toutes les cellules éteintes) :");
        System.out.println(grille);

    
        grille.activerLigneDeCellules(2); 
        System.out.println("Grille après activation de la ligne 2 :");
        System.out.println(grille);

        grille.activerColonneDeCellules(3); 
        System.out.println("Grille après activation de la colonne 3 :");
        System.out.println(grille);

        grille.activerDiagonaleDescendante();
        System.out.println("Grille après activation de la diagonale descendante :");
        System.out.println(grille);

        grille.activerDiagonaleMontante(); 
        System.out.println("Grille après activation de la diagonale montante :");
        System.out.println(grille);

        grille.activerLigneColonneOuDiagonaleAleatoire(); 
        System.out.println("Grille après activation aléatoire :");
        System.out.println(grille);

        grille.melangerMatriceAleatoirement(10); 
        System.out.println("Grille après mélange aléatoire (10 tours) :");
        System.out.println(grille);
    }
    
}
