import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite string: ");
        String input = scanner.nextLine();
        int brojKaraktera = input.length();
        System.out.println("Broj karaktera u unesenom stringu je: " + brojKaraktera);
    }
}