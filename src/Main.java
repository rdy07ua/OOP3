public class InitializedObject {
    private static int staticInitializationCounter;
    private int instanceInitializationCounter;

    // Статичний блок ініціалізації
    static {
        staticInitializationCounter = 1;
        System.out.println("Статичний блок ініціалізації: " + staticInitializationCounter);
    }

    // Нестатичний блок ініціалізації
    {
        instanceInitializationCounter = 1;
        System.out.println("Нестатичний блок ініціалізації: " + instanceInitializationCounter);
    }

    // Конструктор
    public InitializedObject() {
        System.out.println("Конструктор: " + instanceInitializationCounter);
        instanceInitializationCounter++;
    }

    public static void main(String[] args) {
        InitializedObject obj1 = new InitializedObject();
        InitializedObject obj2 = new InitializedObject();
        InitializedObject obj3 = new InitializedObject();
    }
}