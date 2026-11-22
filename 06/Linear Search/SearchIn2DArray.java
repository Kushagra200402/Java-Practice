import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 44, 14, 90},
                {0, 89},
                {19, 70, 1, 10, 18},
                {12, 30, 11}
        };
        int[] ans = search(arr, 12);
        if(ans[0]==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position "+Arrays.toString(ans));

        System.out.println("[Maximum Value, row, column] = "+Arrays.toString(Max(arr)));
        System.out.println(Max2(arr));

//        Value of Integer.MIN_VALUE and Integer.MAX_VALUE
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    static int[] search(int[][] A, int target){
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                //i = row, j = column
                if(A[i][j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] Max(int[][] arr){
        int max = Integer.MIN_VALUE;
        int row = 0;
        int column = 0;
        int ans[] = new int[3];
        for (row = 0; row < arr.length; row++) {
            for (column = 0; column < arr[row].length; column++) {
                if(arr[row][column]>max) {
                    max = arr[row][column];
                    ans[0] = max;
                    ans[1] = row;
                    ans[2] = column;
                }
            }
        }
        return ans;
    }

//    Using Enhanced for loop
    static int Max2(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] row : arr)
            for (int element : row)
                if (element > max) {
                    max = element;
                }
        return max;
    }
}
