package com.gevkurg;

public class ReverseString {
  public static String reverseWords(String a) {
    if (a == null || a.length() == 0) {
      return a;
    }

    char[] c = a.toCharArray();
    int n = c.length;
    reverse(c, 0, n - 1);
    reverseWords(c);
    return removeSpaces(c);
  }

  private static String removeSpaces(char[] a) {
    int i = 0, j = 0;
    int n = a.length;

    while (j < n) {
      while (j < n && a[j] == ' ') j++;
      while (j < n && a[j] != ' ') a[i++] = a[j++];
      while (j < n && a[j] == ' ') j++;
      if (j < n) a[i++] = ' ';
    }

    return new String(a).substring(0, i);
  }

  private static void reverseWords(char[] c) {
    int n = c.length;
    int i = 0;
    int j = 0;

    while (i < n) {
      while (i < j || i < n && c[i] == ' ') ++i;
      while(j < i || j < n && c[j] != ' ') ++j;
      reverse(c, i, j-1);
    }
  }

  private static void reverse(char[] c, int i, int j) {
    while(i < j) {
      char temp = c[i];
      c[i] = c[j];
      c[j] = temp;
      ++i;
      --j;
    }
  }
}
