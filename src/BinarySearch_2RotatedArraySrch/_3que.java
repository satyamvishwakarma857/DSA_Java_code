package BinarySearch_2RotatedArraySrch;

// Que --> return the index of target from a rotated sorted array in which duplicate elements are present ......
// ex --> {1,1,2,2,2,3,4,4,1,1} -- > it has been rotated twice

public class _3que {
    static boolean getIdx(int[] arr, int target){
        int st = 0, end = arr.length-1;
        while (st<=end){
            int mid = st + ((end-st)/2);
            if(arr[mid]==target){
                return true;
            }
            if(arr[st]==arr[mid] && arr[mid]==arr[end]){
                st++;
                end--;
            }
            else if(arr[mid]<=arr[end]){ // array is sorted from mid to end of array --> property of rotated sorted array
                // overall arr[left] bada nhi hona chahiye arr[right] se bs agr ye condition true --> left to right sorted ..
                if(target>arr[mid] && target<=arr[end]){ // mean target is lie bw this sorted array
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }

            }
            else {// array is sorted from st to mid -- (agar if condition nahi chla to )
                if(target>=arr[st] && target<arr[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }

            }
        }
        return false;
    }





    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,4,1,1};
        int target = 4;
        System.out.println(getIdx(arr, target));

    }
}
