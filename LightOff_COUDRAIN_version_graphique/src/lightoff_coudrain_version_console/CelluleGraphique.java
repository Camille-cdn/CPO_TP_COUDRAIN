/*
Camille Coudrain
TDA
projet
6 novembre 2023
*/
package lightoff_coudrain_version_console;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author camillecoudrain
 */
public class CelluleGraphique extends JButton {
    CelluleLumineuse celluleLumineuseAssociee;
    int largeur;
    int longueur;

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int longueur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.largeur = largeur;
        this.longueur = longueur;
    }
    
    @Override
   protected void paintComponent(Graphics g) {
   super.paintComponent(g);
   this.setText(celluleLumineuseAssociee.toString());
}
    
    
}
