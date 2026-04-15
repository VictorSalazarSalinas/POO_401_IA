package unidad2.ParadigmaOO.empleado;

class empleado {
    private int id;
    private double salario;
    empleado(int id, double salario) {
        this.id = id; this.salario = salario;
    }
    void aumentarsalario(double p) {
        salario += salario * (p / 100);
    }
    double getsalario() {
        return salario;
    }
}