import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        System.out.println("Calculator.");
        Scanner forCharOnly = new Scanner(System.in);
        boolean working = true;
        while (working) {
            System.out.println("Enter a and b:");
            int a = (int) task_1.getData();
            int b = (int) task_1.getData();

            System.out.println("Enter operation (+, -, \\, *):");
            char operation = forCharOnly.next().charAt(0);

            switch (operation) {
                case '-' -> System.out.println(subtraction(a, b));
                case '+' -> System.out.println(summary(a, b));
                case '*' -> System.out.println(multiplication(a, b));
                case '\\' -> System.out.println(division(a, b));
                default -> System.out.println("Can't compute");
            }
            System.out.println("To exit press \"Q\" or any key to continue:");
            char exitSymbol = forCharOnly.next().charAt(0);
            if (exitSymbol == 'Q' || exitSymbol == 'q') {
                working = false;
            }
        }
        }
        public static int summary ( int a, int b){
            return a + b;
        }
        public static int division ( int a, int b){
            return a / b;
        }
        public static int multiplication ( int a, int b){
            return a * b;
        }
        public static int subtraction ( int a, int b){
            return a - b;
        }
    }

