package unidad3.practica1;

public class Actividad_2{
    public static void main(String[]args){
        int[] stock={60,40,15,5,0,10,55,8,0,25};
        for(int i=0;i<stock.length;i++){
            int s=stock[i];
            String cat;
            int op;
            if (s > 50) {
                op = 1;
            } else {
                if (s >= 10) {
                    op = 2;
                } else {
                    if (s >= 1) op = 3;
                    else op = 4;
                }
            }
            switch(op){
                case 1:cat="en stock";break;
                case 2:cat="bajo stock";break;
                case 3:cat="urgente";break;
                default:cat="descontinuado";break;
            }
            System.out.println("cantidad: "+s+" - estado: "+cat);
        }
/* reflexion: se asigna el estado segun el rango numerico. el switch es mas
limpio que usar mil if-else cuando ya tenemos categorias fijas.
conclusion: las estructuras de control como el for automatizan tareas que a mano tardarian horas. */
    }
}