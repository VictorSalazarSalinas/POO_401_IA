package unidad3.practica1;

import java.util.Scanner;
public class Actividad_5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        boolean acceso=false;
        for(int i=1;i<=3;i++){
            System.out.print("usuario: ");
            String u=sc.nextLine();
            System.out.print("pass: ");
            String p=sc.nextLine();
            if(u.equals("admin")){
                if(p.equals("pass123")){
                    System.out.println("autenticacion exitosa");
                    acceso=true;
                    break;
                }else System.out.println("contrasena incorrecta");
            }else System.out.println("usuario no encontrado");
        }
        if(!acceso) System.out.println("demasiados intentos. acceso denegado.");
/* reflexion: el for controla los intentos y los if anidados separan el error de usuario del de clave.
conclusion: combinar ciclos y condiciones permite crear sistemas de seguridad basicos pero efectivos. */
    }
}