/*
COUDRAIN Camille
TDA2
TP1
26 septembre 2023
 */
package tp_manipnombreint_coudrain;

import java.util.Scanner;

/**
 *
 * @author camillecoudrain
 */
public class TP_manipNombreInt_COUDRAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("\n Saisissez deux entiers:");
        int entier1 = sc.nextInt();
        int entier2 = sc.nextInt();
        int somme = entier1 +entier2;
        System.out.println("entiers saisis: "+ entier1 +" et "+ entier2);
        System.out.println("la somme de ces entiers est "+somme);
        int difference=entier1-entier2;
        System.out.println("la différence de ces entiers est "+difference);
        int produit=entier1*entier2;
        System.out.println("le produit de ces entiers est "+produit);
        int quotient=entier1/entier2;
        System.out.println("le quotient de ces entiers est "+quotient);
        int reste=entier1%entier2;
        System.out.println("le reste de la division de ces entiers est "+reste);
    }
    
}
