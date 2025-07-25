package Q;

public class _2arrayImplmentation {
    public static class Queue{
        int[] arr = new int[100]; // this stack size is 100 ele..
        int n = arr.length;;
        int f = n-1;
        int r = n-1;
        int size = 0;


        //add method -->>
        void add(int x){
            arr[r] = x;
            r--;
            size++;

        }

        // remove method -->>
        int remove(){
            int x = arr[f];
            f--;
            size--;
            return x;

        }

        // peek method -->>
        int peek(){
            return arr[f];
        }

        int size(){
            return size;


        }

        // display method -->>
        void display(){
            for(int i=f;i>r;i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }




    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(25);
        q.add(52);
        q.add(51);
        q.add(56);
        q.display();
        q.remove();
        q.display();;
        System.out.println(q.peek());
        System.out.println(q.size);




    }
}
