package sorting;

public class selectionSort {
    public static void printarray(int arr[]){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //    System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,6,34,56,4,76};
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[smallest]<arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        printarray(arr);
    }
}
