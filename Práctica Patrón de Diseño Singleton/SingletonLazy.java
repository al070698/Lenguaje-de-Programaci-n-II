package patrondediseñosingleton;

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {}

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

    public void mostrarNombreClase() {
        System.out.println("Esta clase se llama: " + this.getClass().getSimpleName());
    }
}