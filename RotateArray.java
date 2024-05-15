
/**
 * RotateArray
 * ..
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * 
 * How many different ways do you know to solve this problem?
 * ,k
 */

public class RotateArray {
     public static void main(String[] args) {
          System.out.println("wow nice");
          int n = 7;
          int k = 3;
          int[] array= {1,2,3,4,5,6,7};
          int[]result =rotateArray(n,k,array);
          for (int i : result) {
               System.out.println(i);
          }
     }
     static int[] rotateArray(int n,int k,int[] array){
          int[] arr=new int[n];
          int arrIndex=0;
          for(int i=n-k;i<n;i++){
               arr[arrIndex++]=array[i];  
          }
          for(int i=0;i<n-k;i++){
               arr[arrIndex++]=array[i];
          }
          return arr;
     }
}