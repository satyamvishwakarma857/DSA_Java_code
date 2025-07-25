package HashMap;

import java.util.*;

public class _2ques {
    static int freqEle(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int j =0;
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);

            }
            else {
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp.entrySet());
        int freq = 0;
        int ansKey = 0;
        for(Integer key : mp.keySet()){
            if(mp.get(key)>freq){
                freq = mp.get(key);
                ansKey = key;
            }
//
        }
        return ansKey;


    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,3,3,3,3,1,4,4,4,4,4,1};

        int x = freqEle(arr);
        System.out.println("max freq in the array is "+x);
    }
}
