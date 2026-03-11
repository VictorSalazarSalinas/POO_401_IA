package unidad1.CapaNeuronal;

public class CapaConvulsional extends CapaNeuronal {
    public CapaConvulsional(int[][] dato) {
        super(dato);
    }

    @Override
    public void propagcionHaciAdelante() {
        int[][] pixeles = getDato();
        System.out.println("transformando tensores convusional");

    }
}
