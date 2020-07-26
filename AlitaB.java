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
public class AlitaB {
    
    public static int cantidadAlit = 0;
    
    public void comer(){
        System.out.println("Alita broster registrada");
        this.cantidadAlit++;
    }
    
    public int contadorAlitas(){
        return this.cantidadAlit;
    }
}
