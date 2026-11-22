public class ColumnNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 5, 6, 0},
                {5, 9},
                {23, 55, 8},
        };
        System.out.println("Printing the 2D array");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.print("\n");
        }
    }
}
