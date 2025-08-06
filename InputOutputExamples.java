/*
    Demonstrates input/output in Java:
    - With Scanner class
    - Without Scanner class (using args, BufferedReader)
    - Explicitly imports all used libraries
*/

import java.util.Scanner;           // For Scanner input
import java.io.BufferedReader;      // For BufferedReader input
import java.io.InputStreamReader;   // For reading from System.in
import java.io.IOException;         // For IO Exception handling

public class InputOutputExamples {

    public static void withScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        System.out.println("Enter a string:");
        sc.nextLine(); // consume newline
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        sc.close();
    }

    public static void withoutScannerArgs(String[] args) {
        System.out.println("Arguments from command line:");
        for(String arg : args) {
            System.out.println(arg);
        }
    }

    public static void withoutScannerBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line using BufferedReader:");
        String input = br.readLine();
        System.out.println("You entered: " + input);
        br.close();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("1. Scanner Input/Output:");
        withScanner();

        System.out.println("\n2. Command Line Arguments:");
        withoutScannerArgs(args);

        System.out.println("\n3. BufferedReader Input:");
        withoutScannerBufferedReader();
    }
}
