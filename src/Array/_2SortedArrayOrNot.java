package Array;

public class _2SortedArrayOrNot {
    static void sorted(int[] array){
        int count = 0;
        for (int i=0;i< array.length-1;i++){
            if(array[i]>array[i+1]){
                count =1;
                break;

            }

        }
        if(count==0){
            System.out.println("array is sorted");

        }
        else
            System.out.println("array is not sorted");
    }

    public static void main(String[] args) {
        int[] arr = {56,50,40,8,7};
        sorted(arr);

    }

}

