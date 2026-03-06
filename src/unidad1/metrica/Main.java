package unidad1.metrica;

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Accuracy acc = new Accuracy(85);  // pasa el dato
        MSE mse = new MSE(12);

        //  métodos
        acc.calcularResultado();
        mse.calcularResultado();
    }
}

