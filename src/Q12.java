import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {5, 4, 1, 8, 6, 9};

        System.out.println("Arrray Element:");
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        System.out.println("Enter the position of array element you want to delete:");

        int position = sc.nextInt();
        int Length = numbers.length - 1;
        for (int i = position - 1; i < Length; i++) {
            numbers[i] = numbers[i + 1];
        }
        System.out.println("Array after Deleting Element:");
        for (int i = 0; i < Length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

