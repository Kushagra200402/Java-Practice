public class SumTriangleOfArray {
    public static void main(String[] Args){
        int[] arr = {1, 2, 3, 4, 5};

    }

    static void sum_array(int[] arr, int n){
        if (n < 1){
            return;
        }
        int[] temp = new int[n-1];
        for(int i=0; i<=temp.length; i++){
            temp[i] = arr[i] + arr[i+1];

        }
    }

}
