package unidad2.pracica.clase;

abstract class figuraGeometrica {
    protected String nombre;



    public figuraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    abstract double Calcualararea();

    public void safa(){
        System.out.println("Safa");
    }

}
