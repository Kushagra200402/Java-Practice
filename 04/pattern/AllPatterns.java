public class AllPatterns {
    public static void main(String[] args) {
//        pattern1(5);
        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern28(5);
//        pascalTriangle(5);
//        pattern30(5);
//        pattern17(5);
//        pattern31(4);
    }

    static void pattern1(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }
    static void pattern2(int n){
        for(int row = 0; row<n; row++){
//            for every row, run column
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
//            When one row is printed, add new line
            System.out.print("\n");
        }
        System.out.println("----------------------------------------------");
    }

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
//            for(int col = n; col > row; col--){ //My first Approach
            for(int col = 1; col <= n-row+1; col++){   //if row starts with 0, it will be (col < n-row)
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    static void pattern4(int n){
        for(int row = 1; row <=n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    static void pattern5(int n){
        for(int row = 1; row <= (2*n-1); row++){
            int totalColsInARow = row > n ? 2*n-row : row;   // n-(n-row)
            for (int col = 1; col <= totalColsInARow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    static void pattern28(int n){
        for(int row = 1; row <= 2*n-1; row++){
            int totalColsInARow = row > n ? 2*n - row : row;
            int numOfSpaces = n - totalColsInARow;
            for(int i = 1; i <= numOfSpaces; i++){ //Printing the spaces
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInARow; col++){ //Printing the stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    static void pascalTriangle(int n){
        int numOfSpaces = 0;
        for(int row=1; row<=n; row++){
            numOfSpaces = n-row;
            for(int i=1; i <= numOfSpaces; i++){
                System.out.print("  "); //Need to print 2 spaces since each col is printed with a space
            }
            for(int col=1; col <= row; col++){
                System.out.print(col+" ");
            }
            for(int col = row-1; col >= 1; col--){
                System.out.print(col+" ");
            }

            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    static void pattern30(int n){
        int numOfSpaces = 0;
        for(int row = 1; row <= n; row++){
            numOfSpaces = n - row;
            for(int i=1; i <= numOfSpaces; i++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

    //Important Pattern (Need to Revise)
    static void pattern17(int n){
        for(int row = 1; row <= 2*n-1; row++){
            int ncols = row > n ? 2*n - row : row;
            for(int space=1; space <= n-ncols; space++){
                System.out.print(" ");
            }
            for(int col=ncols; col >= 1; col--){
                System.out.print(col);
            }
            for(int col=2; col <= ncols; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
    }

//    Most Important pattern (Need to revisit)
    static void pattern31(int n){
        int OriginalN = n;  //Storing value of n
        n = 2*n;
        for(int row = 1; row < n; row++){
            for(int col = 1; col < n; col++){
                int ValueInIndex =  OriginalN - Math.min(Math.min(row, col), Math.min(n-row, n-col)) + 1;
                System.out.print(ValueInIndex+" ");
            }
            System.out.println();
        }
    }
}

