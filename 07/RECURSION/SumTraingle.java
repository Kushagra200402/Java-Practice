import java.util.Arrays;

public class SumTraingle {
    public static void main(String[] Args){
        int[] arr = {1, 2, 3, 4, 5};
        printTrianle(arr);
    }

    private static void printTrianle(int[] arr) {
        if (arr.length < 1){
            return;
        }

        int[] temp = new int[arr.length-1];
        for(int i=0; i<temp.length; i++){
            temp[i] = arr[i] + arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        printTrianle(temp);
//        System.out.println(Arrays.toString(arr));
    }

}

