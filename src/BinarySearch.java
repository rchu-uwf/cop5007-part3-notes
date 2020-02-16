public class BinarySearch {

    public static <T extends Comparable<T>> int getIndex(T[] list, int startIndex, int endIndex, T searchKey) {

        if (startIndex > endIndex){
            return -1;
        }

        // get the middle element
        int mid = (startIndex+endIndex)/2;

        // compare to the middle element
        int compare = searchKey.compareTo(list[mid]);

        // if middle is larger then recurse on the left half.
        if (compare < 0) {
            return BinarySearch.getIndex(list, startIndex, mid - 1, searchKey);
        } else if (compare > 0) {
            return BinarySearch.getIndex(list, mid + 1, endIndex, searchKey);
        } else {
            return mid;
        }

        // if middle is smaller then recurse on the right half.


        // if middle is equal then return index of the middle element.

    }


}
