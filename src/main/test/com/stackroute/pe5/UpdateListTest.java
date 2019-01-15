package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class UpdateListTest
{
        UpdateList updateList;
        @Before
        public void setUp() throws Exception
        {
            updateList=new UpdateList();
        }
        @After
        public void tearDown() throws Exception
        {
            updateList=null;
        }
        //pass case for input one
        @Test
        public void testUpdateListSuccess()
        {
            ArrayList<String> expectedValue=new ArrayList<>();
            ArrayList<String> actualValue=new ArrayList<>();
            String[] inputArray={"Apple", "Grape", "Melon", "Berry"};
            String[] overRideArray={"kiwi","Mango"};
            expectedValue.add("kiwi");
            expectedValue.add("Grape");
            expectedValue.add("Mango");
            expectedValue.add("Berry");
            int[] index={0,2};
            actualValue=updateList.upDateList(inputArray,overRideArray,index);
            assertEquals(expectedValue,actualValue);

        }
        //Pass case for input two
        @Test
        public void testUpdateLisMangotSuccessone()
        {
            ArrayList<String> expectedValue=new ArrayList<>();
            ArrayList<String> actualValue=new ArrayList<>();
            String[] inputArray={"Apple", "Grape", "Melon", "Berry"};
            String[] overRideArray={"kiwi","Mango"};
            expectedValue.add("Apple");
            expectedValue.add("kiwi");
            expectedValue.add("Melon");
            expectedValue.add("Mango");
            int[] index={1,3};
            actualValue=updateList.upDateList(inputArray,overRideArray,index);
            assertEquals(expectedValue,actualValue);

        }
        //failure case
        @Test
        public void testUpdateListFailure()
        {
            ArrayList<String> expectedValue=new ArrayList<>();
            ArrayList<String> actualValue=new ArrayList<>();
            String[] inputArray={"Apple", "Grape", "Melon", "Berry"};
            expectedValue.add("Apple");
            expectedValue.add("Grape");
            expectedValue.add("Mango");
            expectedValue.add("Berry");
            String[] overRideArray={"kiwi","Mango"};
            int[] index={0,2};
            actualValue=updateList.upDateList(inputArray,overRideArray,index);
            assertNotEquals(expectedValue,actualValue);

        }
        //Checking for null input
        @Test
        public void testUpdateListNullInput()
        {
            ArrayList<String> expectedValue=new ArrayList<>();
            ArrayList<String> actualValue=new ArrayList<>();
            String[] inputArray={"Apple", "Grape", "Melon", "Berry"};
            String[] overRideArray={"kiwi","Mango"};
            int[] index={0,2};
            expectedValue=null;
            actualValue=updateList.upDateList(null,overRideArray,index);
            assertEquals(expectedValue,actualValue);

        }
    }