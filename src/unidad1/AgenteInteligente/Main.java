package unidad1.AgenteInteligente;

public class Main {
    public static void main(String[] args) {

        AgenteInteligente[]Agentes = new AgenteInteligente[3];
        Agentes[0] = new Defensor() ;
        Agentes[1] = new Explorador();
        Agentes[2] = new Recolector();

       for(AgenteInteligente Agente: Agentes){
            Agente.tomarDecision();
        }
    }
}
