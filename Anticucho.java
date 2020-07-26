/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesdecero.Ejercicio2;

/**
 *
 * @author LENOVO
 */
public class Anticucho {
    
    public static int cantidadAnt = 0;
    
    public void comer(){
        System.out.println("Anticucho registrado");
        this.cantidadAnt++;
    }
    
    public int contadorAnticuchos(){
        return this.cantidadAnt;
    }
}
