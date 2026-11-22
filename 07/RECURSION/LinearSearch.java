import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 18, 2, 18, 18, 2};
        System.out.println(findIndexVal(arr, 18, 0));
        System.out.println(searchFromEnd(arr, 18, arr.length-1));
        System.out.println(valueExists(arr, 18, 0));
        findAllIndexes(arr, 18, 0);
        System.out.println(list);
//        ArrayList<Integer> indexes = new ArrayList<>();
        System.out.println(findIndexes(arr, 2, 0, new ArrayList<>()));
        System.out.println(findIndexes2(arr, 18, 0));
    }

    static int findIndexVal(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndexVal(arr, target, index+1);
    }

    static int searchFromEnd(int[] arr, int target, int index){
        if(index < 0){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return searchFromEnd(arr, target, --index);
    }

    static boolean valueExists(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index] == target) || valueExists(arr, target, index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndexes(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndexes(arr, target, index+1);
    }

    static ArrayList<Integer> findIndexes(int[] arr, int target, int index, ArrayList<Integer> l){
        if(index == arr.length){
            return l;
        }
        if(arr[index] == target){
            l.add(index);
        }
        return findIndexes(arr, target, index+1, l);
    }


    // Getting the list w/o passing as a parameter
    // This is not a very optimized approach since here we are creating list again and again in every function call.
    static ArrayList<Integer> findIndexes2(int[] arr, int target, int index){
        ArrayList<Integer> indexes = new ArrayList<>();
        if(index == arr.length){
            return indexes;
        }
//        This will contain answer for that function call only
        if(arr[index] == target){
            indexes.add(index);
        }
        ArrayList<Integer> ansFromPrevCalls = findIndexes2(arr, target, index+1);

        indexes.addAll(ansFromPrevCalls);

        return indexes;

        // Wrong approach (I was doing this earlier)
//        if (ansFromPrevCalls.isEmpty()){
//            return indexes;
//        }else{
//            ansFromPrevCalls.addAll(indexes);
//            return ansFromPrevCalls;
//        }
//        return ansFromPrevCalls;
    }
}
