package unidad2.ParadigmaOO.empleado;

public class main {
    public static void main(String[] args) {
        empleado e = new empleado(101, 1500.0);
        e.aumentarsalario(10);
        System.out.println("salario: " + e.getsalario());
    }
}
