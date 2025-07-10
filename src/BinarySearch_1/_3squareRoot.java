package BinarySearch_1;

public class _3squareRoot {
    static int sqaureRoot(int x){
        int st =0, end =x, mid;
        int ans = 0;
        while(st<=end){
            mid = st+((end-st)/2);
            int value = mid*mid;
            if(value==x){
                return mid;
            }
            else if(value>x){
                end = mid-1;
            }
            else{
                ans = mid;
                st = mid+1;

            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println("sqaure root of number is : "+sqaureRoot(25));

    }
}
