package unidad2.ParadigmaOO.Restaurante;

class restaurante {
    String nombre, tipodecomida;
    int calificacion;
    restaurante(String n, String t, int c) {
        nombre = n; tipodecomida = t; calificacion = c;
    }
    void abrir() {
        System.out.println(nombre + " esta abierto");
    }
}
