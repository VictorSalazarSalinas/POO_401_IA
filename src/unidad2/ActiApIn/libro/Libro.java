package unidad2.ActiApIn.libro;

public class Libro {
    String titulo, autor;
    int paginas;
    Libro(String t, String a, int p) {
        titulo = t; autor = a; paginas = p;
    }
    void mostrarInfo() {
        System.out.println("titulo: " + titulo + ", autor: " + autor + ", paginas: " + paginas);
    }
}