package unidad1.drone;

public class Drone {
    private int id;
    private int nivelBateria;

    // Constructor ID unico y batería inicial
    public Drone(int id, int nivelBateria) {
        this.id = id;
        this.nivelBateria = nivelBateria;
    }

    // metodos getter y setter
    public int getId() {
        return id;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    // estado
    public void mostrarEstado() {
        System.out.println("Drone " + id + " - Batería: " + nivelBateria + "%");
    }
}
