/*
9. Escribe un programa que piense un número al azar entre 0 y 100.
        El usuario debe adivinarlo
        y tiene para ello 5 oportunidades.
   Después de cada intento fallido,
        el programa dirá cuántas oportunidades quedan
        y si el número introducido es menor o mayor que el que ha pensado.
 */

package Java_Random;

import static salidaMejorada.JOptionPane.Generico.*;
import java.util.Scanner;

public class numAzar0y100_9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numAleat;
        int cont = 5;

        int numUser;

        numAleat = (int)(Math.random()*101);

        for (int i = 0; i < 5; i++) {

            numUser = recuverarventanaTextBoxInt("Introduce un número", "Entrada de Datos");

            cont--;

            if (numAleat == numUser) {
                mostrarVentanaMensaje("Enhorabuena, has acertado!", "");
                break;

            } else {
                mostrarVentanaMensaje("Lo siento, ese no es el número. Te quedan " + cont + " " + "oportunidades","Juego Adivina el número");

                if (numUser < numAleat && i != 4) {
                    mostrarVentanaMensaje("El número que buscas es mayor","Juego Adivina el número");

                }
                if (numUser > numAleat && i != 4) {
                    mostrarVentanaMensaje("El número que buscas es menor","Juego Adivina el número");
                }
            }
        }
    }
}