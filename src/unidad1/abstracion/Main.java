package unidad1.abstracion;

public class Main {
    public static void main(String[] args) {
        ModeloIA agente = new ReconocimientoFacial();
        agente.procesarEntrada("imagen_usuario.jpg");
    }
}