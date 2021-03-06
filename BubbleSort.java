package Sorts;

import static Sorts.SortUtils.*;

/**
 *
 *
 * @author Muhammad Moiz
 *
 */

class BubbleSort implements SortAlgorithm {
  
    @Override
    public  <T extends Comparable<T>> T[] sort(T array[]) {
        int last = array.length;
        boolean swap;
        do {
            swap = false;
            for (int count = 0; count < last-1; count++) {
                if (less(array[count], array[count + 1])) {
                    swap = swap(array, count, count + 1);
                }
            }
            last--;
        } while (swap);
        return array;
    }

    public static void main(String[] args) {

        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(integers);

        print(integers);

        String[] strings = {"c", "a", "e", "b","d"};
        print(bubbleSort.sort(strings));

    }
}
