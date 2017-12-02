package com.gevkurg;

public class AddBinary {

  public static String addBinary(String a, String b) {
    if (a == null) {
      return b;
    }

    if (b == null){
      return a;
    }

    int i = a.length() - 1;
    int j = b.length() - 1;
    int c = 0;
    StringBuilder result = new StringBuilder();

    while (i >= 0 || j >= 0 || c == 1){
      c += i >= 0 ? a.charAt(i--) - '0' : 0;
      c += j >= 0 ? b.charAt(j--) - '0' : 0;

      result.insert(0, c % 2);
      c /= 2;
    }

    return result.toString();
  }
}
