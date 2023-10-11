/*
Camille COUDRAIN
TDA2
TP2
11 octobre 2023
 */
package tp2_convertisseurobjet_coudrain;

/**
 *
 * @author camillecoudrain
 */
public class Convertisseur {
    int nbConversions;
     public Convertisseur () {
   nbConversions = 0 ;
}
     
public double CelciusVersKelvin (double tCelcius) { 
    nbConversions++;
    double tKelvin= tCelcius+273.15;
    return tKelvin;
}   
public double KelvinVersCelcius (double tKelvin) { 
    nbConversions++;
    double tCelcius= tKelvin-273.15;
    return tCelcius;
}
public double FahrenheitVersCelcius (double tFahrenheit) { 
    nbConversions++;
    double tCelcius= (tFahrenheit-32)/1.8;
    return tCelcius;
}
public double CelciusVersFahrenheit (double tCelcius) { 
    nbConversions++;
    double tFahrenheit= (tCelcius*1.8)+32;
    return tFahrenheit;
}
public double KelvinVersFahrenheit (double tKelvin) { 
    nbConversions++;
    double tFahrenheit= (tKelvin-273.15)*1.8+32;
    return tFahrenheit;
}
public double FahrenheitVersKelvin (double tFahrenheit) { 
    nbConversions++;
    double tKelvin= (tFahrenheit-32)*(5.0/9)+273.15;
    return tKelvin;
}

@Override
public String toString() {
  return "nb de conversions"+ nbConversions;
}
}
     

