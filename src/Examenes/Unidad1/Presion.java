package Examenes.Unidad1;

public class Presion extends Sensores {
    public Presion() {
        super("60");
    }

    @Override
    public void leerDato() {
        System.out.println("presion " + getDato());
    }
}
