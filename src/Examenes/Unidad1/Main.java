package Examenes.Unidad1;

public class Main {
    public static void main(String[] args) {

        Sensores[]Datos = new Sensores[3];


        Datos[0] = new Humedad() ;
        Datos[1] = new Presion();
        Datos[2] = new Temperatura();

        for(Sensores dato: Datos){
            dato.leerDato();
        }
    }
}