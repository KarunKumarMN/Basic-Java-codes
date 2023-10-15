import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        Map<Integer, Integer> counts = new HashMap<>();
        long totalPairs = 0;

        for (int value : A) {
            int remainder = value % 60;
            int complement = (60 - remainder) % 60;

            totalPairs += counts.getOrDefault(complement, 0);
            counts.put(remainder, counts.getOrDefault(remainder, 0) + 1);
        }

        System.out.println(totalPairs);
    }
}