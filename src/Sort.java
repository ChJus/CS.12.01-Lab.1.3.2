import java.util.ArrayList;

public class Sort {
  // Performs bubble sort on an integer array
  // The basic outline of the implementation is to perform
  // adjacent pairwise element comparisons.
  // If the element at index j is greater than that at index j + 1,
  // swap the elements. Note that after one full pass through the array,
  // the maximum element of the unsorted portion of the array should reach the end
  // of the unsorted portion of the array.
  public static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      // After i passes through the array, the last i elements should be sorted,
      // so there is no need to go through them.
      // We subtract an extra 1 because the number of comparisons should be one less than
      // the number of elements in the unsorted portion of the array.
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

  // Performs bubble sort on a string array (lexicographically, case-insensitive).
  // Check implementation notes in the integer bubble sort method.
  public static String[] bubbleSort(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j].toLowerCase().compareTo(arr[j + 1].toLowerCase()) > 0) {
          String temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

  // Performs bubble sort on an Integer ArrayList.
  // Check implementation notes in the integer fixed array bubble sort method.
  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size() - i - 1; j++) {
        if (list.get(j) > list.get(j + 1)) {
          int temp = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, temp);
        }
      }
    }
    return list;
  }

  // Performs selection sort to sort an integer array from smallest to largest
  public static int[] selectionSort(int[] arr) {
    // Loop through array
    for (int i = 0; i < arr.length; i++) {
      // Keep track of the minimum index and minimum value
      int minIndex = i, minValue = arr[i];

      // Loop through the unsorted part of the array to find the minimum
      // value and store its value and index.
      for (int j = i; j < arr.length; j++) {
        if (minValue > arr[j]) {
          minIndex = j;
          minValue = arr[j];
        }
      }

      // Swap the first element in the unsorted part of the array
      // with the minimum value found.
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }

    // Returns the array.
    // Note this is usually bad practice as it implies that
    // the original array wasn't sorted and that instead, a new array
    // is returned with the sorted values.
    return arr;
  }

  // Performs selection sort on a string array
  // Note the test cases assume that uppercase/lowercase does not matter
  // Hence, when making comparisons, all strings are converted to lowercase.
  // See implementation notes above
  public static String[] selectionSort(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      String minValue = arr[i];
      for (int j = i; j < arr.length; j++) {
        if (minValue.toLowerCase().compareTo(arr[j].toLowerCase()) > 0) {
          minIndex = j;
          minValue = arr[j];
        }
      }
      String temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
    return arr;
  }

  // Performs selection sort on String ArrayList.
  // Identical to the fixed array implementation
  public static ArrayList<String> selectionSort(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
      int minIndex = i;
      String minValue = list.get(i);
      for (int j = i; j < list.size(); j++) {
        if (minValue.toLowerCase().compareTo(list.get(j).toLowerCase()) > 0) {
          minIndex = j;
          minValue = list.get(j);
        }
      }
      String temp = list.get(i);
      list.set(i, list.get(minIndex));
      list.set(minIndex, temp);
    }
    return list;
  }
}
