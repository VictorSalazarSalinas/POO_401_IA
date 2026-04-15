package unidad2.ParadigmaOO.estudiante;

public class main {
    public static void main(String[] args) {
        clase c = new clase("mate");
        c.agregar(new estudiante("juan", 1));
        c.agregar(new estudiante("ana", 2));
        c.mostrar();
    }
}
