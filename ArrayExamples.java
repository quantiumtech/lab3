

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length / 2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length-i-1] = temp;
    }
  }

//   static int[] reversed(int[] arr) { // fails because we are only initializing an array of length 4 without setting the values. Returns {0, 0, ...}
//   int[] newArray = new int[arr.length];
//   for(int i = 0; i < arr.length; i += 1) {
//     arr[i] = newArray[arr.length - i - 1];
//   }
//   return arr;
// }

// Fixed implementation. We instead fill the newArray with arr's elements, then return the newArray.
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }



  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    int index = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == lowest) { index = i;
        break; }
        else { sum += arr[i];}
    }

    for (int j = index + 1; j < arr.length; j++) {
      sum += arr[j];
    }
    
    return sum / (arr.length - 1);
  }


}

