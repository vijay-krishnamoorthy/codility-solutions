package arrays.introduction.CountEvenDigitNumbers;

import java.util.Scanner;

public class CountEvenDigitNumbers {

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

        // actual logic
        int count = 0;
        for(int i : arr ){
            // this is a simpler and faster logic than keep on diving the integer by 10
            String[] s = String.valueOf(i).split("");
            if(s.length%2==0){
                count+=1;
            }
        }

        System.out.println("The array has " + count + " even numbers");
    }
}
