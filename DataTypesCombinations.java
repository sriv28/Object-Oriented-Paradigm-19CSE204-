/*
    Demonstrates all Java primitive data types and common type conversions
    - Explicit imports added
*/

import java.lang.String;   // Explicit import for String
import java.lang.System;   // Explicit import for System

public class DataTypesCombinations {
    public static void main(String[] args) {
        // Primitive types
        byte bt = 10;
        short sh = 100;
        int in = 1000;
        long ln = 100000L;
        float fl = 5.5f;
        double db = 10.123;
        char ch = 'A';
        boolean bl = true;

        System.out.println("byte: " + bt);
        System.out.println("short: " + sh);
        System.out.println("int: " + in);
        System.out.println("long: " + ln);
        System.out.println("float: " + fl);
        System.out.println("double: " + db);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + bl);

        // Type casting (implicit and explicit)
        int castInt = bt + sh + ch; // implicit
        System.out.println("Implicit cast (byte+short+char to int): " + castInt);

        double castDouble = in; // implicit
        System.out.println("Implicit cast (int to double): " + castDouble);

        int explicitInt = (int) db; // explicit
        System.out.println("Explicit cast (double to int): " + explicitInt);

        // String with primitives
        String mix = "Value: " + bt + ", " + fl + ", " + bl;
        System.out.println(mix);
    }
}
