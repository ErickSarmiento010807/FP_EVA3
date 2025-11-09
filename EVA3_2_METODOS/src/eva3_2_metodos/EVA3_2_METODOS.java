/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_metodos;

/**
 *
 * @author Hogar
 */
public class EVA3_2_METODOS {

    public static void main(String[] args) {
        
        repetirMensaje("Hola", 5);
    
    }
    
    public static void repetirMensaje(String mensaje, int repeticion){
        for (int i = 1; i <= repeticion; i++) {
            System.out.println(mensaje);
        }
    }
    
}
