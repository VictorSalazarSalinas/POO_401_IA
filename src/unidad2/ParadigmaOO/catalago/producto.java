package unidad2.ParadigmaOO.catalago;

class producto {
    String nombre; double precio;
    producto(String n, double p) { nombre = n; precio = p; }
    void mostrardetalles() {
        System.out.print(nombre + " " + precio);
    }
}