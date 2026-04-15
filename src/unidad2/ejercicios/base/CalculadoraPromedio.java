package unidad2.ejercicios.base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {
    public  static void main(String[] args) {
        double nota1;
        double nota2;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa nota 1: :");
            nota1=sc.nextDouble();
            System.out.println("Ingresa nota 2: :");
            nota2=sc.nextDouble();

            double promedio=(nota2+nota1)/2;

            System.out.println("El promedio es: "+promedio);



        }catch(InputMismatchException e){
            System.out.println("Error al ingreasar el dato  "  + e.getMessage());
            System.out.println("Error al ingreasar el dato  "  + e.getCause());
            System.out.println("Error al ingreasar el dato  "  + e.getLocalizedMessage());
        }finally{
            System.out.println("liberando recursos");
            sc.close();

        }




    }


}
