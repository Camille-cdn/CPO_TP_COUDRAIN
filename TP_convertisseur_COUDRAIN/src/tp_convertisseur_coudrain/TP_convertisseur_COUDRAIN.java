/*
COUDRAIN Camille
TDA2
TP1
26 septembre 2023
 */
package tp_convertisseur_coudrain;

import java.util.Scanner;

/**
 *
 * @author camillecoudrain
 */
public class TP_convertisseur_COUDRAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Bonjour saisissez une valeur:");
        double var1 = sc.nextDouble();
        System.out.println("valeur saisie: "+var1);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n 1)De Celcius vers Kelvin \n 2)De Kelvin vers Celcius \n 3)De fahrenheit vers Celcius \n 4)De Celcius vers Fahrenheit \n 5)De Kelvin vers Fahrenheit \n 6)De Fahrenheit vers Kelvin ");
        int saisieconv=sc.nextInt();
        if (saisieconv==1){
            double a =CelciusVersKelvin(var1);
            System.out.println(a);
        }
        if (saisieconv==2){
        double b =KelvinVersCelcius(var1);
        System.out.println(b);
        }
        if (saisieconv==3){
        double c =FahrenheitVersCelcius(var1);
        System.out.println(c);
        }
        if(saisieconv==4){
        double d =CelciusVersFahrenheit(var1);
        System.out.println(d);
        }
        if (saisieconv==5){
        double e=KelvinVersFahrenheit(var1);
         System.out.println(e);
        }
        if (saisieconv==6){
        double f=FahrenheitVersKelvin(var1);
        System.out.println(f);
        }
    }
     
public static double CelciusVersKelvin (double tCelcius) { 
    double tKelvin= tCelcius+273.15;
    return tKelvin;
}   
public static double KelvinVersCelcius (double tKelvin) { 
    double tCelcius= tKelvin-273.15;
    return tCelcius;
}
public static double FahrenheitVersCelcius (double tFahrenheit) { 
    double tCelcius= (tFahrenheit-32)/1.8;
    return tCelcius;
}
public static double CelciusVersFahrenheit (double tCelcius) { 
    double tFahrenheit= (tCelcius*1.8)+32;
    return tFahrenheit;
}
public static double KelvinVersFahrenheit (double tKelvin) { 
    double tFahrenheit= (tKelvin-273.15)*1.8+32;
    return tFahrenheit;
}
public static double FahrenheitVersKelvin (double tFahrenheit) { 
    double tKelvin= (tFahrenheit-32)*(5.0/9)+273.15;
    return tKelvin;
}
}
