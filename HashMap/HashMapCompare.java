package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
    public static void main(String[] args){
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        HashMap<Integer,String> map2 =new HashMap<>();
        map2.put(3,"C");
        map1.put(1,"A");
        map1.put(2,"B");

        HashMap<Integer,String> map3= new HashMap<>();
        map2.put(3,"C");
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"D");



        // on the basics of key and value format
        //use equals method
        System.out.println(map1.equals(map2));
        //true
        System.out.println(map1.equals(map3));
        //false




        //2 compare hashmaps for the same keys:
        // keySet()
        System.out.println(map1.keySet().equals(map2.keySet()));
        //true
        System.out.println(map1.keySet().equals(map3.keySet()));
        //true




        //3 find out the extra keys
        HashMap<Integer,String> map4 = new HashMap<Integer,String>();
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(4,"D");

        //combine the keys from both the hashmap
        //using HashSet
        HashSet<Integer> combine = new HashSet<>(map1.keySet());
        //add the key set from map4;
        combine.addAll(map4.keySet());
        combine.removeAll(map1.keySet());
        System.out.println(combine);



        //4
        //compare maps by values
        HashMap<Integer,String> map5 = new HashMap<Integer,String>();
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");

        HashMap<Integer,String> map6 =new HashMap<>();
        map6.put(4,"A");
        map6.put(5,"B");
        map6.put(6,"C");

        HashMap<Integer,String> map7= new HashMap<>();
        map7.put(1,"A");
        map7.put(2,"B");
        map7.put(3,"C");
        map7.put(4,"C");


        // duplicates are not allowed
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
        //true
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
        //false




        //duplicates are allowed
        //using HashSet
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
        //true
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));
        //true





    }
}
