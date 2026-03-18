package unidad1.EvaluadorMetricas;

public class Main {
    public static void main(String[] args) {
        EvaluadorMetricas[]Evaluadores = new EvaluadorMetricas[2];
        Evaluadores[0] = new ErrorCuadraticoMedio() ;
        Evaluadores[1] = new ErrorAbsolutoMedio();

        for(EvaluadorMetricas Evaluador: Evaluadores){
            Evaluador.calcularError();
        }
    }
}
