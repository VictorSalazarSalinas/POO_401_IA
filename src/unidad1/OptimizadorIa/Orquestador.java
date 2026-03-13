package unidad1.OptimizadorIa;

public class Orquestador {
    public static void main(String[] args) {
        OpitimizadorIa[] IA = new OpitimizadorIa[2];
        IA[0] = new AlgoritmoGenetico();
        IA[1] = new DescensoGradiente();

        for (OpitimizadorIa IAs : IA) {
            IAs.ajustarParametros();
        }

    }
}