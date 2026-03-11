package unidad1.FiltroImagen;

public class ReductorDeRuido extends FiltroImagen {

    public ReductorDeRuido(int[][] dato) {
        super(dato);
    }

    public void kernel() {
        System.out.println("ReductorDeImagen");
        int[][] pixeles = getDato();
        System.out.println("aplicando kernel");

    }



}
