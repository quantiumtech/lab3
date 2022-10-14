import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.*;
import org.junit.*;

public class ListTests {
  
    //simple checker that returns true if the string has 5 or less characters.
    class checker implements StringChecker { 
        public boolean checkString(String s) {
           if (s.length() < 6) {
             return true;
           }
           return false;
         }
       }

    @Test
    public void filterTest() {
        checker sc = new checker();
        List<String> test = new ArrayList<>(Arrays.asList("apple", "banana", "fruit", "veggies", "peas", "amalgamation"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("apple", "fruit", "peas"));
        List<String> filtered = ListExamples.filter(test, sc);
        assertEquals(expectedOutput, filtered);
        for (String i : filtered) {
                System.out.print(i + " ");
        }
    }

    @Test
    public void filterTestEmpty(){
        checker sc = new checker();
        List<String> test = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ListExamples.filter(test, sc));
    }

}
