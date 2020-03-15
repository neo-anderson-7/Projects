/*
Write a program that reads an array of lowercase strings and checks whether the array is in alphabetical order or not.

There are some rules to compare pair of strings a and b:

1) First chars of strings are compared: a[0] and b[0]. If a[0] comes earlier than b[0] in the alphabet, then a comes before b in term of alphabetical order. If the first chars are the same, then the second chars are compared, and so on.

2) If a position is reached where one string has no more chars to compare while the other does, then the shorter string is deemed to come first in alphabetical order.

3) Finally, identical strings are in alphabetical order.

You can use compareTo method of the String class to compare 2 strings. If this String object alphabetically precedes the argument string, then the result is a negative integer. The result is a positive integer if this String object alphabetically follows the argument string. The result is zero if the strings are identical. This is exactly what you need to compare 2 strings in term of alphabetical order!

For example

System.out.println("abc".compareTo("acd")); // -1 "abc" < "acd"
System.out.println("abc".compareTo("aac")); //  1 "abc" > "aac"
System.out.println("abc".compareTo("abc")); //  0 "abc" = "abc"

 

Input data format

The single input line contains lowercase strings separated by spaces.

Output data format

Only a single value - true or false.

Sample Input 1:

a b c

Sample Output 1:

true

Sample Input 2:

a aa az aza

Sample Output 2:

true
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean order = true;
        String[] arr = input.split(" ", 0);
        int i = 0;
        
        while (order && i < arr.length - 1) {
            order = stringCompare(arr[i], arr[i + 1]);
            i++;
        }
        
        System.out.print(order);
        scan.close();
    }

    public static boolean stringCompare(String a, String b) {
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
                return true;
            } else if (a.length() > b.length()) {
                return false;
            } else {
                return true;
            }
        } else if (key < 0) {
            return true;
        } else if (key > 0) {
            return false;
        } else {
            return false;
        }
    }
}
