package clases;

abstract public class Vehiculo {
    
    protected double kilometrosRecorridos;
    
    //Metodo para mover el vehiculo (puede ser sobrescrito en subclases)
    public abstract void mover(double distancia);
    
    //Metodo para calcular la autonomia (puede ser sobrescrito en subclases)
    public abstract double calcularAutonomia();
}
