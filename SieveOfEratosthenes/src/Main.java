import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        int i = 2;
        while (i * i <= n) {
            if (isPrime[i]) {
                int j = i * i;
                while (j <= n) {
                    isPrime[j] = false;
                    j = j + i;
                }
            }
            i = i + 1;
        }

        System.out.println("Liczby pierwsze od 2 do " + n + ":");
        for (int a = 2; a <= n; a++) {
            if (isPrime[a]) {
                System.out.print(a + " ");
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nCzas wykonania: " + (endTime - startTime) + " ms");
    }
}