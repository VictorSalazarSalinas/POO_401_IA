package unidad1.AgenteIa;

public class RobotTerreste extends AgennteIA {
    public RobotTerreste(int energia) {
        super(energia);
    }

    @Override
    public void moverse() {
        System.out.println("Agente IA 3D energia: " + getEnergia() + "%");
    }

}