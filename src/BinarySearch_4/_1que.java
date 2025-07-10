package BinarySearch_4;
// is que ko lecture se dekh ke smjho -->
//minimalMaxima find krna hai
public class _1que {
    static boolean isDivisionPossible(int[] a, int m, int mxChocolate){
        int numOfStudent = 1;
        int choc = 0;
        for(int i=0; i<a.length;i++){
            if(a[i] > mxChocolate) return false;
            if(choc + a[i] <= mxChocolate){
                choc += a[i];
            }
            else{
                numOfStudent++;
                choc = a[i];
            }
        }
        if(numOfStudent > m) return false;
        return true;
    }



    static int distributeChocolate(int[] a, int m){
        if(a.length < m) return -1;
        int ans = 0, st = 1 , end = (int)1e9;

        while(st <= end){
            int mid = st + (end-st)/2;
            if(isDivisionPossible(a, m, mid)){
                ans = mid;
                end = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return ans;
    }


    

    public static void main(String[] args) {
        int[] a = {5,3,1,4,2};
        int m = 3 ; // no of children
        System.out.println(distributeChocolate(a,m));


    }
}
