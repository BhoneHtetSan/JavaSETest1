public class Q8 {
    public static void main(String[] args) {
        int[][] numbers = { {1, 2, 3, 4, 5},
                            {5, 4, 3, 2, 1},
                            {7, 8, 9, 1, 5, 7, 7}};

        for (int i = 0; i < numbers.length; i++) {
            for (int b = 0; b < numbers[i].length; b++) {
                System.out.print(numbers[i][b] + " ");
            }
            System.out.println();
        }
    }
}

