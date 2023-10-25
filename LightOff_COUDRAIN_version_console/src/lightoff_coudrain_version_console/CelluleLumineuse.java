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
public class CelluleLumineuse {
    private boolean etat;
    
   /**
     * Création d'un nouvel objet , en lui attribuant un état initial spécifié
     * par le paramètre etat.
     *
     * @param etat L'état initial de la cellule lumineuse. true pour allumée et
     * false pour éteinte.
     */
    public CelluleLumineuse(boolean etat) {
       this.etat = false;
    }
    /**
     *
     * Inverse l'état de la cellule lumineuse. Si la cellule est actuellement
     * allumée, elle sera éteinte, et vice versa.
     */
    public void activerCellule() {
        if (etat == true) {
            etat = false;
        } else {
            etat = true;
        }
 
    }
 
    /**
     * Éteint la cellule lumineuse si elle est actuellement allumée.
     */
    public void eteindreCellule() {
        if (etat == true) {
            etat = false;
        }
    }
 
    /**
     * Verifie si la cellule lumineuse est éteinte.
     *
     * @param cellule L'objet CelluleLumineuse à vérifier.
     * @return renvoie true si la cellule est éteinte, sinon false.
     */
    public boolean estEteint(boolean cellule) {
        if (cellule == false) {
            return true;
        } else {
            return false;
 
        }
    }
 
    /**
     * Obtient l'état de la cellule lumineuse.
     *
     * @return true si la cellule est allumée, sinon false.
     */
    public boolean getEtat(boolean cellule) {
        if (cellule = true) {
            return true;
        } else {
            return false;
        }
    }
 
   /**
* Redéfinit la méthode toString pour afficher l'état de la cellule lumineuse de manière lisible
 * Si la cellule est allumée, elle affiche "X", et si la cellule est éteinte, elle affiche "O".
* @return Une chaîne de caractères représentant l'état de la cellule (X pour allumée, O pour éteinte).
*/
    @Override
    public String toString() {
       return etat ? "X" : "O";
    }
 
    boolean estEteint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    boolean getEtat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
 
 

