package unidad2.ActiApIn.banco;

public class CuentaBancaria {
    private double saldo;
    public CuentaBancaria(double inicial) {
        saldo = inicial;
    }
    public void depositar(double m) {
        saldo += m;
    }
    public void retirar(double m) {
        if (m <= saldo) saldo -= m;
        else System.out.println("fondos insuficientes");
    }
    public double getSaldo() {
        return saldo;
    }
}
