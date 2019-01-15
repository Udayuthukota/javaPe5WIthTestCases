package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedHashMap;
import static org.junit.Assert.*;
public class ModifyKeyValuesUsingMapTest
{
        ModifyKeyValuesUsingMap modifyKeyValuesUsingMap;
        @Before
        public void setUp() throws Exception
        {
            modifyKeyValuesUsingMap=new ModifyKeyValuesUsingMap();
        }
        @After
        public void tearDown() throws Exception
        {
            modifyKeyValuesUsingMap=null;
        }
        //pass case for given input1
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

        //pass care for given input 2
        @Test
        public void testModifykeyValesSucessOne()
        {
            LinkedHashMap<String,String> expectedValue=new LinkedHashMap<>();
            LinkedHashMap<String,String> actualValue=new LinkedHashMap<>();
            LinkedHashMap<String,String> input=new LinkedHashMap<>();
            input.put("val1","mars");
            input.put("val2","saturn");
            expectedValue.put("val1"," ");
            expectedValue.put("val2","mars");
            actualValue=modifyKeyValuesUsingMap.ModifykeyValues(input);
            assertEquals(expectedValue,actualValue);
        }
        //Failure case for the given input 1
        @Test
        public void testModifykeyValesFailure()
        {
            LinkedHashMap<String,String> expectedValue=new LinkedHashMap<>();
            LinkedHashMap<String,String> actualValue=new LinkedHashMap<>();
            LinkedHashMap<String,String> input=new LinkedHashMap<>();
            input.put("val1","java");
            input.put("val2","c++");
            expectedValue.put("val1","c++");
            expectedValue.put("val2","java");
            actualValue=modifyKeyValuesUsingMap.ModifykeyValues(input);
            assertNotEquals(expectedValue,actualValue);
        }
        //testing for null input
        @Test
        public void testModifykeyValesNUllInput()
        {
            LinkedHashMap<String,String> expectedValue=new LinkedHashMap<>();
            LinkedHashMap<String,String> actualValue=new LinkedHashMap<>();
            expectedValue=null;
            actualValue=modifyKeyValuesUsingMap.ModifykeyValues(null);
            assertEquals(expectedValue,actualValue);
        }

}