package unidad2.ParadigmaOO.catalago;

class alimento extends producto {
    String caducidad;
    alimento(String n, double p, String c) {
        super(n, p); caducidad = c;
    }
    void mostrardetalles() {
        super.mostrardetalles(); System.out.println(" vence: " + caducidad);
    }
}