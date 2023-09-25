/*
 Camille COUDRAIN
TDA2
TP0
25 septembre 2023
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author camillecoudrain
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("""
                          Please enter the operateur 
                           1) add 
                           2) substract 
                           3) multiply 
                           4) divide 
                           5) modulo """);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrez le nombre:");
        int operateur = sc.nextInt();
   
        System.out.println("\n Entrez une première valeur:");
        int operande1 = sc.nextInt();
        
        System.out.println("\n Entrez une seconde valeur:");
        int operande2 = sc.nextInt();
        
        int result = 0;
       if (operateur == 1)
       result = operande1 + operande2;
       if (operateur ==2)
       result = operande1 - operande2;
       if (operateur ==3)
       result = operande1 * operande2;
       if (operateur ==4)
       result = operande1 / operande2;
       if (operateur ==5)
       result = operande1 % operande2;
      System.out.println("Le résultat est "+ result);
    }
    
}
