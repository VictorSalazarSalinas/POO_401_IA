package unidad2.SensorIA;

public class SensorLidar extends SensorIA {
    public SensorLidar() {
        super("Lidar Pro", 12.5);
    }

    @Override
    public void leerDatos() {
        System.out.println("Escaneando entorno 360°... Generando nube de puntos láser.");
    }
}
