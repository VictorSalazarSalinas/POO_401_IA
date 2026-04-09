package unidad2.pracica.clase;

public class rectangulo extends figuraGeometrica{

    double base;
    double altura;

    public rectangulo(String nombre) {
        super(nombre);
    }

    @Override
    double Calcualararea() {
        double area = base*altura;
        return area;
    }
}
