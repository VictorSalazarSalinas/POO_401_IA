package unidad2.ParadigmaOO.encendible;

public class main {
    public static void main(String[] args) {
        encendible[] cosas = {new tv(), new bombilla()};
        for (encendible c : cosas) {
            c.encender();
            c.apagar();
        }
    }

}
