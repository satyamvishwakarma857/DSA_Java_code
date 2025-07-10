package Array;

public class _1maxNo {

    public static void main(String[] args) {
        int arr[] ={ 7,3,56,545,3435,6544,546474654,65563,335353,6544747,6,43,5};
        int ans = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++ ){
            if(ans<arr[i]){
                ans = arr[i];
            }
        }
        System.out.println("max no in array is "+ans);
    }
}


