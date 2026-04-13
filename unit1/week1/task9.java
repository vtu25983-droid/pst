public class task9 {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i=2;i*i<=n;i++) if (n%i==0) return false;
        return true;
    }
    static int sumNonPrimeIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isPrime(i)) sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {10,11,12,13,14,15};
        System.out.println(sumNonPrimeIndex(arr)); // expected 35
    }
}