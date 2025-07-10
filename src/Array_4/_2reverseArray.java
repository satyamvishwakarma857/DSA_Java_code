package Array_4;
// array ko reverse karna hai.............



public class _2reverseArray {
    //1st method ------->>>>
    static void rev(int[] arr){
    for(int i= arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");

        }
    }


    // 2nd method -------->>>
    static void revers(int arr[]) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length - 1 - i; i++) {
            temp[0] = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp[0];

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    // 3rd method arr me jitne index tk chaho utne index tk reverse kro --->

    static void reverse2(int arr[],int i,int j) {
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,7,0};
        reverse2(arr,0,2);
        // reverse(arr);
         //rev(arr);

    }
}
