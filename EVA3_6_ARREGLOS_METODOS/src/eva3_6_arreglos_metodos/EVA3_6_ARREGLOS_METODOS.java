/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_arreglos_metodos;

/**
 *
 * @author Hogar
 */
public class EVA3_6_ARREGLOS_METODOS {
    static String[] menu = {"productos","ventas","clientes","salir"};
    static String[] productos = {"burritos","hamburgesa","tacos","montados"};
    static String[] bebidas = {"agua natural","cocacola","sprite","mansanita","limonada con gas y sin gas"};
    
    
    public static void main(String[] args) {
        imprimirArreglo(menu);
        imprimirArreglo(productos);
        imprimirArreglo(bebidas);
        
        
    }
    public static void imprimirArreglo(String[]arreglo){
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ". " + arreglo[i]);
            
        }
        System.out.println("");
    }
    
    
}
