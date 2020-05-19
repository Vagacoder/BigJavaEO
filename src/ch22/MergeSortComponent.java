package ch22;

import javax.swing.JComponent;
import java.awt.*;
import ch14.ArrayUtil;

/*
* E22.2 Implement the merge sort algorithm of Chapter 14 by spawning a new thread
for each smaller MergeSorter. Hint: Use the join method of the Thread class to wait
for the spawned threads to finish. Look up the method’s behavior in the API docu-
mentation.

*/

public class MergeSortComponent extends JComponent {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private MergeSorterX sorter;

    public MergeSortComponent() {
        int[] values = ArrayUtil.randomIntArray(30, 300);
        sorter = new MergeSorterX(values, this);
    }

    public void paintComponent(Graphics g) {
        sorter.draw(g);
    }

    public void startAnimation() {
        System.out.println("Start animation");
        
        Thread t = new Thread() {

            public void run() {
                try {
                    sorter.sort();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();
    }

}