package Recursion_2recursionOnArray;

public class _5followUpQue {

    // sorting method -->
    static boolean isSorted(int[] arr,int idx){
        //base case -->
        if(idx == arr.length-1) return true;

        // self work --->
        if(arr[idx]>arr[idx+1]) return false;

        // recursive work -->
        return isSorted(arr,idx+1);

    }


    //method for find last index of target -->
    static int returnIndex(int[] arr,int idx, int n){

        //base case -->
        if(idx<0) // starting index tak pahuchne ke baad bhi target nhi mila to return -1
            return -1;

        //self work -->
        if(arr[idx]==n) // current element ko target se comapare kr rhe hai
            return idx;


        // recursive work-->
        int m = returnIndex(arr,idx-1,n); // recursion se kah rhe hai ki currnet element hm compare kr de rhe hai tm idx-1 se compare  krke bta do mujhe
        return m;


    }


    // main method -->
    public static void main(String[] args) {
        int arr[] = {1,2,5,2,3,4,5,54};
        int target = 1;
        System.out.println(isSorted(arr, 0));      //calling 1st method
        System.out.println("the last index of target is "+returnIndex(arr,arr.length-1,target)); //calling 2nd method

    }
}
