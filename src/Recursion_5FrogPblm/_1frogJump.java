package Recursion_5FrogPblm;

public class _1frogJump {
    //let arr[] = {10, 30, 40, 20}
    static int minCost(int arr[],int n, int idx ){
        if(idx==n-1){
            return 0;
        }
        int opt1 = Math.abs(arr[idx] - arr[idx+1]) + minCost(arr,n,idx+1);
        if(idx==n-2) return opt1;
        int opt2 = Math.abs(arr[idx] - arr[idx+2]) + minCost(arr,n,idx+2);

        return Math.min(opt1,opt2);
    }



    public static void main(String[] args) {
        int arr[] = {10,30,40,20};
        System.out.println("min cost "+minCost(arr,arr.length,0));

    }
}
