package unidad2.ActiApIn.libro;

public class main {
    public static void main(String[] args) {
        Libro l1 = new Libro("el principito", "antoine", 100);
        Libro l2 = new Libro("metamorfosis", "kafka", 150);
        l1.mostrarInfo();
        l2.mostrarInfo();
    }
}