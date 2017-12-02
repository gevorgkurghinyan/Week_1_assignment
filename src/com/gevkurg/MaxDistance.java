package com.gevkurg;

import java.util.List;


public class MaxDistance {
  public static int maximumGap(final List<Integer> a) {

    if (a == null || a.size() == 0) {
      return -1;
    }

    int n = a.size();
    int[] minArray = new int[n];
    int[] maxArray = new int[n];

    minArray[0] = a.get(0);
    for (int i = 1; i < n; ++i) {
      minArray[i] = Math.min(a.get(i), minArray[i-1]);
    }

    maxArray[n-1] = a.get(n-1);
    for (int i = n-2; i >= 0; --i) {
      maxArray[i] = Math.max(a.get(i), maxArray[i+1]);
    }

    int i = 0;
    int j = 0;

    int maxDistance = -1;

    while (i < n && j < n) {
      if (minArray[i] < maxArray[j]){
        maxDistance = Math.max(maxDistance, j-i);
        ++j;
      } else {
        ++i;
      }
    }

    return maxDistance;
  }
}
