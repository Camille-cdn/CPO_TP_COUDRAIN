/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camillecoudrain
 */
public class FenetrePrincipale {
    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetrePrincipale extends javax.swing.JFrame {

    private Echiquier echiquier;

    public FenetrePrincipale() {
        initComponents();
        int taille = 10;
        this.echiquier = new Echiquier(taille);
        PanelEchiquier.setLayout(new GridLayout(taille, taille));

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                CelluleGraphique celluleGraphique = new CelluleGraphique(echiquier.grid[i][j], 1440 / taille, 1080 / taille, i, j);
                celluleGraphique.addActionListener(e -> onCelluleClicked(celluleGraphique));
                PanelEchiquier.add(celluleGraphique);
            }
        }
        echiquier.parcours();
    }

    private void initComponents() {
        PanelEchiquier = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelEchiquier.setBackground(new java.awt.Color(255, 153, 0));
        PanelEchiquier.setMaximumSize(new java.awt.Dimension(1440, 1080));

        javax.swing.GroupLayout PanelEchiquierLayout = new javax.swing.GroupLayout(PanelEchiquier);
        PanelEchiquier.setLayout(PanelEchiquierLayout);
        PanelEchiquierLayout.setHorizontalGroup(
                PanelEchiquierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 620, Short.MAX_VALUE)
        );
        PanelEchiquierLayout.setVerticalGroup(
                PanelEchiquierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(PanelEchiquier, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 620, 560));

        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new FenetrePrincipale().setVisible(true));
    }

    private void onCelluleClicked(CelluleGraphique celluleGraphique) {
        int newLigne = celluleGraphique.getLigne();
        int newColonne = celluleGraphique.getColonne();

        int ligne = echiquier.CoordCavalierX();
        int colonne = echiquier.CoordCavalierY();

        if (echiquier.verif(ligne, colonne, newLigne, newColonne)) {
            echiquier.grid[ligne][colonne].setEtat(1);
            echiquier.grid[newLigne][newColonne].setEtat(3);
            repaint();
        }
    }

    private void repaint() {
        // Ajoutez ici le code de mise à jour de l'interface graphique après chaque clic sur une cellule
    }

    private javax.swing.JPanel PanelEchiquier;
}
    
}
