package patrondediseñosingleton;

public class SingletonBillPugh {
    private SingletonBillPugh() {}

    private static class SingletonHelper {
        private static final SingletonBillPugh INSTANCIA = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstancia() {
        return SingletonHelper.INSTANCIA;
    }

    public void mostrarNombreClase() {
        System.out.println("Esta clase se llama: " + this.getClass().getSimpleName());
    }
}