/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_parametros;

/**
 *
 * @author Hogar
 */
public class EVA3_7_PASO_PARAMETROS {

    
    public static void main(String[] args) {
        
        int nume = 5;
        System.out.println("original = " + nume);
        incrementar(nume);//Se manda una copia del valor almacenado en: nume
        System.out.println("despues de incrementar = " + nume);
        
    }
    public static void incrementar(int valor){
    
        valor = valor + 1;
        
    }
    
}
