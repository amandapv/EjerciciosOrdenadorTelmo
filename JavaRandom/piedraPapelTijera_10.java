/*
10./*Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su

jugada y luego el ordenador genera al azar una de las opciones. Si el usuario introduce una opción incorrecta, el programa deberá mostrar un mensaje deerror.

Ejemplo 1:

Turno del jugador (introduzca piedra, papel o tijera): papel

Turno del ordenador: papel

Empate

Ejemplo 2:

Turno del jugador (introduzca piedra, papel o tijera): papel

Turno del ordenador: tijera

Gana el ordenador

Ejemplo 3:

Turno del jugador (introduzca piedra, papel o tijera): piedra

Turno del ordenador: tijera

Gana el jugador
 */
package Java_Random;

import java.util.Scanner;

public class piedraPapelTijera_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maquina;
        int usuario;
        String tirada;

        maquina = (int)(Math.random()*3 +1);
        System.out.println(maquina);

        System.out.println("Introduce tu jugada. 1 para piedra, 2 para papel y 3 para tijera");
        usuario = teclado.nextInt();

        switch (maquina) {
            case 1:
                tirada = "piedra";
                break;
            case 2:
                tirada = "papel";
                break;
            case 3:
                tirada = "tijera";
                break;
        }

        switch (usuario) {
            case 1:
                tirada = "piedra";
                break;
            case 2:
                tirada = "papel";
                break;
            case 3:
                tirada = "tijera";
                break;
        }

        if (maquina == usuario) {
            System.out.println("Empate");
        }

        if (maquina < usuario) {
            System.out.println("Gana el ordenador");
        }

    }
}
