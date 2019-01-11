package com.stackroute.pe5;
import java.util.*;

public class SortTheNames {
    public ArrayList<String> sortArray(HashSet<String> inputStr)
    {
        Set<String> treeSet = new TreeSet<String>(inputStr);
        Iterator<String> iter=treeSet.iterator();
        ArrayList<String>list1=new ArrayList<>();
        while(iter.hasNext())
        {
            list1.add(iter.next());
        }

        return list1;

    }

    public static void main(String[] args){

        Set<String> input=new HashSet<String>();
        input.add("Harry");
        input.add("Olive");
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");

        SortTheNames obj= new SortTheNames();

        System.out.println(input);
        System.out.println(obj.sortArray((HashSet<String>) input));
    }


}

