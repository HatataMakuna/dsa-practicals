package sorting;

public class SortArray {

  private static <T> void swap(T[] a, int i, int j) {
    T temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  /**
   * ********************* Bubble Sort ******************************
   */
  public static <T extends Comparable<T>> void bubbleSort(T[] a, int n) {
    boolean sorted = false;
    for (int pass = 1; pass < n && !sorted; pass++) {
      sorted = true;
      for (int index = 0; index < n - pass; index++) {
        // swap adjacent elements if first is greater than second
        if (a[index].compareTo(a[index + 1]) > 0) {
          swap(a, index, index + 1); // swap adjacent elements 
          sorted = false;  // array not sorted because a swap was performed
        }
      }
    }
  }
  
  /**
   * ********************* Selection Sort ******************************
   */
//  public static <T extends Comparable<T>> void selectionSort(T[] a, int n) {    
//      for (int p = 0; p < n - 1; p++) {
//        int smallestIndex = p;
//        boolean sorted = false;  
//        for (int i = p; i < n - 1; i++) {
//            if(a[smallestIndex].compareTo(a[i + 1]) > 0){
//                smallestIndex = i + 1;
//                sorted = true;
//            }
//        }
//        if(sorted == true){
//            swap(a, smallestIndex, p);
//            sorted = false;
//        }
//      }    
//  }
  
  public static <T extends Comparable<T>> void selectionSort (T[] a, int n){
      selectionSort(a, 0, n);
  }

  
  private static <T extends Comparable<? super T>> void selectionSort(T[] a, int first, int last){
      if(first < last){
          int smallestIndex = first;
          for (int i = first + 1; i < last; i++) {
              if(a[smallestIndex].compareTo(a[i]) > 0){
                  swap(a, smallestIndex, i);
              }
          }
          selectionSort(a, first + 1, last);
      }
  }

  
  /**
   * ********************* Insertion Sort ******************************
   */
  public static <T extends Comparable<T>> void insertionSort(T[] a, int n){
      for (int unsorted = 1; unsorted < n; unsorted++) {
          T firstUnsorted = a[unsorted + 1];
          insertInOrder(a, firstUnsorted, unsorted-1);
      }
  }
  
  private static <T extends Comparable<T>> void insertInOrder(T[] a, T element, int sortedEnd){
      int index = sortedEnd;
      while(index >= 0 && element.compareTo(a[index]) < 0){
          a[index + 1] = a[index];
          index--;
      }
      a[index + 1] = element;
  }
  
  /**
   * ********************* Quick Sort ******************************
   */
  public static <T extends Comparable<T>> void quickSort(T[] a, int n) {
    quickSort(a, 0, n - 1);
  }

  // recursive private overloaded method quickSort() 
  private static <T extends Comparable<T>> void quickSort(T[] a, int first, int last) {
    if (first < last) {
      int pivotIndex = partition(a, first, last);
      quickSort(a, first, pivotIndex - 1);
      quickSort(a, pivotIndex + 1, last);
    }
  }

  // private method partition() - to partition the array based on the pivot value
  private static <T extends Comparable<T>> int partition(T[] a, int first, int last) {
    int pivotIndex = last;
    T pivot = a[last];
    int indexFromLeft = first;
    int indexFromRight = last - 1;
    boolean done = false;

    while (!done) {
      while (indexFromLeft < last && a[indexFromLeft].compareTo(pivot) < 0) {
        indexFromLeft++;
      }

      while (indexFromRight > first && a[indexFromRight].compareTo(pivot) > 0) {
        indexFromRight--;
      }

      if (indexFromLeft < indexFromRight) {
        swap(a, indexFromLeft, indexFromRight);
        indexFromLeft++;
        indexFromRight--;
      } else {
        done = true;
      }
    }
    swap(a, pivotIndex, indexFromLeft);
    pivotIndex = indexFromLeft;
    return pivotIndex;
  }

  public static <T> void printArray(T[] a) {
    for (int i = 0; i < a.length; ++i) {
      System.out.print(a[i] + "  ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    String[] nameArray = {"Dan", "Ann", "Zoe", "Jet", "Ben"};

    // Test bubblesort
    System.out.print("Before bubblesort: ");
    printArray(nameArray);
    bubbleSort(nameArray, nameArray.length);
    System.out.print("After bubblesort : ");
    printArray(nameArray);

    Integer[] numArray = {90, 40, 10, 30, 20, 50};

    System.out.print("\nBefore bubblesort: ");
    printArray(numArray);
    bubbleSort(numArray, numArray.length);
    System.out.print("After bubblesort : ");
    printArray(numArray);
    
    Integer[] numArray2 = {35, 15, 80, 60, 25, 32, 11};
    System.out.print("\nBefore selectionsort: ");
    printArray(numArray2);
    selectionSort(numArray2, numArray2.length);
    System.out.print("After selectionsort : ");
    printArray(numArray2);
    
    Integer[] numArray3 = {35, 15, 80, 60, 25, 32, 11};
    System.out.print("\nBefore insertionsort: ");
    printArray(numArray3);
    selectionSort(numArray3, numArray3.length);
    System.out.print("After insertionsort : ");
    printArray(numArray3);

    // Test quicksort
    Integer[] numArray4 = {3, 5, 0, 4, 6, 1, 2, 4};
    System.out.print("\nBefore quicksort: ");
    printArray(numArray4);
    quickSort(numArray4, numArray4.length);
    System.out.print("After quicksort : ");
    printArray(numArray4);
    
    
  }

}
