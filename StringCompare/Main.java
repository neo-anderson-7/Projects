import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = scan.next();
        System.out.print("Enter second string: ");
        String b = scan.next();

        int key = a.compareToIgnoreCase(b);
        if (key == 0) {
            System.out.print("Both strings are equal");
        } else if (key < 0) {
            System.out.print(a + " comes before " + b);
        } else if (key > 0) {
            System.out.print(b + " comes before " + a);
        } else {
            System.out.print("Error");
        }

        scan.close();
    }
}