package HashMap;
import java.util.*;

public class _3implementation {
    public static class HashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private int noOfElements = 0;


        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        // reHash Method -->
        void reHash(){
            noOfElements = 0;
            LinkedList<Node>[] oldBucket = bucket;
            initBucket(oldBucket.length*2);
            for(var bucket : oldBucket){
                for(var node : bucket){
                    put(node.key, node.value);
                }
            }


        }

        // method to initialize bucket array size and enter empty linked list on every idx -->>
        private void initBucket(int N){
            bucket = new LinkedList[N];
            for(int i=0;i< bucket.length;i++){
                bucket[i] = new LinkedList<Node>();
            }

        }

        //hashfun method-->>
        private int hashFun(K key){
            int idx = key.hashCode();
            return (Math.abs(idx))% bucket.length;

        }

        // searchElement method-->>
        int searchElement(LinkedList<Node> ll,K temp){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i) .key==temp) return i;

            }
            return -1;

        }

        //initialization of array jiska type linkedlist hoga
        LinkedList<Node>[] bucket; // array name is bucket

        //constructor -->>
        HashMap(){
            initBucket(DEFAULT_CAPACITY);


        }

        // size method -->>
        int size(){
            return noOfElements;
        }

        //put method
         void put(K key, V value){
            int bi = hashFun(key);
            LinkedList<Node> currBucket = bucket[bi];
            int idx = searchElement(currBucket ,key);
            if(idx==-1){
                Node node = new Node(key,value);
                currBucket.add(node);
                noOfElements++;

            }
            else{
                currBucket.get(idx).value = value;
            }
            
            // rehashing --> 
             if(noOfElements >= (bucket.length*DEFAULT_LOAD_FACTOR)){
                 reHash();
             }


        }

        //get method
        V get(K key){
            int bi = hashFun(key);
            LinkedList<Node> currBucket = bucket[bi];
            int idx = searchElement(currBucket ,key);
            if(idx != -1){
                return currBucket.get(idx).value;
            }
            return null;

        }

        //remove method -->>
        V remove(K key){
            int bi = hashFun(key);
            LinkedList<Node> currBucket = bucket[bi];
            int idx = searchElement(currBucket ,key);
            if(idx != -1){
                V temp = currBucket.get(idx).value;
                currBucket.remove(idx);
                noOfElements--;
                return temp;

            }
            return null;



        }


    }



    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        mp.put("a",1);
        mp.put("b",2);
        System.out.println(mp.bucket.length);
        mp.put("c",3);
//        System.out.println(mp.size()); //3
          System.out.println(mp.bucket.length);
//        System.out.println(mp.get("a")); //1
//        System.out.println(mp.get("b"));//2
//        System.out.println(mp.get("c"));//3
//        System.out.println(mp.remove("a"));//1
//        System.out.println(mp.size());//2
//        System.out.println(mp.get("v"));//null




    }
}
