package unidad2.ejercicios.base;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        int NotaExamen = 89;

        if(NotaExamen >= 60){

            System.out.println("aprobado");
            if(NotaExamen >= 90){
                System.out.println("exelente desempeño");
            }

        }else {
            System.out.println("no aprobado");
        }
        //sentencia swicht

        char calificacion;
        switch(NotaExamen) {
            case 90:
                calificacion = 'a';
                break;
            case 80:
                calificacion = 'b';
                break;
            case 70:
                calificacion = 'c';
                break;
            case 60:
                calificacion = 'd';
                break;
            default:
                calificacion = 'f';
                break;
        }
        System.out.println("calificacion: " + calificacion);
    }
}
