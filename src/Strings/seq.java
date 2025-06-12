package Strings;
import java.util.Scanner;
public class seq {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] a = new int[size];

        // Taking array elements input
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        // Taking the element to search for
        System.out.print("Enter the element to find: ");
        int element = scanner.nextInt();

        seq.printIndex(a, element);
        scanner.close();
    }

    public static void printIndex(int[] intArr, int element) {
        boolean found = false;  // Flag to track if we're inside a sequence of matches
        boolean firstMatch = false;  // Flag to print the first occurrence in the sequence

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == element) {
                if (!found) {  // First occurrence of the element in the sequence
                    System.out.print(i + " ");
                    found = true;
                    firstMatch = true;
                }
            } else {
                found = false;  // Reset if we encounter a different element
            }
        }
    }
}