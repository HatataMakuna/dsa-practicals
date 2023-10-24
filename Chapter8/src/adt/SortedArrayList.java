package adt;

/**
 * SortedArrayList - Implements the ADT Sorted List using an array. - Note: Some
 * methods are not implemented yet and have been left as practical exercises
 */
public class SortedArrayList<T extends Comparable<T>> implements SortedListInterface<T> {

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 10000;

    public SortedArrayList() {
      this(DEFAULT_CAPACITY);
    }

    public SortedArrayList(int initialCapacity) {
      numberOfEntries = 0;
      array = (T[]) new Comparable[initialCapacity];
    }

    public boolean add(T newEntry) {
//        int i = 0;
//        while (i < numberOfEntries && newEntry.compareTo(array[i]) > 0) {
//          i++;
//        }
        int i = Math. abs(binarySearch(newEntry));
        makeRoom(i + 1);
        array[i] = newEntry;
        numberOfEntries++;
        return true;
    }

    public boolean remove(T anEntry) {
        int index = binarySearch(anEntry);
        if(index >= 0){
            removeGap(index + 1);
            numberOfEntries--;
            return true;
        }else{
            return false;
        }
    }

    public void clear() {
        numberOfEntries = 0;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
    //    for (int index = 0; index < numberOfEntries && anEntry.compareTo(array[index]) >= 0; index++) {
    //        if (anEntry.compareTo(array[index]) == 0) {
    //          found = true;
    //        }
    //    }
        if(binarySearch(anEntry) >= 0){
            found = true;
        }
        return found;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public String toString() {
        String outputStr = "";
        for (int index = 0; index < numberOfEntries; ++index) {
          outputStr += array[index] + "\n";
        }

        return outputStr;
    }

    private boolean isArrayFull() {
        return numberOfEntries == array.length;
    }

    private void doubleArray() {
        T[] oldList = array;
        int oldSize = oldList.length;

        array = (T[]) new Object[2 * oldSize];

        for (int index = 0; index < oldSize; index++) {
          array[index] = oldList[index];
        }
    }
  
    private int binarySearch(T anEntry){
        int first = 0;
        int last = numberOfEntries - 1;
        int mid = (first + last) / 2;
        while(first <= last){
            if(anEntry.compareTo(array[mid]) == 0){
                return mid;
            }else if(anEntry.compareTo(array[mid]) > 0){
                first = mid +1;
            }else{
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return -(last + 1);
    }

  private void makeRoom(int newPosition) {
    int newIndex = newPosition - 1;
    int lastIndex = numberOfEntries - 1;

    for (int index = lastIndex; index >= newIndex; index--) {
      array[index + 1] = array[index];
    }
  }

  private void removeGap(int givenPosition) {
    int removedIndex = givenPosition - 1;
    int lastIndex = numberOfEntries - 1;

    for (int index = removedIndex; index < lastIndex; index++) {
      array[index] = array[index + 1];
    }
  }

  @Override
  public boolean isFull() {
    return false;
  }

}
