package ArrayListConcepts;

import java.util.ArrayList;

public class VirtualCapacity {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<>();

        //default capacity of arraylist is 10 ;
        //actual size is 0 right now

        System.out.println(ar.size());
        //0

        ar.add(100);

        System.out.println(ar.size());
        //1

        ar.add(200);
        ar.add(300);
        ar.add(400);

        System.out.println(ar.size());
        //4



    }
}
