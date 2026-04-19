package unidad2.pracica.clase;

class circulo extends FiguraGeometrica {
    private double radio;

    public circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }


    public circulo(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
