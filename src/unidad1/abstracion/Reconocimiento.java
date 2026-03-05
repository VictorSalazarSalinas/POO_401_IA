package unidad1.abstracion;

public class Reconocimiento extends ModeloIA {


    public Reconocimiento() {
        super("Visión 1.0");
    }

    @Override
    public void procesarEntrada(String entrada) {
        System.out.println("Cargando datos...");
        System.out.println("Extrayenfo datos...");
        System.out.println("Comparando Vector...");
    }
}