package unidad2.ParadigmaOO.catalago;

class electronica extends producto {
    int garantia;
    electronica(String n, double p, int g) {
        super(n, p); garantia = g;
    }
    void mostrardetalles() {
        super.mostrardetalles(); System.out.println(" garantia: " + garantia);
    }
}