package Array_4;
/// important h ye method isko dry run krke dekho tabhi samjh me aayega...
public class _3rotateArray2part {

    static void reverse(int arr[],int i,int j) {
        int[] temp = new int[arr.length];
        while (i < j) {
            temp[0] = arr[i];
            arr[i] = arr[j];
            arr[j] = temp[0];
            i++;
            j--;

        }
    }
    static void rotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");

        }

    }




    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        rotate(arr,40);



    }
}
