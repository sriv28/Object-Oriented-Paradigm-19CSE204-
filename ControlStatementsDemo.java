/*
    Demonstrates all main control statements in Java
    - Explicitly imports relevant classes
*/

import java.lang.System;

public class ControlStatementsDemo {
    public static void main(String[] args) {
        // If-else
        int num = 5;
        if (num > 0) {
            System.out.println("Positive");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }

        // Switch-case
        int day = 3;
        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other Day");
        }

        // For loop
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop, i: " + i);
        }

        // While loop
        int count = 0;
        while (count < 2) {
            System.out.println("While loop, count: " + count);
            count++;
        }

        // Do-while loop
        int j = 0;
        do {
            System.out.println("Do-while loop, j: " + j);
            j++;
        } while(j < 1);

        // Break & continue
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            if (i == 4) break;
            System.out.println("Break/Continue example, i: " + i);
        }
    }
}
