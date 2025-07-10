package Array;

public class maxAndMinNoInArray {
    public static void main(String[] args) {
        int[] numbers = {1,34,65,34,76,44};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<6;i++){
            if(numbers[i]<min)
                min=numbers[i];
            if(numbers[i]>max)
                max=numbers[i];
        }
        System.out.println("max is "+max);
        System.out.println("min is"+min);


    }
}
