interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}

class MultiInterfaceImpl implements C {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }

    public void methodC() {
        System.out.println("Method C");
    }
}

public class TestMultiInterface {
    public static void main(String[] args) {
        MultiInterfaceImpl obj = new MultiInterfaceImpl();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}