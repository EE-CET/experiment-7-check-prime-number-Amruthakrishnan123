import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Check if there is an integer to read to avoid errors
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
        
        scanner.close();
    }

    public static boolean isPrime(int n) {
        // 1. If n <= 1, it is Not Prime.
        if (n <= 1) {
            return false;
        }
        
        // 2. Loop from 2 to sqrt(n).
        // If n is divisible by any number, it is Not Prime.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        // 3. Otherwise, it is Prime.
        return true;
    }
}