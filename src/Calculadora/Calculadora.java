
package Calculadora;

import java.util.Scanner;
/**
 *
 * @author uvemo
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int opcionSeleccionada; 
        
        Scanner seleccion = new Scanner(System.in);
        Menu menu = new Menu();
        Operaciones operacion = new Operaciones(); 
        
        
        try {
            do {
                menu.opciones();
                System.out.println("Seleccione una operación a realizar:");
                opcionSeleccionada = seleccion.nextInt();
                
                switch (opcionSeleccionada) {
                    case 1: {
                        menu.primerNumero();
                        operacion.setA(seleccion.nextInt());
                        menu.segundoNumero();
                        operacion.setB(seleccion.nextInt());
                        operacion.suma();
                    }
                    case 2 : {
                        menu.primerNumero();
                        operacion.setA(seleccion.nextInt());
                        menu.segundoNumero();
                        operacion.setB(seleccion.nextInt());
                        operacion.diferencia();
                    }
                    
                    case 3 : {
                        menu.primerNumero();
                        operacion.setA(seleccion.nextInt());
                        menu.segundoNumero();
                        operacion.setB(seleccion.nextInt());
                        operacion.cociente();
                    }
                    
                    case 4 : {
                        menu.primerNumero();
                        operacion.setA(seleccion.nextInt());
                        menu.segundoNumero();
                        operacion.setB(seleccion.nextInt());
                        operacion.potencia();
                    }
                    
                    case 5 : {
                        System.out.println("Seleccione el numero para calcular su raiz:");
                        operacion.setA(seleccion.nextInt());
                        operacion.raiz();
                    }
                    case 6 :{
                        System.out.println("Saliendo del programa...");
                    }
                }
            } while (opcionSeleccionada != 6);
        } catch (Exception e) {
            System.out.println("toString(): " + e.toString());
            
        }
        
    }
}