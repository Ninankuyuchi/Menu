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
public class Pizza {
    
    private static int cantidadPizza = 0;
    
    public void comer(){
        System.out.println("Pizza registrada");
        this.cantidadPizza++;
    }
    public int contadorPizzas(){
        return this.cantidadPizza;
    }
}
