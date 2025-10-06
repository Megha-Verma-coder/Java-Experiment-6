interface BaseInterface {
    void baseMethod();
}

interface DerivedInterface extends BaseInterface {
    void derivedMethod();
}

class Implementer implements DerivedInterface {
    public void baseMethod() {
        System.out.println("BaseInterface method");
    }

    public void derivedMethod() {
        System.out.println("DerivedInterface method");
    }
}

public class TestInterfaceExtension {
    public static void main(String[] args) {
        Implementer obj = new Implementer();
        obj.baseMethod();
        obj.derivedMethod();
    }
}