// File: Animal.java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

// File: Dog.java
class Dog extends Animal {
    Dog() {
        super(); // DOD 3
        System.out.println("Dog constructor");
    }

   
    void sound() { // DOD 4
        System.out.println("Dog barks");
    }
}