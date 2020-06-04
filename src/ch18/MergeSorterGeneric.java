package ch18;

/*
 * E18.7 Implement a generic version of the merge sort algorithm. Your program 
 * should compile without warnings.

 */
public class MergeSorterGeneric {

        public static void sort(int[] a) {
            if (a.length <= 1) {
                return;
            }
            int[] first = new int[a.length / 2];
            int[] second = new int[a.length - first.length];
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

        private static void merge(int[] first, int[] second, int[] a) {
            int iFirst = 0; // Next element to consider in the first array
            int iSecond = 0; // Next element to consider in the second array
            int j = 0; // Next open position in a
    
            // As long as neither iFirst nor iSecond is past the end, move
            // the smaller element into a
            while (iFirst < first.length && iSecond < second.length) {
                if (first[iFirst] < second[iSecond]) {
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
    
}