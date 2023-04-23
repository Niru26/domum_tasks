import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        System.out.println("Triangular number.");
        System.out.print("Enter triangular numbers quantity: ");
        int limit_1 = (int) getData();
        int triangularNumber;
        for (int i = 1; i <= limit_1; i++) {
            triangularNumber = 0;
            for (int j = 0; j <= i; j++) {
                triangularNumber += j;
            }
            System.out.print(triangularNumber + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Factorial.");
        int limit_2 = (int) getData();
        long factorial = 1;
        for (int i = 1; i <= limit_2; i++) {
            factorial *= i;
        }
        System.out.println("Result: " + factorial);
        System.out.println();
        System.out.println("Simple numbers.");
        System.out.print("Enter simple number calculation limit: ");
        int limit_3 = (int) getData();
        if (limit_3 < 2)
            System.out.println("Not possible to calculate simple number");
        for (int i = 2; i <= limit_3; i++) {
            if (checkSimpleNumber(i))
                System.out.print(i + ", ");
        }
    }

    public static double getData() {
        Scanner enteredData = new Scanner(System.in);
        double dataForProcessing = enteredData.nextDouble();
        return dataForProcessing;
    }

    public static boolean checkSimpleNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
            return true;
    }
}
