package patrondediseñosingleton;

public enum SingletonEnum {
    INSTANCIA;

    public void mostrarNombreClase() {
        System.out.println("Esta clase se llama: " + this.getClass().getSimpleName());
    }
}