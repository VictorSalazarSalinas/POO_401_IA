package unidad2.ParadigmaOO.contructores;

class circulo10 {
    private double radio;
    circulo10(double r) {
        radio = r;
    }

    double calculararea() {
        return 3.1416 * radio * radio;
    }
    double calcularcircunferencia() {
        return 2 * 3.1416 * radio;
    }
}
