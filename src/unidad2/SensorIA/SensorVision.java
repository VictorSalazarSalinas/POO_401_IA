package unidad2.SensorIA;

public class SensorVision extends SensorIA {
    public SensorVision() {
        super("Cam 4K", 8.2);
    }

    @Override
    public void leerDatos() {
        System.out.println("Capturando frame... Ejecutando segmentación semántica de objetos.");

    }
}