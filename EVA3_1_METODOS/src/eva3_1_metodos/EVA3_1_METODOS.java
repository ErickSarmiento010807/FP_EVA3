/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author Hogar
 */
public class EVA3_1_METODOS {
    
    public static void main(String[] args) {
        //INVORCAR EL METODO
        //LLAMADA A PROCEDIMIENTO O FUNCIÓN
        //1. queremos recuperar el valor
        
        int resu = calcularCuadrado(16);
        System.out.println("El cuadrado de 100 es: " + resu);
        
        //2. usar el valor sin guardarlo
        
        System.out.println("El cuadrado de 16 es: " + calcularCuadrado(16));
        
        //3. no me interesa el resultado
        
        calcularCuadrado(16);
    }
    //Modificadores
    //Modificador de acceso: public, private,protected,default
    //static --> se necesita para usar nuestros métodos en el main
    //public static
                    //Valor de retorno (tipo de dato
                        //Nombre del metodo (Usar verbo)
                                        //(Lista de parámetros)
                                        //Cero o n cantidad
    
    public static int calcularCuadrado(int num) { //ENCABEZADO (HEADER)
        //{} ----> iMPLEMENTACION DEL METODO (CUERPO DEL METODO)
        int cuadrado = num * num;
        
        return cuadrado; //regresamos el resultado
        //ya no se puede poner codigo aqui
        //System.out.println(""); //error, no se puede poner codigo abajo del return
    }
}
