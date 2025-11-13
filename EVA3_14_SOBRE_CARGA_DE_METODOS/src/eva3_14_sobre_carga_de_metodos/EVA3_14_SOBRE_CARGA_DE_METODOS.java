/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_sobre_carga_de_metodos;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA3_14_SOBRE_CARGA_DE_METODOS {

    
    public static void main(String[] args) {
        
        Scanner cap = new Scanner(System.in);
        int valor;
        double area, resu, base, altura, arearec, basema, basemen, altu;
        
        do {
            imprimirMenu();
            valor = cap.nextInt();
            
            switch (valor) {
                    case 1:
                        System.out.println("°°°°°°°°Calcular el area del circulo°°°°°°°°");
                        
                        System.out.println("Ingresa el radio del circulo: ");
                        area = cap.nextDouble();
                        
                        resu = calculaArea(area);
                        
                        System.out.println("El area del circulo es: " + resu);
                    
                    break;
                    
                    case 2:
                        System.out.println("°°°°°°°°Calcular el area del rectangulo°°°°°°°°");
                        
                        System.out.println("Ingresa la base: ");
                        base = cap.nextDouble();
                        
                        System.out.println("Ingresa la altura: ");
                        altura = cap.nextDouble();
                        
                        resu = calculaArea(base, altura);
                        
                        System.out.println("El area del rectangulo es: " + resu);
                        
                    break;
                    
                    case 3:
                        System.out.println("°°°°°°°°Calcular el area del rectangulo°°°°°°°°");
                        
                        System.out.println("Ingresa la base mayor: ");
                        basema = cap.nextDouble();
                        
                        System.out.println("Ingresa la base menor: ");
                        basemen = cap.nextDouble();
                        
                        System.out.println("Ingresa la altura: ");
                        altu = cap.nextDouble();
                        
                        resu = calculaArea(basema, basemen, altu);
                        
                        System.out.println("El area del trapecio es: " + resu);
                    
                    break;
                    
                    case 4:
                    
                    break;
                
            }
            
        } while (valor !=4);
        
    }
    public static void imprimirMenu(){
     
         System.out.println("BIENVENIDO AL SISTEMA");
         System.out.println("Elige la opcion que necesitas");
         System.out.println("1.Calcular la area del circulo: ");
         System.out.println("2.calcular la area del rectangulo: ");
         System.out.println("3.Calcular la area del trapecio");
         System.out.println("4.cerrar");
         
         System.out.println("¿Que opcion quieres? ");
     }
    
    public static double calculaArea(double radio){
    
        double pi = 3.1416;
  
        return pi * (radio * radio);
        
    }
    
    public static double calculaArea(double base, double altura){
    
        return base * altura;
        
    }
    public static double calculaArea(double basema, double basemen, double altu){
    
  
        return ((basema + basemen) / 2) * altu;
        
    }
    
}
