package St;
// next greater ho ya next smaller usme hm array ko peeche se aage ki taraf traverse krenge ....
// previous wale me array ko aage se peeche ki or traverse krte hai
import java.util.Stack;

public class _7nxtSmallerEle {
    static int[] nxtSmallerEle(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        Stack<Integer> st = new Stack<Integer>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);

        }
        return ans;


    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,5,5,1,8};
                   //3,3,2,2,5, 2,6,2,-1
        int[] a = nxtSmallerEle(arr);
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");


        }

    }
}
/*
class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> gt = new Stack<>();


    public MinStack() {

    }

    public void push(int val) {
        st.push(val);
        if(gt.size()==0) gt.push(val);
        else if(val<=gt.peek() ) gt.push(val);
     }

    public void pop() {
        if(st.peek()==gt.peek()){
             gt.pop();
        }
        st.pop();

    }

    public int top() {
        return st.peek();

    }

    public int getMin() {
        return gt.peek();

    }
}

/**

 */
 
