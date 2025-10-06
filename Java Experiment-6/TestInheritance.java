interface InterfaceOne {
    void methodOne();
}

interface InterfaceTwo {
    void methodTwo();
}

class Parent {
    void parentMethod() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent implements InterfaceOne, InterfaceTwo {
    public void methodOne() {
        System.out.println("InterfaceOne method");
    }

    public void methodTwo() {
        System.out.println("InterfaceTwo method");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.parentMethod();
        obj.methodOne();
        obj.methodTwo();
    }
}