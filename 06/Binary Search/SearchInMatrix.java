import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {11, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        }; //Here the matrix is sorted row and column wise
        int target = 33; //target = 33 is equivalent to worst case, here it will n comparisons row wise and column wise total 2n comparisons.
//        So the time complexity = O(n) (in worst case)
        int[] searchIndex = Search(matrix, target);
        System.out.println(Arrays.toString(searchIndex));
    }

//    It does not apply only on square matrix. matrix can be nxm also.
    static int[] Search(int[][] arr, int target){
        int row = 0;
        int col = arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            if(arr[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
