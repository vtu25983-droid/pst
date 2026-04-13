public class task7 {
    static int uniqueDigitCount(int n) {
        boolean[] seen = new boolean[10];
        int count = 0;
        if (n == 0) return 1;
        while (n > 0) {
            int d = n % 10;
            if (!seen[d]) {
                seen[d] = true;
                count++;
            }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(uniqueDigitCount(112233)); // expected 3
    }
}