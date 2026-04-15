package unidad2.ParadigmaOO.calculadora;

public class main {
    public static void main(String[] args) {
        calculadora c = new calculadora();
        System.out.println(c.sumar(2, 2));
        System.out.println(c.sumar(1, 2, 3));
        System.out.println(c.sumar(2.5, 3.5));
    }
}
