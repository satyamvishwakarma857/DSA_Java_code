package Array;

public class FirstClassOfArray {
    public static void main(String[] args) {
        int[] marks= new int[3]; // or int marks[]= new int[3]; or int[] marks = {76,87,78} agr phle se pta ho element ke bare me
        marks[0] = 76;
        marks[1] = 87;
        marks[2] = 78;
//        System.out.println(marks[1]);
//        System.out.println(marks[0]);
//        System.out.println(marks[2]);
        for(int i = 0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
