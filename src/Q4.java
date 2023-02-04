import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your result score: ");
            int score = scanner.nextInt();
            if (score >= 90) {
                System.out.println("You got Distinction Grade!");
            } else if (score >= 60) {
                System.out.println("You got Marit Grade!");
            } else if (score >= 40) {
                System.out.println("You got Pass Grade!");
            } else {
                System.out.println("You Failed The Exam!.");
            }
        }
    }

