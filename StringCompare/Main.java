import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = scan.nextLine();
        System.out.print("Enter second string: ");
        String b = scan.nextLine();
        System.out.print(stringCompare(a, b));

        scan.close();
    }

    public static String stringCompare(String a, String b) {
        int key = a.compareToIgnoreCase(b);
        if (key == 0) {
            return("Both strings are equal");
        } else if (key < 0) {
            return(a + " comes before " + b);
        } else if (key > 0) {
            return(b + " comes before " + a);
        } else {
            return("Error");
        }
    }
}