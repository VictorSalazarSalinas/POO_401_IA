package Examenes.Unidad1;

public class Humedad extends Sensores {

    public Humedad() {
        super("50");
    }




    @Override
    public void leerDato() {
        System.out.println("Humedad "+getDato() );
    }
}
