/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA3_3_METODOS {

    public static void main(String[] args) {
         
         Scanner cap = new Scanner(System.in);
         int valor;
         do{
            imprimirMenu();
            valor = cap.nextInt();
            
            switch(valor){
            
                case 1:
                    System.out.println("*******Sumar dos numeros*******");
                    realizarSuma();
                    break;
                case 2:
                    System.out.println("*******Calcular potencia*******");
                    realizarPotencia();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            }
         }while(valor != 4);
     
    }
    //IMPRIMIR UN MENÚ:
     public static void imprimirMenu(){
     
         System.out.println("BIENVENIDO AL SISTEMA");
         System.out.println("Elige la opcion que necesitas");
         System.out.println("1.Calcular una suma");
         System.out.println("2.calcular una potencia");
         System.out.println("3.imprimir mensaje");
         System.out.println("4.cerrar");
     }
     
     //
     public static void realizarSuma(){
         
         Scanner cap = new Scanner(System.in);
         int val1, val2;
         
         System.out.println("Valor 1: ");
         val1 = cap.nextInt();
         
         System.out.println("Valor 2: ");
         val2 = cap.nextInt();
         
         int resu = sumar(val1, val2);
         System.out.println("La suma es" + resu);
     }
     
     public static int sumar(int num1, int num2){
         
         return num1 + num2;
     }
     //Calcular una potencia
     public static void realizarPotencia(){
     
         Scanner cap = new Scanner(System.in);
         int val1, val2;
         
         System.out.println("Base: ");
         val1 = cap.nextInt();
         
         System.out.println("Exponente: ");
         val2 = cap.nextInt();
         
         int resu = calcularPotencia(val1, val2);
         System.out.println("La potencia es: " + resu);
     }
     
    public static int calcularPotencia(int base,int expo){
        int potencia = 1;
        for (int i = 1; i <= expo; i++) {
            
            potencia = potencia * base;
                
        }
        return potencia;
    }
    
}
