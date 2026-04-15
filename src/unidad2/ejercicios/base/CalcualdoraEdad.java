package unidad2.ejercicios.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcualdoraEdad {
    public static void main(String[] args) {
        int actual = 2026;

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingresa tu nacimiento: ");

            int nacimiento = sc.nextInt();

            int edad = actual-nacimiento;

            System.out.print("tu edad es: "+edad);



        }catch(InputMismatchException e){
            System.out.println("Error al ingreasar el dato  "  + e.getMessage());
            System.out.println("Error al ingreasar el dato  "  + e.getCause());
            System.out.println("Error al ingreasar el dato  "  + e.getLocalizedMessage());
        }finally{
            sc.close();

        }



    }
}
