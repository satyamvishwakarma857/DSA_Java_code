package Array;
import java.util.*;

public class _2OccuranceOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {5,6,4,7,8,5,5,4,};
        int ans = 0;
        System.out.println("enter target");
        int target = sc.nextInt();


        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                ans+=1;
            }
        }
        System.out.println("occurance of "+target+" is "+ans);
    }
}
