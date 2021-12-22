package arrays.introduction.MaxConsecutiveOnes;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        // openning a scanner to get the number of inputs and input array from the user
        Scanner sc = new Scanner(System.in);
        // getting the array size fromt the user
        int numberOfElements = sc.nextInt();
        // creating a new array of size got from the user
        int[] arr = new int[numberOfElements];
        // getting the n inputs from the user and reading it into the array
        for(int i=0; i<numberOfElements;i++){
            arr[i] = sc.nextInt();
        }

        // the above logic is been done by the coding platform itself.

        // actual logic

        // to hold the maximum no of consecutive 1's in the array
        int maxCount = 0;
        // counter to keep track of the current sequence
        int count = 0;
        // iterating through the array
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i]!=1)  // if the current element is not one then we are resetting the counter to 0
                count = 0;
            else {
                // if the current element is one we are increasing the count by 1
                count += 1;
                // assigning the count to max count if the count encountered is bigger than the available count
                if(maxCount < count) maxCount = count;
            }
        }

        // I'm printing the maxCount here instead of returning it.
        System.out.println("Max no of consecutive 1's : " + maxCount);
    }
}
