package Recursion_3recursionOnString;

public class _1removeOccurance {
    // is que me ek string se ek char ke occurance ko remove krke string wapis krni h -->


    //1st method jisme empty string main method ke andr declare kiya gya hai --> is wajah se string ko is method ke andr declare krne ki jarort nhi h
    static String makeRemove(String s,String empty,int idx,char target){
        // base case
        if(idx==s.length())
            return empty+"";
        //self work
        if(s.charAt(idx)!=target){
            empty+=s.charAt(idx);
        }
        // recursive work-->
        return makeRemove(s,empty,idx+1,target);

    }
    // 2nd method
    static String makeRemove2(String s,int idx,char target){
        String empty = "";
        // base case
        if(idx==s.length())
            return empty+"";


        //self work
         // recursive method ke andr hi string variable deaclare kiya hai ..
        if(s.charAt(idx)!=target){

            empty+=s.charAt(idx);
        }

        // recursive work-->
        return empty+makeRemove2(s,idx+1,target);

    }

    public static void main(String[] args) {
        String s = "abacd";
        char target = 'a';
        String empty = "";
        System.out.println(makeRemove(s,empty,0,target)); // 1st method
        System.out.println(makeRemove2(s,0,target)); // 2nd mathod


    }
}
