import java.util.Arrays;

public class Q22 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The Array: "+Arrays.toString(numbers));

        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
