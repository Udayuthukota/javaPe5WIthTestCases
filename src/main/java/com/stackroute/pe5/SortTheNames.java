/*Write a program to implement set interface which sorts the given
randomly ordered names inascending order. Convert the sorted set in
to an  array listInput : Harry  Olive  Alice  Bluto  Eugene
Output :Sorted Set :  Alice  Bluto  Eugene  Harry  OliveArray list
 from Set :  Alice Bluto Eugene Harry Olive
*/
package com.stackroute.pe5;
import java.util.*;

public class SortTheNames
{
    public ArrayList<String> sortArray(HashSet<String> inputStr)
    {
        Set<String> treeSet = new TreeSet<String>(inputStr);
        Iterator<String> travesrseTreeset=treeSet.iterator();
        ArrayList<String>list1=new ArrayList<>();
        while(travesrseTreeset.hasNext())
        {
            list1.add(travesrseTreeset.next());
        }
        return list1;
    }
}

