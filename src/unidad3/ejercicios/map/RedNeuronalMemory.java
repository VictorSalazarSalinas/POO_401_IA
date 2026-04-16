package unidad3.ejercicios.map;
import java.util.HashMap;
import java.util.Map;
public class RedNeuronalMemory {
    public static void main(String[] args){
        String [] tokens={"ia","python","redes","neuronas","ia","neuronas"};

        Map<String,Double> frecuencia = new HashMap<>();

        for(String d: tokens ){
            frecuencia.put(d,frecuencia.getOrDefault(d,0)+1);

        }

        frecuencia.put("w1",.98);
        frecuencia.put("w2",.69);
        frecuencia.put("w3",.56);

        if (frecuencia.containsKey("w1")){
            frecuencia.replace("w1",.0293);
        }

        double sumaPesos=0.0;
        for (Double d : frecuencia.values())
        {
            sumaPesos+=d;
        }

        System.out.println(("la suma es "+ sumaPesos));

        frecuencia.remove("w2");

        System.out.println("mapa remover w2 "+ frecuencia);

    }

}
