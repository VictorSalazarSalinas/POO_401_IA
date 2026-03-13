package unidad1.AgenteIa;

public class AgennteIA {
    private int energia;

    public AgennteIA( int energia) {
        this.energia = energia;
    }
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public void moverse() {
        System.out.println("Agente IA energia: " + energia + "%");
    }

}
