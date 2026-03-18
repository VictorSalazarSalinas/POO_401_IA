package unidad1.CapaNeuronal;

public class CapaNeuronal {
    private int[][] dato;

    public CapaNeuronal(int[][] dato) {
        this.dato = dato;
    }

    public int[][] getDato() {
        return dato;
    }

    public void setDato(int[][] dato) {
        this.dato = dato;
    }

    public void  propagcionHaciAdelante() {
        int[][] pixeles = getDato();
    }
}
