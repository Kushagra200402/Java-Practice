//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.
*/

public class CeilingOfletter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char ceiling = nextGreatestLetter(letters, target);
        System.out.println(ceiling);
    }

    static char nextGreatestLetter(char[] arr, char t){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>t){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return arr[start % arr.length];
    }
}
