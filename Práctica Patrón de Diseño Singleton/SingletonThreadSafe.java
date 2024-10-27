package patrondediseñosingleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instancia;

    private SingletonThreadSafe() {}

    public static synchronized SingletonThreadSafe getInstancia() {
        if (instancia == null) {
            instancia = new SingletonThreadSafe();
        }
        return instancia;
    }

    public void mostrarNombreClase() {
        System.out.println("Esta clase se llama: " + this.getClass().getSimpleName());
    }
}