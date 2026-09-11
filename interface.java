import java.util.Scanner;

interface Calculator {
    void add(int a, int b);
    void subtract(int a, int b);
    void multiply(int a, int b);
    void divide(int a, int b);
}


class Arithmetic implements Calculator {

    public void add(int a, int b) {
        System.out.println("Result = " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Result = " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Result = " + (a * b));
    }

    public void divide(int a, int b) {
        if (b != 0)
            System.out.println("Result = " + (a / b));
        else
            System.out.println("Division by zero is not possible.");
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arithmetic obj = new Arithmetic();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("First Number: ");
        int a = sc.nextInt();

        System.out.print("Second Number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                obj.add(a, b);
                break;
            case 2:
                obj.subtract(a, b);
                break;
            case 3:
                obj.multiply(a, b);
                break;
            case 4:
                obj.divide(a, b);
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
