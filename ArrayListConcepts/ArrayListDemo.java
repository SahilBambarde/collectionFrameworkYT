package ArrayListConcepts;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        //default class


        int i[] = new int[4];

        i[0]=100;
//        i[4]=100; //java.lang.ArrayIndexOutOfBoundsException
//        i[-1]=100; //java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(i[3]);


        //dynamic array
        ArrayList<Object> ar = new ArrayList<>();
        ar.add(100); //0
        ar.add(200); //1
        ar.add("tesing");
        ar.add(12.33);
        ar.add(true);

        System.out.println(ar);

        System.out.println(ar.get(2));

//        System.out.println(ar.get(6));
        //java.lang.IndexOutOfBoundsException

//        System.out.println(ar.get(-1));
        //java.lang.IndexOutOfBoundsException

        System.out.println(ar.size());
        //5

        ar.add(400);
        ar.add(500);

        System.out.println(ar.size());
        //7



    }
}
