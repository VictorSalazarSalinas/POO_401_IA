package unidad1.metrica;

public class Accuracy extends Metrica {
    public Accuracy(int dato) {
        super(dato);
    }

@Override
public void  calcularResultado() {
    int datov = getDato();
    System.out.println("calculado preseion");
    //
    //formula
    //
    System.out.println("Accuracy "+datov);

    }



}
