package clases;

class Coche extends Vehiculo {
    protected double combustible; //Cambiado a protected para permitir el acceso en subclases
    protected double autonomiaMaxima; //Autonomia maxima en km
    
    public Coche (double combustible, double autonomiaMaxima) {
        this.combustible = combustible;
        this.autonomiaMaxima = autonomiaMaxima;
        this.kilometrosRecorridos = 0;
    }

    @Override
    public void mover(double distancia) {
      if(combustible > 0) {
            if(distancia <= calcularAutonomia()) {
                kilometrosRecorridos += distancia;
                combustible -= distancia / 10;//El coche consume 1 litro cada 10 km
                System.out.println("El coche ha recorrido " + distancia + " km.");
            } else{
                System.out.println("No hay suficiente combustible para recorrer esa distancia");
            }
        } else {
            System.out.println("El coche no tiene combustible");
        }
    }  

    @Override
    public double calcularAutonomia() {
        return combustible * 10; //La autonomia es proporcional al combustible restante (10 km por litro)
    }   
}
