package Sorting_1;

public class _4que {
    static void shiftZero(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean flag = true;
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]==0&&arr[j+1]!=0){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;
        }




    }





    public static void main(String[] args) {
        int[] arr = {0,5,0,3,42,5,-4,0,0,0,1,1,2};
        shiftZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

            }


    }
}
