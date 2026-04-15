package unidad2.ParadigmaOO.forma;

class rectangulo extends forma {
    double b, h;
    rectangulo(double b, double h) { this.b = b; this.h = h; }
    double calculararea() { return b * h; }
}
