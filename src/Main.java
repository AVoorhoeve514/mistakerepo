public class Main {
    public static void main(String[] args) {

        int operand1 = 5; // Improved variable name
        int operand2 = 10; // Improved variable name
        int result = operand1 + operand2;

        for (int i = 0; i < 3; i++) {
            System.out.println("Result: " + result);
            // Note: i is not used within the loop in the original code.
            result = result * i;
        }

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Program complete!");
    }
}
