package unidad1.FiltroImagen;

public class DectectorDeImagen extends FiltroImagen {
    public DectectorDeImagen(int[][] dato) {
        super(dato);
    }

    public void kernel() {
        System.out.println("DectectorDeImagen");
        int[][] pixeles = getDato();
        System.out.println("aplicando kernel");

    }



}
