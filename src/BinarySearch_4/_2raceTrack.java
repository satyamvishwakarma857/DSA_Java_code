package BinarySearch_4;

public class _2raceTrack {
/// maximalMinima find krna hai
    static boolean isPossible(int[] arr, int m, int mid){
        int kids = 1;
        int lastKid = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i] - lastKid >= mid){
                kids++;
                lastKid = arr[i];
            }


        }
        if(kids < m) return false;
        return true;

    }

    static int maximalMinima(int[] arr, int m){
        int st =0, end = (int)1e9;
        int ans = 0;

        while(st<=end){
            int mid = st+(end-st)/2;

            if(isPossible(arr, m, mid)){
                ans = mid;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }











    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        int m =3;
        System.out.println(maximalMinima(arr,m));
    }
}
