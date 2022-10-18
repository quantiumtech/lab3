import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
// 	@Test 
// 	public void testReverseInPlace() {
//     int[] input1 = { 3 };
//     ArrayExamples.reverseInPlace(input1);
//     assertArrayEquals(new int[]{ 3 }, input1);
// 	}

//   @Test
// public void testReverseInPlace2() {
//   int[] input = {3, 6, 9, 12};
//   int[] expected = {12, 9, 6, 3};
//   ArrayExamples.reverseInPlace(input);
//   assertArrayEquals(expected, input);
// }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


@Test
public void testReversed2() { // fails with given implementation
  int[] input = { 3, 6, 9 ,12};
  int[] expected = {12, 9, 6, 3};
 
  assertArrayEquals(expected, ArrayExamples.reversed(input));
}
}


// @Test
// public void testAverageWithoutLowest() {
// double[] input = {3.0, 3.0, 7.0};
// double expected = 5.0;
// double output = ArrayExamples.averageWithoutLowest(input);
// assertEquals(expected, output, .0001);
// }
// }