/*Write a Java program to update specific array element by given
element and empty the  array listInput: [Apple, Grape, Melon, Berry]Output: [Kiwi, Grape, Mango, Berry]
 */
//Implementation begins here.
package com.stackroute.pe5;
import java.util.ArrayList;
public class UpdateList
{
    public ArrayList<String> upDateList(String[] input,String[] subString,int[]index)
    {
        if (input==null)
        {
            return null;
        }
        else
            {
                  ArrayList<String> list = new ArrayList<String>();
                  int indexNumber = 0;
                  int indexValue = index[indexNumber];
                  int NumberArrayLenght = index.length;
                 for (int i = 0; i < input.length; i++)   //here we replace strings  vales at the given index
                 {
                     if (i == indexValue)
                     {
                         list.add(subString[indexNumber]);
                        if (indexNumber < NumberArrayLenght - 1)
                        {
                        indexNumber++;
                        }
                            indexValue = index[indexNumber];
                     }
                     else
                         {
                           list.add(input[i]);
                         }

                 }
               return list;
            }

    }

}