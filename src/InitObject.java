public class InitObject {
    private static int staticInit;
    private int instanceInit;

    static {
        staticInit = 1;
        System.out.println(staticInit + ". Static initialization");
    }

    {
        instanceInit = 2;
        System.out.println(instanceInit + ". Instance initialization");
    }

    public InitObject() {
        System.out.println("3. Constructor");
    }


}
