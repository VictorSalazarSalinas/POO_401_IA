package unidad3.practica1;

import java.util.*;
public class Actividad_1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("nombre del producto: ");
            String n=sc.nextLine();
            System.out.print("cantidad: ");
            int c=sc.nextInt();
            System.out.print("precio: ");
            double p=sc.nextDouble();
            if(c>0){
                if(p>0){
                    System.out.println("producto registrado con exito");
                }else System.out.println("error: el precio debe ser positivo");
            }else System.out.println("error: la cantidad debe ser mayor a 0");
        }catch(InputMismatchException e){
            System.out.println("error: debes ingresar un valor numerico");
        }
/* reflexion: los datos numericos como precio y cantidad deben ser double e int.
si se mete texto en campos de numero el programa truena sin el try-catch.
conclusion: validar datos en ti evita que la base de datos se llene de basura o errores. */
    }
}