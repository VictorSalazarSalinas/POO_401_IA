package unidad1.metrica;

public class MSE extends Metrica {
    public MSE(int dato) {
        super(dato);
    }

    @Override
    public void  calcularResultado() {
        int datov = getDato();
        System.out.println("calculando ErrorCuadraticoMedio");
        //
        //formula
        //
        System.out.println("MSE "+datov);

    }


}
