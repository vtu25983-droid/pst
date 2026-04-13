import java.util.*;
import java.util.stream.*;

public class task1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    list.add(sc.nextInt());
                }
            }
            int result = list.stream()
                    .distinct()                          
                    .sorted(Comparator.reverseOrder())   
                    .skip(1)                             
                    .findFirst()                         
                    .orElseThrow(() -> new RuntimeException("Second highest not found (list too small or all elements identical)"));

            System.out.println("Second Highest: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}