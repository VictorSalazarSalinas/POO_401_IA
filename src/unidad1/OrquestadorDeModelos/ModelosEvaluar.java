package unidad1.OrquestadorDeModelos;


public class ModelosEvaluar {
    public static void main(String[] args) {
        ClasificadorIA[]modelos = new ClasificadorIA[3];
        modelos[0] = new RedNeuronal();
        modelos[1] = new SupportVectorMachine();
        modelos[2] = new ArbolDeDecision();
        for(ClasificadorIA modelo: modelos){
            modelo.predecir();
        }

    }
}

