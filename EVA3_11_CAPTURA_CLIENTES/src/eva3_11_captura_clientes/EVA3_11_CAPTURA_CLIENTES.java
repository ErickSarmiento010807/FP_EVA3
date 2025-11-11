/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_captura_clientes;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA3_11_CAPTURA_CLIENTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] clientes = new String[5];
        double[] credito = new double[5];
        
        capturarClientes(clientes, credito);
        
        System.out.println("Clientes: ");
        imprimir(clientes);
        
        System.out.println("Credito: ");
        imprimir(credito);
        
        System.out.println("TODO: ");
        imprimir(clientes, credito);
        
        
    }
    public static void capturarClientes(String[] clientes, double credito[]){
    Scanner cap = new Scanner(System.in);
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Nombre del cliente: ");
            clientes[i] = cap.nextLine();
            System.out.println("Creditos: ");
            credito[i] = cap.nextDouble();
            cap.nextLine();
        }
    }
     public static void imprimir(String[] arreglo){
    
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("(" + arreglo[i] + ")");
        }
         System.out.println("");
     } 
     public static void imprimir(double[] credito){
     
         for (int i = 0; i < credito.length; i++) {
            System.out.println("(" + credito[i] + ")");
        }
         System.out.println("");
     }
     public static void imprimir(String[] arreglo, double[] credito){
     
         for (int i = 0; i < credito.length; i++) {
            System.out.print("(" + arreglo[i] + ")");
            System.out.println("(" + credito[i] + ")");
        }
         System.out.println("");
     }
        
}
