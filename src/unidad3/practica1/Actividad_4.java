package unidad3.practica1;

import java.util.Scanner;
public class Actividad_4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String mail;
        do{
            System.out.print("ingresa tu email: ");
            mail=sc.nextLine();
        }while(!validar(mail));
        System.out.println("correo validado");
    }
    static boolean validar(String m){
        return m.contains("@");
    }
/* reflexion: el do-while es mejor aqui porque al menos hay que pedir el correo una vez.
el return en el metodo nos ahorra escribir el codigo de validacion muchas veces.
conclusion: usar metodos con return hace que el codigo se vea mas ordenado y sea reutilizable. */
}