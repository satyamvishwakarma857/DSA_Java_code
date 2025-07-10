package Array_4;

public class _3RotateArray {
    static void rotate(int arr[],int k){
        int n = arr.length;
        k = k%n;
        for(int i = n-k;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        for(int i=0;i<n-k;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;          // k=3 isliye ans [5,6,7,1,2,3,4] hona chahiye
        rotate(arr,k);
    }


}
/*
1234567 --> k==3  ...  5 6 7    1 2 3 4
0123456                4 5 6    0 1 2 3






*/