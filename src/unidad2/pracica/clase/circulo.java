package unidad2.pracica.clase;

public class circulo extends figuraGeometrica{
    double radio;

    public circulo(String nombre) {
        super(nombre);
    }

    @Override
    double Calcualararea() {
        double pi = 3.14;
        double area = pi*radio*radio;

        return area;
    }
}
