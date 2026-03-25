package unidad2.SensorIA;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();
        percepcionHub.add(new SensorLidar());
        percepcionHub.add(new SensorVision());
        percepcionHub.add(new SensorUltrasonido());

        System.out.println("Iniciando Sistema version 1");

        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos();
        }
    }
}