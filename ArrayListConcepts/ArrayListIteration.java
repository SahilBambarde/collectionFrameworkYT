package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args){
        ArrayList<String> studentList =new ArrayList<>();

        studentList.add("tom");
        studentList.add("naven");
        studentList.add("liza");

        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
        //tom
        //naven
        //liza
        System.out.println("-------");

        for(String x: studentList){
            System.out.println(x);
        }


        studentList.forEach(System.out::println);


        //iterator:

        Iterator<String> it=studentList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(numbers);


        ArrayList<String> names = new ArrayList<>(Arrays.asList("java","jsp","js"));
        System.out.println(names);
        System.out.println(names.size());


        //default capacity is 10;

        //generics is any type of data in <>

    }
}
