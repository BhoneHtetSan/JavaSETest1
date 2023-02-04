import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 8, 6, 9};
        System.out.println("The Elements in the array: " + Arrays.toString(numbers));

        System.out.println();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements in the array: " + sum);
    }
}

