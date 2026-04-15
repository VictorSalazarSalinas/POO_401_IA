package unidad2.ParadigmaOO.catalago;

class main{
    public static void main(String[] args) {
        producto[] p = {new electronica("tv", 500, 12), new alimento("leche", 2, "hoy")};
        for (producto x : p) {
            x.mostrardetalles();
        }
    }
}
