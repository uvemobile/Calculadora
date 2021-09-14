/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author uvemo
 */
public class Operaciones {
   
    private int a;
    private int b;


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
    //operación de suma opción 1 de switch
    public void suma(){
        System.out.println("El resultado de la suma de " + a + " mas " + b +" es: " + (a+b)+ "\n" );
    }
    //Operación de resta opción 2 de switch
    public void diferencia(){
        System.out.println("El resultado de la resta de " + a + " menos " + b +" es: " + (a-b)+ "\n" );
    }
    //Operación de división opción 3 de switch, casting a double
    public void cociente(){
        System.out.println("El resultado de la división de " + a + " entre " + b +" es: " + (a/b)+ "\n" );
    }
    //Operación de potencia utilizando librería Math opción 4 de switch
    public void potencia(){
        System.out.println("El resultado de la potencia de " + a + " elevado a " + b +" es: " + Math.pow(a, b)+ "\n" );
    }
    //Operación de inversa opción 5 de switch
    public void raiz(){
        
        System.out.println("El resultado de la raiz de " + a + " es: " + Math.sqrt(a)+ "\n" );
    }
    
}
