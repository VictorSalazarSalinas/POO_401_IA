package unidad2.interfaces.pracica04;

import unidad1.dataset.DataSet;

public class Main {
    public static void main(String[] args) {

        unidad2.interfaces.pracica04.SobreCarga carga = new SobreCarga();

        DataSet data = new DataSet(5);

        int peso = 0;

        carga.entrenar(data);
        carga.entrenar(data,peso);

    }
}
