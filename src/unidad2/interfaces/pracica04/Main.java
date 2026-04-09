package unidad2.interfaces.pracica04;


import unidad2.interfaces.pracica04.Dataset2;

public class Main {
    public static void main(String[] args) {

        unidad2.interfaces.pracica04.SobreCarga carga = new SobreCarga();

        Dataset2 data = new Dataset2();

        int peso = 0;

        carga.entrenar(data);
        carga.entrenar(data,peso);

    }
}
