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

        Set<String> str=new HashSet<String>();
        str.add("Harry");
        str.add("Olive");
        str.add("Alice");
        str.add("Bluto");
        str.add("Eugene");

        SortTheNames obj= new SortTheNames();

        System.out.println(str);
        System.out.println(obj.sortArray((HashSet<String>) str));
    }


}

