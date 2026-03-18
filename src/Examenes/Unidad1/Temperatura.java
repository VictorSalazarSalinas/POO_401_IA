package Examenes.Unidad1;

public class Temperatura extends Sensores {
    public Temperatura() {
        super("10");
    }

    @Override
    public void leerDato() {
        System.out.println("temperatura " +getDato() );
    }
}
