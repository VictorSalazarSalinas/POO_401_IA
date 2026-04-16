package unidad3.ejercicios.map;
import java.util.*;
public class ContadorTokens {
    public static void main(String[] args){
        String [] tokens={"ia","python","redes","neuronas","ia","neuronas"};

        Map<String,Integer> frecuencia = new HashMap<>();

        for(String d: tokens ){
            frecuencia.put(d,frecuencia.getOrDefault(d,0)+1);

        }
        System.out.println("vocabulario "+ frecuencia.keySet());
        for (String entrada: frecuencia.keySet()){
            System.out.println("");
        }
    }
}
