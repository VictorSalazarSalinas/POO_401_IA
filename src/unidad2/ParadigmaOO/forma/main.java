package unidad2.ParadigmaOO.forma;

public class main {
    public static void main(String[] args) {
        forma[] formas = {new circulo(5), new rectangulo(4, 5)};
        for (forma f : formas){
            System.out.println(f.calculararea());
        }
    }
}
