package unidad2.ParadigmaOO.vehiculo;

public class main {
    public static void main(String[] args) {
        bicicleta b = new bicicleta();
        automovil a = new automovil();
        b.acelerar();
        a.acelerar();
        System.out.println("bici: " + b.velocidad + " auto: " + a.velocidad);
    }
}
