/*
Camille COUDRAIN
TDA2
TP2
11 octobre 2023
 */
package tp2_convertisseurobjet_coudrain;

import java.util.Scanner;

/**
 *
 * @author camillecoudrain
 */
public class TP2_convertisseurObjet_COUDRAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur Objet1 = new Convertisseur();
        Objet1.CelciusVersKelvin(28);
        Objet1.FahrenheitVersCelcius(57.8);
        System.out.println("Vous avez effectué : "+ Objet1.nbConversions +" conversions");
        
        Convertisseur Objet2 = new Convertisseur();
        Objet2.KelvinVersCelcius(314);
        Objet2.CelciusVersFahrenheit(23.6);
        Objet2.FahrenheitVersKelvin(67.7);
        System.out.println("Vous avez effectué : "+ Objet2.nbConversions +" conversions");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Bonjour saisissez une valeur:");
        double var1 = sc.nextDouble();
        System.out.println("valeur saisie: "+var1);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n 1)De Celcius vers Kelvin \n 2)De Kelvin vers Celcius \n 3)De fahrenheit vers Celcius \n 4)De Celcius vers Fahrenheit \n 5)De Kelvin vers Fahrenheit \n 6)De Fahrenheit vers Kelvin ");
        int saisieconv=sc.nextInt();
        if (saisieconv==1){
            double a =Objet1.CelciusVersKelvin(var1);
            System.out.println(a);
        }
        if (saisieconv==2){
        double b =Objet2.KelvinVersCelcius(var1);
        System.out.println(b);
        }
        if (saisieconv==3){
        double c =Objet1.FahrenheitVersCelcius(var1);
        System.out.println(c);
        }
        if(saisieconv==4){
        double d =Objet2.CelciusVersFahrenheit(var1);
        System.out.println(d);
        }
        if (saisieconv==5){
        double e=Objet1.KelvinVersFahrenheit(var1);
         System.out.println(e);
        }
        if (saisieconv==6){
        double f=Objet2.FahrenheitVersKelvin(var1);
        System.out.println(f);
        }
        
        
        
        
    }
    
}
