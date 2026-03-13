package unidad1.Vehiculo.Atonomo;

public class ControlCentral {
    public static void main(String[] args) {
        //Rover rover = new Rover();
        //rover.calcularRuta();


        VehiculoAutonomo[]vehiculos = new VehiculoAutonomo[2];
        vehiculos[0] = new Rover();
        vehiculos[1] = new Drone();

        for(VehiculoAutonomo vehiculo: vehiculos){
            vehiculo.calcularRuta();
        }

    }
}
