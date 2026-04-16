package unidad3.ejercicios.map;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokenOptimizado {
    public static void main(String[] args) {

        String [] tokens={"ia","python","redes","neuronas","ia","neuronas"};

        Map<String,Integer> frecuencia = new HashMap<>();
        for (String t :tokens){
            frecuencia.merge(t,1,
                    (ValorAnterior,ValorNuevo)-> ValorAnterior);
        }
        System.out.println("------------");
        frecuencia.forEach(k,v)->System.out.println();

    }
}
