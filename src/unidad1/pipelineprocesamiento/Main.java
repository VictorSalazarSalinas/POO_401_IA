package unidad1.pipelineprocesamiento;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<FiltroImagen> pipiline=new ArrayList<>();
        pipiline.add(new ReductorDeRuido());
        pipiline.add(new DectectorDeBordes());
        pipiline.add(new EscaladaDegrices());

        for (FiltroImagen f : pipiline){
            f.procesar();
        }
    }

}
