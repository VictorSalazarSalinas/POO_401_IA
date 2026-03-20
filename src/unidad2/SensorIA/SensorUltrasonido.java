package unidad2.SensorIA;


public class SensorUltrasonido extends SensorIA {
    public SensorUltrasonido() {
        super("Sonic Range", 1.5);
    }

    @Override
    public void leerDatos() {
        System.out.println("Enviando pulso sónico... Midiendo tiempo de rebote para proximidad.");
    }
}
