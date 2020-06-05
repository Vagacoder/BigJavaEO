package ch18;

/*
 * E18.7 Implement a generic version of the merge sort algorithm. Your program 
 * should compile without warnings.

 */
public class MergeSorterGeneric<T extends Comparable> {

    private T[] a;

    MergeSorterGeneric(T[] a){
        this.a = a;
    }

    public void sort(){
        sort(this.a);
    }

    private  void sort(Comparable[] a) {
        if (a.length <= 1) {
            return;
        }
        Comparable[] first = new Comparable[a.length / 2];
        Comparable[] second = new Comparable[a.length - first.length];
        // Copy the first half of a into first, the second half into second
        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = a[first.length + i];
        }
        sort(first);
        sort(second);
        merge(first, second, a);
    }

    private void merge(Comparable[] first, Comparable[] second, Comparable[] a) {
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0; // Next open position in a

        // As long as neither iFirst nor iSecond is past the end, move
        // the smaller element into a
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].compareTo(second[iSecond]) < 0) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        // Note that only one of the two loops below copies entries
        // Copy any remaining entries of the first array
        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }
        // Copy any remaining entries of the second half
        while (iSecond < second.length) {
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }

    public static void main(String[] args){
        Integer[] arr1 = {6, 3, 9, 1, 5, 4, 7, 2, 10, 8};
        for(int i: arr1){
            System.out.print(i + ", ");
        }
        System.out.println();
        MergeSorterGeneric m = new MergeSorterGeneric(arr1);
        m.sort();
        for(int i: arr1){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}