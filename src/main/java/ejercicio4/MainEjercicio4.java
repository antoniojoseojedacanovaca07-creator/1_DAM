/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class MainEjercicio4 {

    public static final int MAXIMO = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();
        int[] matriz = new int[MAXIMO];
        ArrayList<Integer> listaMayores = new ArrayList<>();

        matriz = rellenarMatriz(matriz, rd);
        listaMayores = colocarEnLista(listaMayores, matriz);

        System.out.println("Numeros filtrados (>=10)" + listaMayores);
    }

    public static int[] rellenarMatriz(int[] matriz, Random rd) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = rd.nextInt(0, 100) + 1;
        }
        return matriz;
    }

    public static ArrayList<Integer> colocarEnLista(ArrayList<Integer> listaMayores, int[] matriz) {
        for (int numero : matriz) {
            if (numero >= 10) {
                listaMayores.add(numero);
            }
        }
        return listaMayores;
    }
}
