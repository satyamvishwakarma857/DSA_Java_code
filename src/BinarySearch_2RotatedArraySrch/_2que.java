package BinarySearch_2RotatedArraySrch;
// que --> given a rotated array and a target --> return the index of target element
// it is a good que jisme rotated arrray ki kuchh property ka use kiya gya hai
public class _2que {
    static int getIndex(int[] arr, int target){
        int n = arr.length;
        int st =0, end =n-1;

        while(st<=end){
            int mid = st+((end-st)/2);

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]<arr[end]){ // array is sorted from mid to end of array --> property of rotated sorted array
                if(target>arr[mid] && target<=arr[end]){ // mean target is lie bw this sorted array
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }

            }
            else{// array is sorted from st to mid -- (agar if condition nahi chla to because it is mandatory that one part of array is sorted )
                if(target>=arr[st] && target<arr[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }

            }

        }
        return -1;



        
    }




    public static void main(String[] args) {
        int[] arr = {3,5,1};
        System.out.println("index of target is : "+getIndex(arr,1));


    }

}
