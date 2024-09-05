import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
  private int[] arrayOne;
  private String[] arrayTwo;
  private ArrayList<Integer> listOne;
  private ArrayList<String> listTwo;

  @BeforeEach
  void setUp() {
    arrayOne = new int[]{12, 3, 34, 12, 4, 32, 11, 9, 21, 25, 1, 5, 19, 2, 20, 13, 19, 14, 1, 16};
    arrayTwo = new String[]{"don't", "tell", "me", "what", "I", "wanna", "hear", "afraid", "of", "never", "knowing", "fear"};
    listOne = new ArrayList<>();
    for (int i : arrayOne) listOne.add(i);
    listTwo = new ArrayList<>();
    for (String str : arrayTwo) listTwo.add(str);
  }

  @AfterEach
  void tearDown() {
    arrayOne = null;
    arrayTwo = null;
    listOne = null;
    listTwo = null;
  }

  @Test
  void bubbleSort() {
    int[] sortedArrayOne = {1, 1, 2, 3, 4, 5, 9, 11, 12, 12, 13, 14, 16, 19, 19, 20, 21, 25, 32, 34};
    Sort.bubbleSort(arrayOne);
    for (int i = 0; i < sortedArrayOne.length; i++) assertEquals(sortedArrayOne[i], arrayOne[i]);
  }

  @Test
  void testBubbleSort() {
    String[] sortedArrayTwo = {"afraid", "don't", "fear", "hear", "I", "knowing", "me", "never", "of", "tell", "wanna", "what"};
    Sort.bubbleSort(arrayTwo);
    for (int i = 0; i < sortedArrayTwo.length; i++) assertEquals(sortedArrayTwo[i], arrayTwo[i]);
  }

  @Test
  void testBubbleSort1() {
    int[] sortedArrayOne = {1, 1, 2, 3, 4, 5, 9, 11, 12, 12, 13, 14, 16, 19, 19, 20, 21, 25, 32, 34};
    Sort.bubbleSort(listOne);
    for (int i = 0; i < sortedArrayOne.length; i++) assertEquals(sortedArrayOne[i], listOne.get(i));
  }

  @Test
  void selectionSort() {
    int[] sortedArrayOne = {1, 1, 2, 3, 4, 5, 9, 11, 12, 12, 13, 14, 16, 19, 19, 20, 21, 25, 32, 34};
    Sort.selectionSort(arrayOne);
    for (int i = 0; i < sortedArrayOne.length; i++) assertEquals(sortedArrayOne[i], arrayOne[i]);
  }

  @Test
  void testSelectionSort() {
    String[] sortedArrayTwo = {"afraid", "don't", "fear", "hear", "I", "knowing", "me", "never", "of", "tell", "wanna", "what"};
    Sort.selectionSort(arrayTwo);
    for (int i = 0; i < sortedArrayTwo.length; i++) assertEquals(sortedArrayTwo[i], arrayTwo[i]);
  }

  @Test
  void testSelectionSort1() {
    String[] sortedArrayTwo = {"afraid", "don't", "fear", "hear", "I", "knowing", "me", "never", "of", "tell", "wanna", "what"};
    Sort.selectionSort(listTwo);
    for (int i = 0; i < sortedArrayTwo.length; i++) assertEquals(sortedArrayTwo[i], listTwo.get(i));
  }
}