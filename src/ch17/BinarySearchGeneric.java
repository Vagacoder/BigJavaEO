package ch17;

/*
 * E18.5  Implement a generic version of the binary search algorithm.
 * 
 */

public class BinarySearchGeneric {

    public static <E extends Comparable<E>> int search(E[] a, int low, int high, E value) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid].compareTo(value) == 0) {
                return mid;
            } else if (a[mid].compareTo(value) > 0) {
                return search(a, low, mid - 1, value);
            } else {
                return search(a, mid + 1, high, value);
            }

        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        String[] a = {"b", "d", "j", "l", "o","n", "z"};
        System.out.println(BinarySearchGeneric.search(a, 0, (a.length -1), "j"));
        System.out.println(BinarySearchGeneric.search(a, 0, (a.length -1), "b"));
        System.out.println(BinarySearchGeneric.search(a, 0, (a.length -1), "z"));
        System.out.println(BinarySearchGeneric.search(a, 0, (a.length -1), "m"));
    }
}