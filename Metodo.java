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
public class Metodo {
        
    public int validarMenu(){
        
        Scanner scan = new Scanner(System.in);
        int pedidoInt=0;
        boolean validar = true;
        
        do{
            System.out.print("\nIngrese su pedido: ");
            String pedido = scan.next();
            try{
                pedidoInt = Integer.parseInt(pedido);
                if(pedidoInt>0 && pedidoInt<5){
                     validar = false;
                } else{
                     System.out.println("No sea feia, pedido no disponible");
                }
            }catch(NumberFormatException e){
                System.out.println("No sea feia, ingrese un valor entero");
            }
        }while(validar);
        return pedidoInt;
        
    }
    
    public boolean validarCarta(int pedido){
        
        boolean activo =true;
        
       switch(pedido){
            case 1: Pizza pizza = new Pizza();
                    pizza.comer();
                    break;
            case 2: Anticucho anticucho = new Anticucho();
                    anticucho.comer();
                    break;
            case 3: AlitaB alitaB = new AlitaB();
                    alitaB.comer();
                    break;
            case 4: activo = false;
                    break;
            default: break;
        }
       return activo;
    }
}
