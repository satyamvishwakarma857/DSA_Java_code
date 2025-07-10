package Array;

public class _2noOfStrictlyGreater {
    static int greater(int [] arr, int x){
        int sum = 0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]>x)
                sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int array[] = {5,4,65,4,543,5,4,55,45,43,};
        int target = 4;
        System.out.println("no of greater element is "+greater(array,target));


    }
}



