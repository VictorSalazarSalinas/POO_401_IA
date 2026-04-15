package unidad2.ActiApIn.inter;

public class main {
    public static void main(String[] args) {
        PuedeVolar[] voladores = {new Avion(), new Pajaro()};
        for (PuedeVolar v : voladores) {
            v.volar();
        }
    }
}