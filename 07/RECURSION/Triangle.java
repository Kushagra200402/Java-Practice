public class Triangle {
    public static void main(String[] args){
//        printTriangle1(9, 0);
        printTriangle2(5, 0);
    }
    static void printTriangle1(int row, int col){
        if(row == 0){
            return;
        }
        if(row > col){
            System.out.print("*");
            printTriangle1(row, col+1);
        }else{
            System.out.println();
            printTriangle1(row-1, 0);
        }
    }

    static void printTriangle2(int row, int col){
        if(row == 0){
            return;
        }
        if(row > col){
            printTriangle2(row, col+1);
            System.out.print("*");
        }else{
            printTriangle2(row-1, 0);
            System.out.println();
        }
    }
}


