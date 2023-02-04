import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter How Many Numbers You Want To Print");

        int input = sc.nextInt();
        int n = input;
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= n-i; a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= n - i + 1; b++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }
}

