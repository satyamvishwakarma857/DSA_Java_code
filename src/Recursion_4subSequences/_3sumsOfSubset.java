package Recursion_4subSequences;

public class _3sumsOfSubset {
    //arr[] = {2,3} --> subsets --> {{2},{3},{2,3},{ }} -->sum of subset --> {2,3,5,0}


    static void sum(int[] arr,int n ,int idx,int ans ){

        //base case
        if(idx==n){
            System.out.print(ans+" ");
            return;
        }
        int curr = arr[idx];

        // curr int add in ans
        sum(arr,n,idx+1,ans+curr); // include

        //// curr int not add in ans
        sum(arr,n,idx+1,ans); // exclude

    }



    public static void main(String[] args) {
        int[] arr = {2,4};
        sum(arr,arr.length,0,0);

    }
}
