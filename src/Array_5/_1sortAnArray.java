package Array_5;
// array ko sort krna hai jisme only 1 and 0  hai --> pointer approach hai..
public class _1sortAnArray {
    // 1 method         //jisme hme array ko sort krne ke liye 3 baar traverse krna pda --->
    static int[] sort(int[] arr){
        int n = arr.length;
        int zero = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i = 0;i<zero;i++){
            arr[i]=0;
        }
        for(int i =zero;i<n;i++){
            arr[i]=1;
        }
        return arr;
    }

    //second method ka part hai
    static void swap(int arr[],int i,int j) { // swap method
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

    }
    // second method                jisme hme array ko sort krne ke liye array ko ek baar traverse krna pda bas  -->
    static int[] sort2(int[] arr){
        int n=arr.length;
        int left =0, right =n-1;  // left aur right do pointer hai isiliye ise pointer approach bhi khte hai
        while(left<right){
//            if(arr[left]==1&&arr[right]==0){
//                swap(arr,left,right);// swap method ko call kiya hai
//                left++;
//                right--;
//            }
//            if(arr[left]==0){
//                left++;
//            }
//            if(arr[right]==1){
//                right--;
//
//            }
            while(arr[left]==0) left++;
            while(arr[right]==1) right--;
            //swap left right
            if(left<=right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;

    }


    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,1,0,1,1};
        int ans[] = sort2(arr);
        for(int i =0;i< arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}


