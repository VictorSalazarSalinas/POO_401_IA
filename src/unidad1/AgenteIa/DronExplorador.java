package unidad1.AgenteIa;

public class DronExplorador extends AgennteIA {
    public DronExplorador(int energia) {
        super(energia);
    }

    @Override
    public void moverse() {
        System.out.println("Agente IA 3D energia: " + getEnergia() + "%");
    }
}
