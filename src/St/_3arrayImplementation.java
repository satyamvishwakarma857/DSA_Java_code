package St;

public class _3arrayImplementation {

    public static class Stack{
        int[] arr = new int[50]; // isme stack ka size fix ho jata hai --> kyunki array ka ek fix size hota hai
        int i =0;

        //push method
        void push(int val){
            if(isFull()){ // calling isFull method
                System.out.println("stack is full");
                return;
            }
            arr[i] = val;
            i++;
        }

        //pop method -->>
        int pop(){
            int x= arr[i-1];
            arr[i-1] = 0;
            i--;
            return x;
        }

        //peek method -->>
        int peek(){
            return arr[i-1];
        }


        // size method -->>
        int size(){
            return i;
        }


        // display method -->>
        void display(){
            for(int j = 0;j<i;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

        // isFull method -->>
        boolean isFull(){
            if(i== arr.length) return true;
            return false;
        }






    }
    public static void main(String[] args) {
        Stack sb = new Stack();
        sb.push(5);
        sb.push(7);
        sb.push(9);
        sb.push(2);
        sb.push(1);
        sb.push(12);
        sb.display();


        sb.pop();
        sb.display();
        sb.push(78);


        sb.display();

        System.out.println(sb.size());
        System.out.println(sb.peek());
       // System.out.println(sb.pop());
        sb.display();

        //System.out.println(sb.isFull());





    }
}
