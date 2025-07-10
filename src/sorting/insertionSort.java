package sorting;

public class insertionSort {
    public static void printarray(int arr[]){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {3,4,65,34,5,99,43};
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printarray(arr);
    }
}
