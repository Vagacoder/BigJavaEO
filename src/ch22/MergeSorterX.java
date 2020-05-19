package ch22;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JComponent;
import java.awt.*;

/*
* E22.2 Implement the merge sort algorithm of Chapter 14 by spawning a new thread
for each smaller MergeSorter. Hint: Use the join method of the Thread class to wait
for the spawned threads to finish. Look up the method’s behavior in the API docu-
mentation.

* The method skeleton is copied from ch14.MergeSorter.java
*/

public class MergeSorterX {

    private int[] a;

    // * for painting color
    private int low = -1;
    private int mid = -1;
    private int high = -1;

    private Lock sortStateLock;
    private JComponent component;
    private static final int DELAY = 50;

    public MergeSorterX(int[] arr, JComponent parent) {
        this.a = arr;
        this.component = parent;
        sortStateLock = new ReentrantLock();
    }

    // * E22.2 re-implmented
    public void sort() throws InterruptedException {
        System.out.println("Sorting...");
        sort(this.a, 0, this.a.length-1);
        this.low = -1;
        this.mid = -1;
        this.high = -1;
        pause(2);
    }

    // * E22.2 re-implmented
    private void sort(int[] a, int low, int high) throws InterruptedException {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        this.low = low;
        this.mid = mid;
        this.high = high;
        pause(4);

        sort(a, low, mid);
        sort(a, mid + 1, high);
        this.low = low;
        this.mid = mid;
        this.high = high;
        pause(4);

        merge(a, low, mid, high);
        this.low = low;
        this.mid = mid;
        this.high = high;
        pause(4);
    }

    private void merge(int[] a, int low, int mid, int high) {
        sortStateLock.lock();

        try {
            int[] temp = new int[a.length];

            for (int i = 0; i < a.length; i++) {
                temp[i] = a[i];
            }

            int i1 = low;
            int i2 = mid + 1;
            int j = low;
            while (i1 < mid + 1 && i2 < high+1) {
                if (temp[i1] < temp[i2]) {
                    a[j] = temp[i1];
                    i1++;
                } else {
                    a[j] = temp[i2];
                    i2++;
                }
                j++;
            }

            while (i1 < mid + 1) {
                a[j] = temp[i1];
                j++;
                i1++;
            }

            while (i2 < high+1) {
                a[j] = temp[i2];
                j++;
                i2++;
            }
        } finally {
            sortStateLock.unlock();
        }
    }

    // * from ch14
    private void sort1(int[] a) throws InterruptedException {
        if (a.length <= 1) {
            return;
        }

        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = a[first.length + i];
        }
        sort1(first);
        sort1(second);
        pause(2);
        merge1(first, second, a);
        pause(2);
    }

    // * from ch14
    private void merge1(int[] first, int[] second, int[] a) {
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0; // Next open position in a

        sortStateLock.lock();
        try {
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

            while (iFirst < first.length) {
                a[j] = first[iFirst];
                iFirst++;
                j++;
            }

            while (iSecond < second.length) {
                a[j] = second[iSecond];
                iSecond++;
                j++;
            }
        } finally {
            sortStateLock.unlock();
        }
    }

    public void draw(Graphics g) {
        System.out.println("Drawing");

        sortStateLock.lock();
        try {
            int deltaX = component.getWidth() / a.length;
            for (int i = 0; i < a.length; i++) {
                if(i<low || i >high){
                    g.setColor(Color.GRAY);
                }else if(i>=low && i<=mid){
                    g.setColor(Color.RED);
                }else if(i > mid && i <=high){
                    g.setColor(Color.BLUE);
                }
                g.drawLine(i * deltaX, 0, i * deltaX, a[i]);
            }
        } finally {
            sortStateLock.unlock();
        }
    }

    public void pause(int steps) throws InterruptedException {
        System.out.println("paused");
        component.repaint();
        Thread.sleep(steps * DELAY);
    }
}