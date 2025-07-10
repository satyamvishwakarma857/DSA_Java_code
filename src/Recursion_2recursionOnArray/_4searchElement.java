package Recursion_2recursionOnArray;

import java.util.ArrayList;

public class _4searchElement {
    // 1 method jisme hme compare krke bs true aur false return krne hai
    static boolean search(int[] arr,int idx, int n){

        //base case -->
        if(idx==arr.length) // last index tak pahuchne ke baad bhi target nhi mila to return false
            return false;

        //self work -->
        if(arr[idx]==n) // current element ko target se compare kr rhe hai
            return true;


        // recursive work-->
        return  search(arr,idx+1,n); // recursion se kah rhe hai ki currnet element hm compare kr de rhe hai tm idx+1 se compare  krke bta do mujhe

    }

// 2nd method jisme agar target mil gya to vo kaunse index pr hai return kro (ye method first index return krega)
    static int returnIndex(int[] arr,int idx, int n){

        //base case -->
        if(idx==arr.length) // last index tak pahuchne ke baad bhi target nhi mila to return -1
            return -1;

        //self work -->
        if(arr[idx]==n) // current element ko target se comapare kr rhe hai
            return idx;


        // recursive work-->
        int m = returnIndex(arr,idx+1,n); // recursion se kah rhe hai ki currnet element hm compare kr de rhe hai tm idx+1 se compare  krke bta do mujhe
        return m;


    }
// 3rd method jitne bhi indices pr target ho sabhi indices ko print kro -->
    static void returnAllIndex(int[] arr,int idx, int n){

        //base case -->
        if(idx==arr.length) // last index tak pahuchne ke baad bhi target nhi mila to return -1
            return ;

        //self work -->
        if(arr[idx]==n) // current element ko target se comapare kr rhe hai
            System.out.println(idx+" ");


        // recursive work-->
        returnAllIndex(arr,idx+1,n); // recursion se kah rhe hai ki currnet element hm compare kr de rhe hai tm idx+1 se compare  krke bta do mujhe



    }

    //4th method jisme sabhi target wali indices ko ek array me bharke return krna hai
    static ArrayList<Integer> returnArrayList(int[] arr,int idx, int n){

        //base case -->
        if(idx==arr.length) // last index tak pahuchne ke baad bhi target nhi mila to empty arraylist return kr doo
            return new ArrayList<Integer>();

        //self work -->
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(arr[idx]==n) // current element ko target se comapare kr rhe hai
            ans.add(idx);


        // recursive work-->
        ArrayList<Integer> smallAns = returnArrayList(arr,idx+1,n); // recursion se kah rhe hai ki currnet element hm compare kr de rhe hai tm idx+1 se compare  krke bta do mujhe
        ans.addAll(smallAns);
        return ans;



    }

// main method -->
    public static void main(String[] args) {
        int arr[] = {4,12,4,3,2,3,7,3,6,3};
        int target =3;
        //System.out.println("is element exist ? --> "+search(arr,0,target));               // 1st method calling
        //System.out.println("target is at index of "+returnIndex(arr,0,target));          // 2nd method calling
        //returnAllIndex(arr,0,target);                                                   //calling 3rd method
        ArrayList<Integer> ans = returnArrayList(arr,0,target); // 4th method jisme arrayList return kiya gya hai
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
}
