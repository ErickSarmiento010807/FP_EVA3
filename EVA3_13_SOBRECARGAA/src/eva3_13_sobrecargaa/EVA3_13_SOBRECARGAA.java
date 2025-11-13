/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_sobrecargaa;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA3_13_SOBRECARGAA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String resu;
        resu = capturar("Itroducir el nombre del cliente; ");
        System.out.println(resu);
        double valor;
        valor = capturar("Salario del empleado: ", 0);
        System.out.println(valor);
        int edad;
        edad = capturar("Introdusca la edad: ", 1);
        System.out.println(edad);
        
    }
    public static String capturar(String mensaje){
    
        Scanner cap = new Scanner(System.in);

        System.out.println(mensaje);
        return cap.nextLine();
    }
    public static double capturar(String mensaje, double dummy){
    
        Scanner cap = new Scanner(System.in);

        System.out.println(mensaje);
        return cap.nextDouble();
    }
    public static int capturar(String mensaje, int dummy){
    
        Scanner cap = new Scanner(System.in);

        System.out.println(mensaje);
        return cap.nextInt();
    }
    
    
}
