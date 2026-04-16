package unidad3.ejercicios.set;
import java.util.*;
import java.util.concurrent.Callable;

public class SensorTracker {
    public static void main(String[] args){
        Set<String> CamarasActivas = new HashSet<>();

        CamarasActivas.add("cam 01");
        CamarasActivas.add("cam 03");
        CamarasActivas.add("cam 03");
        CamarasActivas.add("cam 04");
        CamarasActivas.add("cam 05");


        CamarasActivas.remove("cam 04");

        Set<String> CamarasMantenimiento = new HashSet<>();
        CamarasMantenimiento.add("cam 03");
        CamarasMantenimiento.add("cam 04");

        CamarasActivas.removeAll(CamarasMantenimiento);
        System.out.println("Camaras activas despues de remover las camaras en matenimiento " + CamarasActivas );

        CamarasActivas.clear();
    }




    }

