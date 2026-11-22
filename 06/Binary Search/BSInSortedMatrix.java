import java.util.Arrays;

public class BSInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };  //Sorted Matrix where first element of a particular row > last element of previous row
        int target = 9;
        System.out.println(Arrays.toString(search(arr, target)));
    }

//    Take middle column and try to reduce number of rows (Or Take middle row and try to reduce number of columns)
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

//        Run the loop till two rows are remaining
        while(rStart < (rEnd-1)){   // While this is true, it will have more than two rows
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] > target){
                rEnd = mid;    // Ignore the below rows
            }else{
                rStart = mid;  // Ignore the above rows
            }
        }

//        now we have two rows
//        check whether the target is in the cMid of two rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};    //rEnd will be rStart+1;
        }

//        Otherwise
//        Search in 1st half
        if(target < matrix[rStart][cMid]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
//        Search in 2nd half
        if(target > matrix[rStart][cMid] && target < matrix[rStart][cols-1]){
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
//        Search in 3rd half
        if(target < matrix[rStart+1][cMid]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
//        Search in 4th half i.e. if(target > matrix[rStart+1][cMid])
        else{
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }
    }

//    search in the row provided between the colums provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid]>target){
                cEnd = mid-1;
            }else {
                cStart = mid+1;
            }
        }
        return new int[]{-1, -1};
    }
}

//Time complexity = O(log(m) + log(n)) --> Since we are searching column wise and row wise