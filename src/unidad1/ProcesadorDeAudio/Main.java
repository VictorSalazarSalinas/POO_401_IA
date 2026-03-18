package unidad1.ProcesadorDeAudio;

public class Main {
    public static void main(String[] args) {

        ProcesadorDeAudio[]procesos = new ProcesadorDeAudio[3];
        procesos[0] = new Ecualizador();
        procesos[1] = new Normalizador();
        procesos[2] = new ReductorDeEco();
        for(ProcesadorDeAudio proceso: procesos){
            proceso.filtrar();
        }

    }
}
