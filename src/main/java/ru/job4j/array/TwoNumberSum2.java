package ru.job4j.array;

public class TwoNumberSum2 {
        public static int[] getIndexes(int[] array, int target) {
        int[] result = {0, 0};
        boolean noResult = true;
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] + array[j] == target) {
                result[0] = i;
                result[1] = j;
                noResult = false;

            }
            if (noResult) {
                i++;
            }
            j++;
        }
            if (noResult) {
                return new int[0];
            } else {
                return result;
            }

    }
}

