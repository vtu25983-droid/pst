public class task5 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
    public static int countPrimesInRange(int input1,int input2) {
        int cou=0;
        for (int d = input1; d <= input2; d++) {
            if (isPrime(d)) {
                cou++;
                System.out.println(d);
            }
        }
        return cou;
    }
    public static void main(String[] args) {
        System.out.println("Count: " + countPrimesInRange(10,20));
    }
}