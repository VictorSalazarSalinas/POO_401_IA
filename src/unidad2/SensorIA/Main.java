package unidad2.SensorIA;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();

        SensorLidar obje1 = new SensorLidar();
        SensorLidar obje2 = new SensorLidar();

        SensorVision obje3 = new SensorVision();
        SensorVision obje4 = new SensorVision();

        SensorUltrasonido obje5 = new SensorUltrasonido();
        SensorUltrasonido obje6 = new SensorUltrasonido();


        percepcionHub.add(obje1);
        percepcionHub.add(obje2);
        percepcionHub.add(obje3);
        percepcionHub.add(obje4);
        percepcionHub.add(obje5);
        percepcionHub.add(obje6);


        System.out.println("Iniciando Sistema version 1");

        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos();
        }
    }
}