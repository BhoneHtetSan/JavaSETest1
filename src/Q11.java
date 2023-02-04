import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {5, 4, 1, 8, 6, 9};
        System.out.println("Arrray value");
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        System.out.println("Which number you want to delete? (numbers from array)");
        int thenum = sc.nextInt();
        int deletenum = thenum;
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            if (numbers[i] == deletenum) {
                for (int j = i; j < length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                length--;
                i--;
            }
        }
        System.out.println("Array after deleting value " + deletenum + ":");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }}
