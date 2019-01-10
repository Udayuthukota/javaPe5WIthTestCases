import java.util.ArrayList;

public class UpdateList {

    public ArrayList<String> upDateList(String[] input,String[] override,int[]index)
    {

        if (input==null)
        {
            return null;
        }else {
            ArrayList<String> list = new ArrayList<String>();
            int indexNumber = 0;
            int indexValue = index[indexNumber];
            int NumberArrayLenght = index.length;
            // System.out.println(k);
            for (int i = 0; i < input.length; i++) {
                if (i == indexValue) {
                    list.add(override[indexNumber]);
                    if (indexNumber < NumberArrayLenght - 1) {
                        indexNumber++;
                    }
                    indexValue = index[indexNumber];
                } else {
                    list.add(input[i]);
                }

            }
            System.out.println(list);
            return list;
        }

    }
    public  static void main(String[] args)
    {
        String[] input={"Apple", "Grape", "Melon", "Berry"};
        String[] overRide={"kiwi","Mango"};
        int[] index={0,2};
        UpdateList updateList=new UpdateList();
        updateList.upDateList(input,overRide,index);
    }
}
