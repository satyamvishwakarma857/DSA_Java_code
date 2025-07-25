package HashMap;

import java.util.HashMap;
import java.util.Map;
// HashMap doesn't preserve insertion order -->>
public class _1basic {

    static void HashMapMethods(){
        //Syntax
           // key    value
        Map<String, Integer> mp = new HashMap<>();

        //Adding elements
        mp.put("akash", 21);
        mp.put("yash", 16);
        mp.put("lav", 17);
        mp.put("rishika", 19);
        mp.put("harry", 18);
        


        //Getting value of a key from the HashMap
        System.out.println(mp.get("akash")); //21
        System.out.println(mp.get("rahul")); //null (if no key is exist then return null )

        //changing value of a key in the HashMap
        mp.put("akash", 22); //update existing akash age from 21 -->> 22
        mp.put("rohit", 30); //will add rohit (if key is not exist already then add a new key)

        //removing a pair from the hashmap
        mp.remove("yash"); // it remove yash key and it's corresponding value
        mp.remove("armaan"); // it return null if we print it ....(bcoz there is no such key exists)

        //checking if a key is in the hashmap
        System.out.println(mp.containsKey("harry")); // true
        System.out.println(mp.containsKey("irfaan")); // false

        //Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("komal",23); // will enter entries
        mp.putIfAbsent("harry" , 50); // will not enter (bcoz harry already exist)
        System.out.println(mp.get("harry")); //18

        //get all keys in the hashmap
        System.out.println(mp.keySet()); // [lav, komal, akash, harry, rishika, rohit]

        //get all values in the hashmap
        System.out.println(mp.values()); // [17, 23, 22, 18, 19, 30]


        //get all entries in the hashmap
        System.out.println(mp.entrySet()); // [lav=17, komal=23, akash=22, harry=18, rishika=19, rohit=30]

        //Traversing all entries of hashmap - multiple methods
        //1st method
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }

        //2nd method
        for(var e : mp.entrySet()){
            System.out.printf("Age is %s is %d\n", e.getKey(), e.getValue());
        }

    }





    public static void main(String[] args) {
        HashMapMethods(); // calling hashmapMathod function

    }
}
