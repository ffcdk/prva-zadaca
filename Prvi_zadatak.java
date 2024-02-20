import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = scanner.nextInt();
        System.out.println("Brojevi od 1 do " + n + " koji su djeljivi sa sumom svojih cifara su:");
        for (int i = 1; i <= n; i++) {
            if (i % sumOfDigits(i) == 0) {
                System.out.println(i);
            }
        }
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}