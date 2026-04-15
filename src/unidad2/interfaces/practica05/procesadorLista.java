package unidad2.interfaces.practica05;

import java.util.Scanner;

public class procesadorLista {
    public static void main(String[] args) {

        String[] frutas = {"manzana", "pera", "tomate", "uva"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.print(frutas[i] + " ");
        }
        System.out.println("\n");

        int i = 0;
        boolean encontrada = false;
        while (i < frutas.length && !encontrada) {
            if (frutas[i].startsWith("p")) {
                System.out.println("encontrada: " + frutas[i] + " en posicion " + i);
                encontrada = true;
            }
            i++;
        }

        // tarea 3: do-while
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        String busqueda;
        do {
            System.out.print("ingresa una fruta: ");
            busqueda = sc.nextLine();
            for (String f : frutas) if (f.equals(busqueda)) valido = true;
            if (!valido) System.out.println("intenta de nuevo");
        } while (!valido);
        System.out.println("fruta valida");
        sc.close();
    }
}