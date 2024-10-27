package patrondediseñosingleton;

public class Main {
    public static void main(String[] args) {
        // Eager Initialization
        SingletonEager singletonEager = SingletonEager.getInstancia();
        singletonEager.mostrarNombreClase();

        // Lazy Initialization
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        singletonLazy.mostrarNombreClase();

        // Thread-Safe Singleton
        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstancia();
        singletonThreadSafe.mostrarNombreClase();

        // Double-Checked Locking
        SingletonDoubleChecked singletonDoubleChecked = SingletonDoubleChecked.getInstancia();
        singletonDoubleChecked.mostrarNombreClase();

        // Bill Pugh Singleton
        SingletonBillPugh singletonBillPugh = SingletonBillPugh.getInstancia();
        singletonBillPugh.mostrarNombreClase();

        // Enum Singleton
        SingletonEnum singletonEnum = SingletonEnum.INSTANCIA;
        singletonEnum.mostrarNombreClase();
    }
}
