import com.stackroute.pe5.BooleanMapForCountingString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class BoolieanMapForCountingStringTest
{

        BooleanMapForCountingString boolieanMapForCountingString;
        @Before
        public void setUp() throws Exception
        {
            boolieanMapForCountingString=new BooleanMapForCountingString();
        }

        @After
        public void tearDown() throws Exception
        {
        boolieanMapForCountingString=null;
        }

            //pass case or sample input 1
        @Test
        public void testBoolieanMapForCountingStringSuccess()
        {
            String[] inputArray={"a", "b", "c", "d", "a", "c", "c"};
            Map<String, Boolean> expectedValue = new HashMap<String, Boolean>();
            Map<String, Boolean> actualValue = new HashMap<String, Boolean>();
            expectedValue.put("a",true);
            expectedValue.put("b",false);
            expectedValue.put("c",true);
            expectedValue.put("d",false);
            actualValue=boolieanMapForCountingString.numberCount(inputArray);
            assertEquals(expectedValue,actualValue);
        }


        //pass case for sample input 2
        @Test
        public void testBoolieanMapForCountingStringSuccessone()
        {
            String[] inputArray={"a", "b", "c", "d", "a"};
            Map<String, Boolean> expectedValue = new HashMap<String, Boolean>();
            Map<String, Boolean> actualValue = new HashMap<String, Boolean>();
            expectedValue.put("a",true);
            expectedValue.put("b",false);
            expectedValue.put("c",false);
            expectedValue.put("d",false);
            actualValue=boolieanMapForCountingString.numberCount(inputArray);
            assertEquals(expectedValue,actualValue);
        }


        //fail case or sample input 1
        @Test
        public void testBoolieanMapForCountingStringFailure()
        {
            String[] inputArray={"a", "b", "c", "d", "a", "c", "c"};
            Map<String, Boolean> expectedValue = new HashMap<String, Boolean>();
            Map<String, Boolean> actualValue = new HashMap<String, Boolean>();
            expectedValue.put("a",false);
            expectedValue.put("b",false);
            expectedValue.put("c",true);
            expectedValue.put("d",false);
            actualValue=boolieanMapForCountingString.numberCount(inputArray);
            assertNotEquals(expectedValue,actualValue);
        }

    //fail case or sample input 2
        @Test
        public void testBoolieanMapForCountingStringFailureTwo()
        {
            String[] inputArray={"a", "b", "c","d"};
            Map<String, Boolean> expectedValue = new HashMap<String, Boolean>();
            Map<String, Boolean> actualValue = new HashMap<String, Boolean>();
            expectedValue.put("a",false);
            expectedValue.put("b",false);
            expectedValue.put("c",true);
            expectedValue.put("d",true);
            actualValue=boolieanMapForCountingString.numberCount(inputArray);
            assertNotEquals(expectedValue,actualValue);
        }

        //pass case or sample input
        @Test
        public void testBoolieanMapForCountingStringForNullInput()
        {
            String[] inputArray={"a", "b", "c", "d", "a", "c", "c"};
            Map<String, Boolean> expectedValue = new HashMap<String, Boolean>();
            Map<String, Boolean> actualValue = new HashMap<String, Boolean>();
            expectedValue=null;
            actualValue=boolieanMapForCountingString.numberCount(null);
            assertEquals(expectedValue,actualValue);
        }



}