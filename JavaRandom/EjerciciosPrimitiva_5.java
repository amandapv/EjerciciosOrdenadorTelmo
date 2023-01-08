/*
5. Simular el juego de la lotería primitiva

    6 Números 1-49 (sin repetir)
    no cotemplamos complementario
    1 reintegro 0-9
    posible repetición de los números (unos de los 6 números puede coincidir con el reintegro)
 */
package Java_Random;

import java.util.Scanner;

public class EjerciciosPrimitiva_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int reintegro;

    //declarar array
        //comprobar los 6 números, por ejemplo while mientras no se hayan generado esos 6 num
            //buscar entre esos 6 numeros que si ya ha salido ese num, se quite de las posibilidades de que vuelva a salir





        num = (int)(Math.random()*40 +1);

        reintegro = (int)(Math.random()*10);

        //while
            //for //hacer un contador
                //random
            //for

       for (int i=0; i<6; i++) {

           int [] boleto = new int [i];

           System.out.println(boleto[i] + " ");



       }

    }
}
