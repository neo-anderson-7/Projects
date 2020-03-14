import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // boolean again = true;

        // do {
            System.out.println(stringComapare(scan));
            // System.out.print("Do you want to compare again (y/n)? ");
            // String ans = scan.next();
            // again = (ans == "y") ? true : false;
        // } while (again);

        scan.close();
    }

    public static String stringComapare(Scanner scan) {     // Error is due to this method
        System.out.print("Enter first string: ");
        String a = scan.next();
        System.out.print("Enter second string: ");
        String b = scan.next();

        int key = a.compareToIgnoreCase(b);
        switch (key) {
            case 0:
                return("Both strings are same");
            
            case -1:
                return(a + " comes before " + b);
            
            case 1:
                return(a + " comes before " + b);
            
            default:
                return("Error!");
        }
    }
}