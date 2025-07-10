package St;

import java.util.ArrayList;
import java.util.Stack;

public class _5removeConsecutiveSubsequences {
    static int[] remove(int[] arr){
        int n = arr.length;
//        ArrayList<Integer> ll = new ArrayList<Integer>();
//        if(arr[0] != arr[1]) ll.add(arr[0]);
//        for(int i=1;i<arr.length-1;i++){
//            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
//                ll.add(arr[i]);
//            }
//        }
//        if(arr[n-1] != arr[n-2]){
//            ll.add(arr[n-1]);
//        }
        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        int x = -1;
        for(int i=0;i<n;i++){
            if(st.peek() != arr[i] && x != arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){

                 x = st.pop();

            }

        }
        int[] a = new int[st.size()-1];
        for(int i=a.length-1;i>=0;i--){
            a[i] = st.pop();

        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,8,3,10,10,4,4,4,5,7,7,2};
        int [] ans  = remove(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
