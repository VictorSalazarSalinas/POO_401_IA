package unidad1.CapaNeuronal;

public class CapaDensa extends CapaNeuronal{
    public CapaDensa(int[][] dato) {
        super(dato);
    }
    @Override
    public void propagcionHaciAdelante() {
        int[][] pixeles = getDato();
        System.out.println("transformando tensores Densa");

    }
}