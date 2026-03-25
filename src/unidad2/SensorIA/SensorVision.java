package unidad2.SensorIA;

public class SensorVision extends SensorIA {
    public SensorVision(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Capturando frame... Ejecutando segmentación semántica de objetos. "+getModelo()+" consumo "+getConsumoEnergia());

    }
}