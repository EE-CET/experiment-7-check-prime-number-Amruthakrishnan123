import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read n
        if (!scanner.hasNextInt()) return; // Safety check for valid input
        int n = scanner.nextInt();
        
        // TODO: Check if n is prime
        boolean isPrime = true;

        // Hint 1: If n <= 1, it is Not Prime.
        if (n <= 1) {
            isPrime = false;
        } else {
            // Hint 2: Loop from 2 to sqrt(n). 
            // If n is divisible by any number, it is Not Prime.
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // Exit loop early if a divisor is found
                }
            }
        }

        // Hint 3 & TODO: Print "Prime" or "Not Prime"
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        
        scanner.close();
    }
}1