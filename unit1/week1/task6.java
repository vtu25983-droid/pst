public class task6 {
    static int sumOfPowerDigits(int n) {
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += (int)Math.pow(d, digits);
            temp /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfPowerDigits(153)); // expected 153
    }
}