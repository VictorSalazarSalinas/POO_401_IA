package unidad2.ActiApIn.banco;

public class main {
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria(500);
        c.depositar(200);
        c.retirar(100);
        System.out.println("saldo actual: " + c.getSaldo());
    }
}