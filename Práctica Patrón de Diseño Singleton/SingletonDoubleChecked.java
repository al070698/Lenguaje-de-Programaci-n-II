package patrondediseñosingleton;

public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked instancia;

    private SingletonDoubleChecked() {}

    public static SingletonDoubleChecked getInstancia() {
        if (instancia == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (instancia == null) {
                    instancia = new SingletonDoubleChecked();
                }
            }
        }
        return instancia;
    }

    public void mostrarNombreClase() {
        System.out.println("Esta clase se llama: " + this.getClass().getSimpleName());
    }
}
