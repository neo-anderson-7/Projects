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
            String ans = scan.nextLine();
            again = ans.equalsIgnoreCase("y") ? true : false;
        } while (again);

        System.out.println("Exiting Program");
        scan.close();
    }

    public static String stringCompare(String a, String b) {
        String str1 = "";
        String str2 = "";
        if (a.length() != b.length()) {
            int limit = a.length() < b.length() ? a.length() : b.length();
            str1 = a.substring(0, limit);
            str2 = b.substring(0, limit);
        }

        str1 = a;
        str2 = b;

        int key = str1.compareToIgnoreCase(str2);
        if (key == 0) {
            if (a.length() < b.length()) {
                return(a + " comes before " + b);
            } else if (a.length() > b.length()) {
                return(b + " comes before " + a);
            } else {
                return("Both strings are equal");
            }
        } else if (key < 0) {
            return(a + " comes before " + b);
        } else if (key > 0) {
            return(b + " comes before " + a);
        } else {
            return("Error");
        }
    }
}