/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesdecero.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Carta {
    
    public void menu(){
        int pedidoInt = 0;
        boolean validar = true;
        Scanner scan = new Scanner(System.in);
        boolean activo = true;
        
        
            
        System.out.println("\nEl menu es el siguiente: ");
        System.out.println("1. Pizza");
        System.out.println("2. Anticucho");
        System.out.println("3. Alita Broster");
        System.out.println("4. Salir");
        
        Metodo metodo = new Metodo();
        
        do{
            pedidoInt = metodo.validarMenu();
            activo = metodo.validarCarta(pedidoInt);                   
        }while(activo);
        
    }
}
