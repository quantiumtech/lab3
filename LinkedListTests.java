import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.*;
import org.junit.*;

public class LinkedListTests {

    public ArrayList<Integer> iterate(Node n) {
        if (n != null) {
           ArrayList<Integer> myList = new ArrayList<>();
            myList.add(n.value);
            while (n.next != null) {
                n = n.next;
                myList.add(n.value);
            }
            return myList;
        }
        ArrayList<Integer> failed = new ArrayList<>();
        failed.add(-1);
        return failed;
    }
    
    @Test
    public void testAppend() {
        LinkedList test = new LinkedList();
        
        test.append(1);
        test.append(2);
        test.append(3);
        test.append(4);

        ArrayList<Integer> myExpected = new ArrayList<>(Arrays.asList(1,2,3,4));
        assertEquals(iterate(test.root), myExpected);
    }
}
