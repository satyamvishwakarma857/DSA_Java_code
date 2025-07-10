package Array_4;
import java.util.*;
// axxa que h isme new concept hai frequency array --> is que me hm given array ko traverse krke freq arr bna lete hai
// taki kisi no ko search krne ke liye baar baar trverse na krna pde (best for query pblm)


public class _4queryPblm {
    static int[] makeFreqArray(int arr[]) {
        int[] freq = new int[1000005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;

            }
        return freq;


        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,4,6,2,7};
        int[] freq = makeFreqArray(arr);

        System.out.println("enter no of quries");
        int k = sc.nextInt();
        while(k>0){
            System.out.println("enter no to be searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }else System.out.println("no");
            k--;
        }

    }
}



