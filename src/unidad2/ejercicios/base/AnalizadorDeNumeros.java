package unidad2.ejercicios.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalizadorDeNumeros {
    public static void main(String[] args) {
        //tarea1
        int suma = 0;
        for (int i = 0; i < 100; i++) {
            suma += i;
                    }
        System.out.println(suma);

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        for(Integer i : lista){
            System.out.println(i);
        }
        //tarea 2
        int suma2 = 1;
        while(suma2 >50){

            if(suma2>50){
                System.out.println("numero encontrado  " + suma2);
                break;
            }
            suma2++;
        }
        //tarea 3
        Scanner sc = new Scanner(System.in);
        String pass = "qwerty123";
        boolean cont = false;

        do {
            System.out.print("Introduce el contraseña: ");
            String s = sc.nextLine();
            cont = !s.equals(pass);
        }while(cont);

        System.out.print("Contraseña aceptada");




    }
}
