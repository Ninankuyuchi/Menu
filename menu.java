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
public class menu {
 
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        boolean consulta = true;
        
        System.out.println(":::Bienvenido al menú::: \n");
        System.out.print("Ingrese su nombre: ");
        String nombre = scan.next();
        System.out.println("Hola "+ nombre+". Elija una opción");
        
        
        do{ 
            System.out.println("\n1: Ingresar");
            System.out.println("2: Salir\n"); 
            System.out.print("Opcion: ");
            String valor = scan.next();
            try{
                    int data = Integer.parseInt(valor);
                    if(data == 1){
                        
                        Carta carta = new Carta();
                        carta.menu();
                        
                        Pizza pizza = new Pizza();
                        Anticucho anticucho = new Anticucho();
                        AlitaB alitaB = new AlitaB();
                        
                        System.out.println("");
                        if(pizza.contadorPizzas()>1){
                            System.out.println("Usted pidio: "+ pizza.contadorPizzas() + " Pizzas");
                            } else if (pizza.contadorPizzas() == 1) {
                            System.out.println("Usted pidio 1 pizza");
                            }
                        
                        if(anticucho.contadorAnticuchos()>1){
                            System.out.println("Usted pidio: "+ anticucho.contadorAnticuchos()+ " Anticuchos");
                            } else if (anticucho.contadorAnticuchos() == 1) {
                            System.out.println("Usted pidio 1 anticucho");
                            }
                        
                        if(alitaB.contadorAlitas()>1){
                            System.out.println("Usted pidio: "+ alitaB.contadorAlitas()+ " Alitas Broster");
                            } else if (alitaB.contadorAlitas() == 1) {
                            System.out.println("Usted pidio 1 alita broster");
                            }
                        System.out.println("\nDisfrute su pedido");
                        
                        } else if(data == 2){
                            consulta = false;
                            }
                } catch (NumberFormatException e) {
                  System.out.println("Usted es una feia, ingresa un valor entero");
                }
            
        }while(consulta);
    }
}
