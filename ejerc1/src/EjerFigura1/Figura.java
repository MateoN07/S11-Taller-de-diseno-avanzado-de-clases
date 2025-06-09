package EjerFigura1;

public abstract class Figura {
    private Punto puntorigen;
    private String nombre;

    public Figura() {
        this.puntorigen = puntorigen;
        this.nombre = nombre;
    }

    public Punto getOrigen() {
        return puntorigen;
    }

    public void setOrigen(Punto origen) {
        this.puntorigen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double Perimetro();

    public abstract double calcularArea();

    public abstract String obtenerNombre();

    @Override
    public String toString(){
        return "Figura: "+ nombre + "\nOrigen: " + puntorigen.toString();
    }

}
