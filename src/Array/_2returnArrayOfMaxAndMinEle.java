package Array;
import java.util.*;

import java.util.Arrays;

public class _2returnArrayOfMaxAndMinEle {
    static void maxAndMin(int [] arr){
        Arrays.sort(arr);
        System.out.println("smallest "+arr[0]);
        System.out.println("largest "+arr[arr.length-1]);
        
    }

    public static void main(String[] args) {
        int array[] ={ 3,5,64,2,4,65,22};
         maxAndMin(array);

    }
}
