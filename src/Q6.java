import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Red,Green,Blue,ORange,White,Purple");
        System.out.print("Enter one of the color mention above: ");

        String color = scanner.nextLine();
        switch (color) {
            case "Red":
                System.out.println("The color is Red.");
                break;
            case "Green":
                System.out.println("The color is Green.");
                break;
            case "Blue":
                System.out.println("The color is Blue.");
                break;
            case "Orange":
                System.out.println("The color is Orange.");
                break;
            case "White":
                System.out.println("The color is White.");
                break;
            case "Purple":
                System.out.println("The color is Purple.");
                break;
            default:
                System.out.println("Invalid color or invalid character have to start with capital latter");
                break;
        }
    }
}

