/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA3_4_Temperatura {

    
    public static void main(String[] args) {
    
        Scanner cap = new Scanner(System.in);
        int valor;
        double temp, resu;
        do{
        imprimirMenu();
        valor = cap.nextInt();
        
        switch(valor){
            
                case 1:
                    System.out.println("*******Conversion fahrenheit a celcius*******");
                    
                    System.out.println("Ingresa el los grados fahrenheit: ");
                    temp = cap.nextDouble();
                    
                    resu = convertirFarCelcius(temp);
                    
                    System.out.println("El resultado es" + resu + "°C");
                    break;
                case 2:
                    System.out.println("*******Conversion celsius a kelvin*******");
                    
                    System.out.println("Ingresa el los grados Celsius: ");
                    temp = cap.nextDouble();
                    
                    resu = convertirCelKev(temp);
                    
                    System.out.println("El resultado es" + resu + "°C");
                    break;
                case 3:
                    System.out.println("*******Conversion fahrenheit a kelvin*******");
                    
                    System.out.println("Ingresa el los grados fahr1enheit: ");
                    temp = cap.nextDouble();
                    
                    resu = convertirFarKev(temp);
                    
                    System.out.println("El resultado es" + resu + "°C");
                    break;
                case 4:
                    
                    break;
            }
         }while(valor != 4);
        }
        
    
    public static double convertirFarCelcius(double far){
    double resu = (far -32) / 1.8;
    return resu;
    }
    
    public static double convertirCelKev(double cel){
    double resu = (cel + 273.15);
    return resu;
    }
    
    public static double convertirFarKev(double faar){
    double resu = (faar - 32) * 5/9 + 273.15;
    return resu;
    }
    public static void imprimirMenu(){
     
         System.out.println("BIENVENIDO AL MENU DE CONVERSIONES");
         System.out.println("Elige la opcion que necesitas");
         System.out.println("1.Fahrenheit a celcius");
         System.out.println("2.Celcius a kelvin");
         System.out.println("3.Fahrenheit a kelvin");
         System.out.println("4.cerrar");
     }
    
}
