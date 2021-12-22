package arrays.introduction.SquaresOfASortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfASortedArray {
    public static void main(String[] args){
        // opening a scanner to get the number of inputs and input array from the user
        Scanner sc = new Scanner(System.in);
        // getting the array size from the user
        int numberOfElements = sc.nextInt();
        // creating a new array of size got from the user
        int[] arr = new int[numberOfElements];
        // getting the n inputs from the user and reading it into the array
        for(int i=0; i<numberOfElements;i++){
            arr[i] = sc.nextInt();
        }

        // the above logic has been done by the coding platform itself.
        getSquaredSortedArray(arr);
    }

    private static void getSquaredSortedArray(int[] arr){
        Arrays.stream(arr).map(e->{return e*2;}).sorted();
        for (int i : arr)
            System.out.println(i);
    }
}
