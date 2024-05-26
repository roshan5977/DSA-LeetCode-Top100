public class Search {

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,8,9,13};
        int searchInt=9;
        System.out.println(searchInt+" is in position : '"+linearSearch(arr, searchInt)+"' in the array");
        System.out.println(searchInt+" is in position : '"+binarySearch(arr, searchInt,"with_recursion")+"' in the array");
        System.out.println(searchInt+" is in position : '"+binarySearch(arr, searchInt,"without_recursion")+"' in the array");


        
    }
    static int binarySearch(int[] arr, int k,String type){
    //And it works only for sorted array!
       if (type=="with_recursion")
       return  binarySearchWithRecursion(arr,0,arr.length,k);
       else 
       return  binarySearchWithoutRecursion(arr,0, arr.length,k);
    }

    static int  binarySearchWithRecursion(int[] arr, int first, int last, int k){

          int midOfArr=(first+last)/2;
          if(arr[midOfArr]==k)return midOfArr;
          else if(k<arr[midOfArr])return binarySearchWithRecursion(arr,first,midOfArr-1,k);
          else if(k>arr[midOfArr])return binarySearchWithRecursion(arr, midOfArr+1, last, k);
          else return -1;

    }

    static int  binarySearchWithoutRecursion(int[] arr, int first, int last, int k){

        while(first<=arr.length-1 && last >=0 && first!=last ){
            int midOfArr=(first+last)/2;
            if(arr[midOfArr]==k)return midOfArr;
            if(k<arr[midOfArr])last=midOfArr-1;
            else first=midOfArr+1;
        }
        return -1;
    }

    //
    static int linearSearch(int[] arr,int k){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)return i;
        }
        return -1;

    }
    
}

//recursion

//what is brute force approach means?
//what is divide and conquer approach means?
//what is time complexity and space complexity?
//what is recurence relation?
//what is the big O time complexity
//what is Substitution ,Master,Recursive tree


/**
 * As discussed the time complexity  and space complexity of linear search:
 * As per the worst time compelxity:O(n)
 * As per the best time compelxity:O(1)
 * As per the worst space compelxity:O(1)
 * As per the best space compelxity:O(1)   {As we have not created any more variable of arr or like wise...}
 */
 
 /**
  * As divide and conquer says break into smaller parts and solve it and merge it at last.
  */


  /**
   * Recurrence Relation
   */