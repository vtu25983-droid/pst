public class task3 {
    public static void main(String[] args) {
        int[] tests = {121, 123, -121};
        for (int t : tests) {
            System.out.println("Result for " + t + ": " + isPalinNum(t));
        }
    }

    public static int isPalinNum(int input1) {
        if (input1 < 0) return 1;

        int temp = input1;
        int rev = 0;

        while (input1 > 0) {
            rev = rev * 10 + (input1 % 10);
            input1 /= 10;
        }

        if (rev != temp) return 1;
        return 2;
    }
}
