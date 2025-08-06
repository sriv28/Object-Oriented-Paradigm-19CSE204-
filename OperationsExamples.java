/*
    Demonstrates all major operation types in Java
    - Explicitly imports all required core classes
*/

import java.lang.System; // Explicit import (optional, as it's auto-imported)

public class OperationsExamples {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));

        // Relational
        System.out.println("a == b? " + (a == b));
        System.out.println("a < b? " + (a < b));
        System.out.println("a > b? " + (a > b));

        // Logical
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // Bitwise
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        // Assignment
        int c = a;
        c += b;
        System.out.println("After c += b, c = " + c);
        c *= 2;
        System.out.println("After c *= 2, c = " + c);
    }
}
