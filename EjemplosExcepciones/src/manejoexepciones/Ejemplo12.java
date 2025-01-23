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
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        double[] resultados = new double[valor];

        boolean bandera = true;

        while (bandera) {
            try {
                int valor1;
                int valor2;
                double resultado;

                for (int i = 0; i < resultados.length; i++) {
                    System.out.println("Ingrese el valor 1 a dividir");
                    valor1 = entrada.nextInt();
                    System.out.println("Ingrese el valor 2 a dividir");
                    valor2 = entrada.nextInt();

                 
                    resultado = (double) valor1 / valor2;
                    resultados[i] = resultado;
                }

                for (int i = 0; i < resultados.length; i++) {
                    System.out.printf("%.2f ", resultados[i]);
                }
                bandera = false;

            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
                entrada.nextLine();
            }
        }
    }
}

