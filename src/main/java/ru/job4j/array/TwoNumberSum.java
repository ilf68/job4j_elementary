package ru.job4j.array;

public class TwoNumberSum {
      public static int[] getIndexes(int[] array, int target) {
        int[] result = {0, 0};
        boolean noResult = true;
          for (int i = 0; i < array.length - 1 && noResult; i++) {
              for (int j = i + 1; j < array.length && noResult; j++) {
                  if (array[i] + array[j] == target) {
                      result[0] = i;
                      result[1] = j;
                      noResult = false;
                  }
              }
          }
        if (noResult) {
            return new int[0];
        } else {
            return result;
        }
    }
}
