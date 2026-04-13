
public class task4 {
    public static void main(String[] args) {
        // Example usage to see the output in your terminal
        int result = addLastDigits(197, 512);
        System.out.println("The sum of the last digits is: " + result);
    }

    public static int addLastDigits(int input1, int input2) {
        // Convert negative numbers to positive to get the correct last digit
        if (input1 < 0) {
            input1 = Math.abs(input1);
        }
        if (input2 < 0) {
            input2 = Math.abs(input2);
        }

        // Use modulo 10 to extract the last digit
        return (input1 % 10) + (input2 % 10);
    }
}