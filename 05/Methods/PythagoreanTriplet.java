import static java.lang.Math.*;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};
        int[] arr2 = {10, 4, 6, 12, 5};
        System.out.println(IsTriplet(arr));
    }

    static boolean IsTriplet(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    int x = arr[i]*arr[i];
                    int y = arr[j]*arr[j];
                    int z = arr[k]*arr[k];
                    if(x+y == z || y+z == x || z+x == y) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
