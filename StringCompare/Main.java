import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean again = false;

        do {
            System.out.println(stringComapare(scan));
            System.out.print("Do you want to compare again (y/n)? ");
            String ans = scan.next();
            if (ans == "y") {
                again = true;
            } else if (ans == "n") {
                again = false;
            } else {
                System.out.print("Wrong Input! Exiting program.");
            }
        } while (again);

        scan.close();
    }

    public static String stringComapare(Scanner scan) {
        System.out.print("Enter first string: ");
        String a = scan.next();
        System.out.print("Enter second string: ");
        String b = scan.next();

        int key = a.compareToIgnoreCase(b);
        if (key == 0) {
            return("Both strings are same");
        } else if (key > 0) {
            return(a + " comes before " + b);
        } else if (key < 0) {
            return(a + " comes before " + b);
        } else {
            return("Error!");
        }
    }
}