import java.util.ArrayList;
import java.util.List;

interface StringChecker { 
  public boolean checkString(String s);
}


class ListExamples {


  // static List<String> filter(List<String> list, StringChecker sc) {
  //   List<String> result = new ArrayList<>();
  //   for(String s: list) {
  //     if(sc.checkString(s)) {
  //       result.add(0, s); // always adds at 0 rather than at a changing index, leading to a prepending behavior.
  //     }
  //   }
  //   return result;
  // }

  static List<String> filter(List<String> list, StringChecker sc) {
    int index = 0;
    List<String> result = new ArrayList<>();
    for(String s: list) {
      if(sc.checkString(s)) {
        result.add(index, s); // fixed implentation. having an incrementing index will lead to the expected output of a filtered ArrayList in the same order.
        index++;
      }
    }
    return result;
  }


  // Takes two sorted list of strings (so "a" appears before "b" and so on),
  // and return a new list that has all the strings in both list in sorted order.
  static List<String> merge(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>();
    int index1 = 0, index2 = 0;
    while(index1 < list1.size() && index2 < list2.size()) {
      if(list1.get(index1).compareTo(list2.get(index2)) < 0) {
        result.add(list1.get(index1));
        index1 += 1;
      }
      else {
        result.add(list2.get(index2));
        index2 += 1;
      }
    }
    while(index1 < list1.size()) {
      result.add(list1.get(index1));
      index1 += 1;
    }
    while(index2 < list2.size()) {
      result.add(list2.get(index2));
      index1 += 1;
    }
    return result;
  }


}