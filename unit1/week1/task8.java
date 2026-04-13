public class task8 {
    static int mostFrequentDigit(int n) {
        int[] freq = new int[10];
        if (n == 0) return 0;
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int max = -1, digit = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }
        return digit;
    }
    public static void main(String[] args) {
        System.out.println(mostFrequentDigit(122333)); // expected 3
    }
}