/*Write a program to find the number of counts in the following  String .
Store the output inMap< String ,Integer> as key value pair.
Input :   String  str = “one one -one___two,,three,one @three*one?two”;
  Output : {"one":5 , "two":2, "three" :2}
*/
import com.stackroute.pe5.NumberCounts;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
public class checkNumberCounts
{
          NumberCounts numberCounts;
           @org.junit.Before
          public void setUp() throws Exception
           {
           numberCounts=new NumberCounts();
           }

           @org.junit.After
           public void tearDown() throws Exception
           {
            numberCounts=new NumberCounts();
           }
         String inputString="one one -one___two,,three,one @three*one?two";
           //Pass case
           @Test
           public void testNumberCountSuccess()
          {
              Map<String, Integer> actualValue;
              Map<String,Integer> expectedValue=new HashMap<String, Integer>();
              expectedValue.put("one",5);
              expectedValue.put("two",2);
              expectedValue.put("three",2);
              actualValue=numberCounts.numberCount(inputString);
              assertEquals(expectedValue,actualValue);
          }

            //Failure case
            @Test
            public void testNumberCountFailure()
            {
                Map<String, Integer> actualValue;
                Map<String,Integer> expectedValue=new HashMap<String, Integer>();
                expectedValue.put("one",1);
                expectedValue.put("two",2);
                expectedValue.put("three",2);
                actualValue=numberCounts.numberCount(inputString);
                assertNotEquals(expectedValue,actualValue);
            }

            //Cheking for null input
            @Test
            public void testNumberCountForNullInput()
            {
                Map<String, Integer> actualValue;
                Map<String,Integer> expectedValue=new HashMap<String, Integer>();
                expectedValue=null;
                actualValue=numberCounts.numberCount(null);
                assertEquals(expectedValue,actualValue);
            }

}