import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter How Many Numbers You Want To Print");

        int input = sc.nextInt();

        int n = input;
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
