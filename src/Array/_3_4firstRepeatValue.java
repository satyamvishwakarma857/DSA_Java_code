package Array;
//return the first value that is repeating in this array....
public class _3_4firstRepeatValue {
    static void FirstValue(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("first repeating no is "+arr[i]);
                    return;
                }

            }


        }
        System.out.println(-1);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,2,8,4,9};
        FirstValue(arr);

    }
}

