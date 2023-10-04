/*
Camille COUDRAIN
TDA2
TP1
4 octobre 2023
 */
package tp1_guessmynumber_coudrain;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author camillecoudrain
 */
public class TP1_guessMyNumber_COUDRAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = generateurAleat.nextInt(100);
        System.out.println("Quelle difficulté souhaitez vous? \n 1)Facile \n 2)Moyen \n 3)Difficile");
        int menu = sc.nextInt();
        if (menu == 1) {
            System.out.println("Vous avez choisi le mode facile, vous avez un nombre de tentatives illimité, le nombre à deviner est entre 0 et 100");
            System.out.println("Saisissez un premier nombre!:");
            int nombreSaisi = sc.nextInt();
            int nbTentatives = 1;
            while (nombreSaisi != n) {
                if (nombreSaisi < n) {
                    System.out.println("nombre trop petit");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;

                }
                if (nombreSaisi > n) {
                    System.out.println("nombre trop grand");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;
                }
            }
            System.out.println("Correct! le nombre à devenir était bien " + n + "\n Vous avez effectué " + nbTentatives);
        }
        if (menu == 2) {
            System.out.println("Vous avez choisi le mode moyen, vous avez 5 tentatives pour trouver un nombre entre 0 et 100");
            System.out.println("Saisissez un premier nombre!:");
            int nombreSaisi = sc.nextInt();
            int nbTentatives = 1;
            while (nbTentatives < 5 && nombreSaisi != n) {
                if (nombreSaisi < n) {
                    System.out.println("nombre trop petit");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;

                }
                if (nombreSaisi > n) {
                    System.out.println("nombre trop grand");
                    nombreSaisi = sc.nextInt();
                    nbTentatives = nbTentatives + 1;
                }
            }
            if (nbTentatives < 5) {
                System.out.println("Correct! le nombre à devenir était bien " + n + "\n Vous avez effectué " + nbTentatives);
            } else {
                System.out.println("Vous avez dépassé le nombre de tentatives autorisé, le nombre correct était " + n);
            }

        }

        

        if (menu== 3) {
            System.out.println("Vous avez choisi le monde difficile, vous avez 3 tentatives pour trouver un nombre entre 0 et 100");
            System.out.println("Saisissez un premier nombre!:");
            int nombreSaisi = sc.nextInt();
            int nbTentatives = 1;
            while (nbTentatives < 3 && nombreSaisi != n) {
                
                    if (nombreSaisi < n) {
                        System.out.println("nombre trop petit");
                        nombreSaisi = sc.nextInt();
                        nbTentatives = nbTentatives + 1;

                    }
                    if (nombreSaisi > n) {
                        System.out.println("nombre trop grand");
                        nombreSaisi = sc.nextInt();
                        nbTentatives = nbTentatives + 1;
                    }
                
                
            }if (nbTentatives< 3){
                System.out.println("Correct! le nombre à devenir était bien " + n + "\n Vous avez effectué "+nbTentatives);
            }else{
                System.out.println("Vous avez dépassé le nombre de tentatives autorisé, le nombre correct était " + n);
            }

    }
}
}

