/*
    Demonstrates:
    - public class
    - static method/variable
    - abstract class and method
    - Explicitly imports required classes
*/

import java.lang.System;

abstract class Animal {
    public abstract void makeSound(); // abstract method
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class AccessModifiersDemo {
    public static int staticCounter = 0; // static variable

    public AccessModifiersDemo() {
        staticCounter++;
    }

    public static void staticMethod() {
        System.out.println("Called static method. Instances created: " + staticCounter);
    }

    public static void main(String[] args) {
        AccessModifiersDemo.staticMethod();

        AccessModifiersDemo obj1 = new AccessModifiersDemo();
        AccessModifiersDemo obj2 = new AccessModifiersDemo();

        AccessModifiersDemo.staticMethod();

        Dog dog = new Dog();
        dog.makeSound();
    }
}
