package unidad2.controladicional;

public class ControlAdicional {
    public static void main(String[] args) {
        // seccion 1: break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println("ciclo break: " + i);
        }

        // seccion 2: continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println("ciclo continue: " + i);
        }

        // seccion 3: return
        int[] numeros = {10, 20, 30, 40};
        System.out.println(encontrarnumero(numeros, 30));
    }

    public static String encontrarnumero(int[] arr, int objetivo) {
        for (int n : arr) {
            if (n == objetivo) return "numero encontrado";
        }
        return "no se encontro";
    }
}
