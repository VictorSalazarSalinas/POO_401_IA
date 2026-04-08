package unidad2.interfaces.practica05;

import java.util.Scanner;

public class procesadorLista {
    public static void main(String[] args) {

        String[] frutas = {"manzana", "pera", "tomate", "uva"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.print(frutas[i] + " ");
        }
        System.out.println("\n");

        int bandera = 1;
        while (bandera == 1) {
            for (int i = 0; i < 4; i++) {
                if (frutas[i].charAt(0) == 'p') {
                    System.out.println("encontrada con p: " + frutas[i]);
                    bandera = 0;
                }
            }

            if (bandera == 1) bandera = 0;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el nombre de una fruta para buscarla:");
        String opcion = sc.nextLine();

        bandera = 1;
        do {
            for (int i = 0; i < frutas.length; i++) {
                if (frutas[i].equals(opcion)) {
                    System.out.println(frutas[i] + " tu fruta esta en la lista");
                    bandera = 0;
                    break;
                }
            }

            if (bandera == 1) {
                System.out.println("la fruta no esta");
                opcion = sc.nextLine();
            }
        } while (bandera == 1);


    }
}
