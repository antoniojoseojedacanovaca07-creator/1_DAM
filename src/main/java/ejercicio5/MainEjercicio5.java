/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class MainEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(25);
        al.add(50);
        
        // Deberia de devolver 1
        int indiceEncontrado = listTest(al, 25);
        System.out.println("El indice de 25 es: "+indiceEncontrado);
        
        // Deberia de devolver -1 porque ese indice no existe
        int indiceNoEncontrado = listTest(al, 99);
        System.out.println("El índice de 99 es: "+indiceNoEncontrado);
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).equals(s)) {
                return i;
            }
        }
        // Al salir del bucle sin haber hecho el return significa que no esta por lo que return -1
        return -1;
    }
}
