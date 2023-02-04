import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The Array:"+ Arrays.toString(numbers));

        System.out.println();

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total number of even numbers: " + evenCount);
        System.out.println("Total number of odd numbers: " + oddCount);
    }
}

