/*Write a program where an array of strings is input and output is a Map< String ,boolean>
whereeach different  string  is a key and its value is true if that  string  appears 2 or more times in the
arrayInput : String  arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */
//Implementation begings here

package com.stackroute.pe5;
import java.util.Map;
import java.util.*;
public class BooleanMapForCountingString
{

    public Map<String,Boolean> numberCount(String[] inputString)
    {
        if (inputString == null)    //checking if in null or not
           {
            return null;
           }
           else
              {
                  Map<String, Boolean> words = new HashMap<>();
                  for (String str : inputString) {
                if (words.containsKey(str)) //using word(map) as a container and checking if a letter is already existing
                {
                    words.put(str, true);
                } else {
                    words.put(str, false);
                }
              }
            return words;
        }
    }

}