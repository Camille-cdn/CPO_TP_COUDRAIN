/* Camille COUDRAIN
TDA2
TP0 exercice 1
25 septembre 2023
*/
package exo1;

import java.util.Scanner;

/**
 *
 * @author camillecoudrain
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Bonjour");
       System.out.println("Au revoir");
       String prenom;
       Scanner sc;
       sc = new Scanner(System.in);
       System.out.println("Bonjour, quel est votre prenom?");
       prenom= sc.nextLine();
       System.out.println("Bonjour " + prenom);
    }
    
}
