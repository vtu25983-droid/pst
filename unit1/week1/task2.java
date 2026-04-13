
public class task2 {
    public static void main(String[] args) {
        // 1. Create an object of the helper class
        UserMainCode helper = new UserMainCode();
        
        // 2. Call the method and store the result
        int n = 10; // Let's find the 10th Fibonacci number
        long result = helper.nthFibonacci(n);
        
        // 3. PRINT the result so you can see it in the terminal
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}

// Move this class outside the main method
class UserMainCode {
    public long nthFibonacci(int input1) {
        if (input1 <= 1) return 0;
        if (input1 == 2) return 1;

        long a = 0, b = 1, c = 0;
        for (int d = 3; d <= input1; d++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}