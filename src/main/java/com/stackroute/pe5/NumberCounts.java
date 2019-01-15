/*Write a program to find the number of counts in the following  String .
Store the output inMap< String ,Integer> as key value pair.
Input :   String  str = “one one -one___two,,three,one @three*one?two”;
  Output : {"one":5 , "two":2, "three" :2}
*/
//Implementation begings here
package com.stackroute.pe5;
import java.util.*;
public class NumberCounts
{
    public Map<String, Integer> numberCount(String input)
    {
        if (input == null)
        {
            return null;
        }
        else
            {
                String result = input.replaceAll("[^\\w\\s]+", " "); //removing special charactersusings regular expresstion
                String result1 = result.replaceAll("[_ ]+", " "); //using regular expestion remove underscore
                String arrayInput[] = result1.split(" ");
                Map<String, Integer> words = new HashMap<>();
               for (String arrayElement : arrayInput)
                 {
                    if (words.containsKey(arrayElement))
                    {
                       words.put(arrayElement, 1 + words.get(arrayElement));
                    }
                    else
                        {
                          words.put(arrayElement, 1);
                        }
                  }
              return words;
            }
    }
}