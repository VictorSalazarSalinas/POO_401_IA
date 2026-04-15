package unidad2.processador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcesadorSimple extends ProcesadorNLP{


    @Override
    public List<String> tokenizar() {
        tokens = new ArrayList<>(Arrays.asList(getTextoCrudo().split("\\s+")));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        String textolimpio = getTextoCrudo().replace(" ", "").replace("\n", "").replace("\r", "");
        setTextoCrudo(textolimpio);

    }

    @Override
    public Object transformarParaModelo() {
        return null;
    }
}
