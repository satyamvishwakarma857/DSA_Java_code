package St;

import java.util.Stack;
// next greater ho ya next smaller usme hm array ko peeche se aage ki taraf traverse krenge ....
// previous wale me array ko aage se peeche ki or traverse krte hai
public class _6nextGreaterElement {
    static int[] nxtGreatEle(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else
                ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] a = nxtGreatEle(arr);
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
