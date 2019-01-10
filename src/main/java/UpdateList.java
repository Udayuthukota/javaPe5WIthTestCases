import java.util.ArrayList;

public class UpdateList {

    public void upDateList(String[] input,String[] override,int[]index)
    {
        ArrayList<String> list=new ArrayList<String>();
/*
        for(int j=0;j<input.length;j++)
        {
         list.add(input[j]);
        }
        */


        int l=0;
        int k=index[l];
        int j=index.length;
       // System.out.println(k);

        for(int i=0;i<input.length;i++)
        {
         if(i==k)
         {
             list.add(override[l]);
             if(l<j-1) {
             l++;  }
             k=index[l];
         }
         else
            {
                list.add(input[i]);
            }

        }
        System.out.println(list);

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
