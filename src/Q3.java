import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to compare: ");
        int n = scanner.nextInt();
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}

