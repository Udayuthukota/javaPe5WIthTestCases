import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ModifyKeyValuesUsingMap {
    public LinkedHashMap<String,String >ModifykeyValues(LinkedHashMap<String,String>inputmap)
    {
        Iterator itr = inputmap.entrySet().iterator();
        Map.Entry m1 = (Map.Entry)itr.next();
        String key1=(String)m1.getKey();
        String value1=(String)m1.getValue();

        m1 = (Map.Entry)itr.next();

        String key2=(String)m1.getKey();
        String value2=(String)m1.getValue();

        if(value1!=null) {
            inputmap.put(key1," ");
            inputmap.put(key2,value1);
        }
        return inputmap;

    }
}

