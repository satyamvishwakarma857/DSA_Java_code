package Sorting_1;
// incresing sorting
/*
time complexity -->        {bubble sort is stable and in-place algorithm}
best case --> 0(n)
worst case --> O(n^2)
avg case --> O(n^2)
 */

/*
traverse -->i=0to n-1 and j=0to n-1-i;
sbse bde value ko peeche dhakelte chalo (last index)--> with the help of j loop phir j loop ko 1 kam krte jao isiliye (j<n-1-i) condition hai
 */

public class _1BubbleSort {

    static int[] BubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){ //i<n-1 isliye kynki 1 pass me 1 element uski shi place (apne last index) pr phuch jata h to hm yadi n element h to hm n-1 element ko shi rkh denge to bacha hua ek element apne aap shi jgh pr set hoga
            boolean flag  = false;
            for(int j=0;j<n-1-i;j++){// -i isliye h ki har baar j ko ek index kam tk traverse krna pdta hai
                if(arr[j]>arr[j+1]){ // yhi sign (>) ko ulta kr do bs code me to sorting decreasing order me hone lgegi
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }

            }
            if(!flag) break;
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {5,44,6,2,-3,7,9,0};
        BubbleSort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }

    }
}
