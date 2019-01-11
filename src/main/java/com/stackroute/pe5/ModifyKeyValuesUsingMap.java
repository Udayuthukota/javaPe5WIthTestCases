/* Write a method that accepts a Map object having two key-value pairs
with the keys val1 and val2.Modify and return the given map as follows:a.
If the key `val1` has a value, set the key `val2` to have that value, andb.
Set the key `val1` to have the value `"  "` (empty string ).
Example 1:The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":"java"}
Example 2:The map {"val1": "mars", "val2": "saturn"}  should return {"val1": " ", "val2":"mars"
 */
//implementation begins here

package com.stackroute.pe5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ModifyKeyValuesUsingMap
{
    public LinkedHashMap<String, String> ModifykeyValues(LinkedHashMap<String, String> inputmap)
    {
        if (inputmap == null)
            {
               return null;
            }
            else
                {
                    Iterator traverseInput = inputmap.entrySet().iterator(); //entry set is used to convert hashmap to store in list
                    Map.Entry mapElement = (Map.Entry) traverseInput.next();
                    String key1 = (String) mapElement.getKey();
                    String value1 = (String) mapElement.getValue();
                    mapElement = (Map.Entry) traverseInput.next();
                    String key2 = (String) mapElement.getKey();
                    String value2 = (String) mapElement.getValue();
                    if (value1!= null)
                    {
                        inputmap.put(key1, " ");
                        inputmap.put(key2, value1);
                    }
                }
            return inputmap;
    }
}

