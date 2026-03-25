package unidad2.SensorIA;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();

        SensorLidar obje1 = new SensorLidar("modelo 1.1",5.1);
        SensorLidar obje2 = new SensorLidar("modelo 7.1",4.6);

        SensorVision obje3 = new SensorVision("modelo 5.1",9.3);
        SensorVision obje4 = new SensorVision("modelo 9.1",8.6);

        SensorUltrasonido obje5 = new SensorUltrasonido("modelo 2.1",6.9);
        SensorUltrasonido obje6 = new SensorUltrasonido("modelo 3.1",5.6);




        percepcionHub.add(obje1);
        percepcionHub.add(obje2);
        percepcionHub.add(obje3);
        percepcionHub.add(obje4);
        percepcionHub.add(obje5);
        percepcionHub.add(obje6);

        obje1 = new SensorLidar("modelo 1.2",5.3);

        percepcionHub.add(obje1);



        System.out.println("Iniciando Sistema version 1");

        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos();
        }
    }
}