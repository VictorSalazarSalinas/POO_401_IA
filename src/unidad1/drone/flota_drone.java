package unidad1.drone;

public class flota_drone {
    public static void main(String[] args) {
        // Crear 3 drones
        Drone d1 = new Drone(1, 100);
        Drone d2 = new Drone(2, 80);
        Drone d3 = new Drone(3, 60);

        // Mestado inicial
        d1.mostrarEstado();
        d2.mostrarEstado();
        d3.mostrarEstado();

        // Modificar batería
        d2.setNivelBateria(50);

        System.out.println("\nDespués de modificar la batería del Drone 2:");
        d1.mostrarEstado();
        d2.mostrarEstado();
        d3.mostrarEstado();
    }
}

