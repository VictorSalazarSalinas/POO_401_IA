package unidad3.ejercicios.set;
import java.util.*;


public class GeneradorVocabulario {

    public static void main(String[] args){

        String text="hbhihob iubobk jbjbmbouv utiygoiy lubj a a";
        String [] tokens = text.split(" ");



        Set<String> vocabulario = new HashSet<>();
                        //Map<String,String> frecuencia = new HashMap<>();
        for (String t: tokens ){
            vocabulario.add(t);
        }
        System.out.println(vocabulario);
        System.out.println(tokens.length);
        System.out.println(vocabulario.size());


        if (vocabulario.contains("a")){
            System.out.println("CONTIENE a");
        }


    }
}
