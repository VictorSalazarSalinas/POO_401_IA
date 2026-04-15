package unidad2.ciclos;

public class ManejodeCiclos {
    public static void main(String[] args) {
        // tarea 1: while
        int i = 1;
        while (i <= 5) {
            System.out.println("conteo asc: " + i);
            i++;
        }

        // tarea 2: do-while
        int j = 10;
        do {
            System.out.println("conteo desc: " + j);
            j--;
        } while (j >= 8);

        // tarea 3: for
        for (int k = 1; k <= 10; k++) {
            System.out.println("7 * " + k + " = " + (7 * k));
        }
    }
}