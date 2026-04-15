package unidad2.ParadigmaOO.forma;

class circulo extends forma {
    double radio;
    circulo(double r) { radio = r; }
    double calculararea() { return 3.14 * radio * radio; }
}
