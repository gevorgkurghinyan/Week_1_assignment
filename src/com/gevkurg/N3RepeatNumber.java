package com.gevkurg;

import java.util.List;


public class N3RepeatNumber {

  public int repeatedNumber(final List<Integer> a) {
    if (a == null || a.size() == 0){
      return  -1;
    }

    int n = a.size();
    int count1 = 0;
    int count2 = 0;

    int num1 = a.get(0);
    int num2 = a.get(0);

    for (int  i = 0; i < n; ++i) {
      if (num1 == a.get(i)) {
        ++count1;
      } else if (num2 == a.get(i)){
        ++count2;
      } else if (count1 == 0) {
        num1 = a.get(i);
        count1 = 1;
      } else if (count2 == 0) {
        num2 = a.get(i);
        count2 = 1;
      } else {
        --count1;
        --count2;
      }
    }


    count1 = 0;
    count2 = 0;

    for (int  i = 0; i < n; ++i) {
      if (a.get(i) == num1) {
        ++count1;
      } else  if (a.get(i) == num2){
        ++count2;
      }
    }

    return count1 > n /3 ? count1 : count2 > n / 3 ? count2 : -1;
  }
}
