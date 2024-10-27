package patrondediseñosingleton;

public class SingletonEager {
    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstancia() {
        return instancia;
    }

    public void mostrarNombreClase() {
        System.out.println("Esta clase se llama: " + this.getClass().getSimpleName());
    }
}