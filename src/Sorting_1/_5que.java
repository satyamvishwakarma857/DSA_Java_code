package Sorting_1;

public class _5que {
    static void sortingInLexicographic(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i;j<arr.length;j++){
                if(arr[minIndex].compareTo(arr[j])>0){ // s1.compareTo(s2) if -->s1<s2 -> neg no and s1>s2-> positive no
                    minIndex=j;
                }


            }

            //swap
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;


        }

    }

    public static void main(String[] args) {
        String arr[] = {"apple","app", "lion", "elephant", "cow", "zebra"};
        sortingInLexicographic(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}