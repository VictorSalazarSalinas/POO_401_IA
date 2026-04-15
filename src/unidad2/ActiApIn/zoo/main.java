package unidad2.ActiApIn.zoo;

public class main {
    public static void main(String[] args) {
        Animal[] animales = {new Perro(), new Gato()};
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}