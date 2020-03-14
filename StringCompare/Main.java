import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean again = false;

        do {
            System.out.print("Enter first string: ");
            String a = scan.nextLine();
            System.out.print("Enter second string: ");
            String b = scan.nextLine();
            System.out.println(stringCompare(a, b));
            System.out.println("");

            System.out.print("Do you want to compare again? (y/n) ");
            String ans = scan.next();
            again = ans.equalsIgnoreCase("y") ? true : false;
        } while (again);

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