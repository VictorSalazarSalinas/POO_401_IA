package unidad1.abstracion;

public abstract class ModeloIA {
    protected String nombre;

    // Constructor de la clase
    public ModeloIA(String nombre){
        this.nombre = nombre;
    }

    public abstract void procesarEntrada(String entrada);


}
