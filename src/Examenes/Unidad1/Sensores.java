package Examenes.Unidad1;

public abstract class Sensores {
    protected String dato;

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    // Constructor de la clase
    public Sensores(String dato){
        this.dato = dato;
    }

    public abstract void leerDato();
}
