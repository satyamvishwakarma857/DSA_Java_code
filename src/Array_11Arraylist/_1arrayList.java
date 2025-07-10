package Array_11Arraylist;
import java.util.ArrayList;


public class _1arrayList {
    public static void main(String[] args) {

        // declaration of arraylist
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<String> l2 = new ArrayList();
        l2.add("shhiu");

        // add new element -->
        l1.add(5);//{5}
        l1.add(4);//{5,4}
        l1.add(5);//{5,4,5}
        l1.add(9);//{5,4,5,9} values arraylisy me uppend hoti jayengi
        l1.add(1);

        //kisi index pr value add krne ke liye
        l1.add(2,8); // index 2 pr value 8 add ho jayegi ..
//
//        // get an element at index i -->
       // System.out.println(l2.get(0));
//
//        // size of arraylist -->
        //System.out.println(l1.size());
//
//
//        // modify element at index i -->
//        l1.set(2,3);
//
//
//        // removing element at index i -->
//        l1.remove(2);
//
//        // removing an element e-->
//        l1.remove(Integer.valueOf(9));
//
//
//        //checking if an elemenet exist -->
//        boolean ans = l1.contains(2);
//        System.out.println(ans);


        System.out.println(l1);


    }


}

// 
