package unidad2.ParadigmaOO.juego;

public class main {
    public static void main(String[] args) {
        personaje p1 = new guerrero();
        personaje p2 = new mago();
        p1.atacar(); p2.atacar();
    }
}
