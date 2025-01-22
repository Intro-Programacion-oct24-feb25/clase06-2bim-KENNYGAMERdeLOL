/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true; 
while(bandera){
    
}
        try {
            System.out.println("Ingrese un pais: ");
            String valor1 = entrada.nextLine();
            char letra = valor1.charAt(0);
            
           valor1 = valor1.toUpperCase();
            String primeraletra= (String.valueOf(letra)); 
                  
            if (primeraletra.equals("A")||
                primeraletra.equals("E") ||
                primeraletra.equals("I")||
                primeraletra.equals("O")||
                primeraletra.equals("U")) {
                    throw new Exception("Ingrese un pais con una vocal");
            }
                    
        String resultado = ""; 
        resultado = String.format("%s%s\n",resultado, valor1);
            System.out.printf("Resultado: %s\n", resultado);
            bandera = false; 
        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
               
        }
    }

