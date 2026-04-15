package unidad2.ParadigmaOO.estudiante;

import java.util.*;
class clase {
    String nombredeclase;
    List<estudiante> estudiantes = new ArrayList<>();
    clase(String n) {
        nombredeclase = n;
    }
    void agregar(estudiante e) {
        estudiantes.add(e);
    }
    void mostrar() {
        for (estudiante e : estudiantes) {
            System.out.println(e.nombre);
        }
    }
}