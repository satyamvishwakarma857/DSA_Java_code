package Q;

public class _4circularQueueUsingArray {
// isme array ki size ka effecintely use hota h mtlb array jitne size ka h wah ek baar me utne ele store kr skt h any time
    // all methods are written by myself --->>
    public static class CircularQueue{
        int[] arr = new int[5]; // this stack size is 5 ele..
        int n = arr.length;;
        int f = n-1;
        int r = n-1;
        int size = 0;

        //add method -->>
        void add(int x){
            if(size==n){
                System.out.println("queue is full");
                return;
            }
            if(r==0){
                arr[r] = x;
                r = n-1;
            }
            else {

                arr[r] = x;
                r--;

            }
            size++;

        }

        // remove method -->>
        int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            if(f==0){
                int x = arr[f];
                f = n-1;
                size--;
                return x;
            }
            else{
                int x = arr[f];
                f--;
                size--;
                return x;
            }

        }

        // peek method -->>
        int peek(){
            return arr[f];
        }

        // size metod -->>
        int size(){
            return size;


        }

        // display method -->>
        void display(){
            if(size==0){
                System.out.println("queue is empty");
                return;
            }
//            else if(f==n-1 && r==n-1 && size ==n){
//                for(int i=n-1;i>=0;i--){
//                    System.out.print(arr[i]+" ");
//                }
//                System.out.println();
//            }
            else if(f>r) {
                for(int i=f;i>r;i--){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();

            }
            else{
                for(int i=f;i>=0;i--){
                    System.out.print(arr[i]+" ");
                }
                for(int i=n-1;i>r;i--){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();



            }
        }




    }




    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.display();
        cq.add(1);

        cq.add(2);
        cq.add(3);

        cq.add(4);

        cq.add(5);
        cq.display();

        System.out.println(cq.remove());

        cq.display();
        cq.add(6);
        cq.display();



//        cq.display(); //56,51,52,25,5
//        cq.remove();  //56,51,52,25
//        cq.add(9);    //56,51,52,25,9
//        cq.remove();
//        cq.remove();
//        cq.remove();  //56,        ,9
//        cq.add(10);   //56,      10,9
//
//        cq.display();
//        System.out.println(cq.peek());
//        System.out.println(cq.size);


    }
}
