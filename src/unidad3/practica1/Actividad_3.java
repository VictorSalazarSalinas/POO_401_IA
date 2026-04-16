package unidad3.practica1;

import java.util.Scanner;
public class Actividad_3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String e="";
        while(!e.equals("entregado")){
            System.out.print("estado actual: ");
            e=sc.nextLine().toLowerCase();
            if(e.equals("error en envio")){
                System.out.println("proceso detenido");
                break;
            }
            if(e.equals("en camino")){
                System.out.println("saltando revision...");
                continue;
            }
            if(e.equals("entregado")) System.out.println("pedido finalizado");
        }
/* reflexion: el while sirve porque no sabemos cuantos pasos tomara la entrega.
break corta el flujo por error y continue salta pasos innecesarios.
conclusion: controlar el flujo asegura que los datos de la cadena de suministro sean reales. */
    }
}
