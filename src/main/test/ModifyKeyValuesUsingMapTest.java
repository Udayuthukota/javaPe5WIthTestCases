import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyKeyValuesUsingMapTest {

    ModifyKeyValuesUsingMap modifyKeyValuesUsingMap;
    @Before
    public void setUp() throws Exception {
        modifyKeyValuesUsingMap=new ModifyKeyValuesUsingMap();
    }

    @After
    public void tearDown() throws Exception {
        modifyKeyValuesUsingMap=null;
    }

    @Test
    public void testModifykeyValesSucess()
    {
        LinkedHashMap<String,String> expectedValue=new LinkedHashMap<>();
        LinkedHashMap<String,String> actualValue=new LinkedHashMap<>();
        LinkedHashMap<String,String> input=new LinkedHashMap<>();
        input.put("val1","java");
        input.put("val2","c++");
        expectedValue.put("val1"," ");
        expectedValue.put("val2","java");
        actualValue=modifyKeyValuesUsingMap.ModifykeyValues(input);
    assertEquals(expectedValue,actualValue);
    }




}