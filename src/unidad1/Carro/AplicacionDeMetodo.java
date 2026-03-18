package unidad1.Carro;

public class AplicacionDeMetodo extends FuncionesVehiculo{
    @Override
    public String acelerar() {
        return "acelerando";
    }

    @Override
    public String frenar() {
        return "frenando";
    }
    public static void main(String[] args) {
        AplicacionDeMetodo ap = new AplicacionDeMetodo();
        System.out.println(ap.acelerar());
        System.out.println(ap.frenar());
    }

}
