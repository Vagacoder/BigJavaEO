package ch22;

import ch14.ArrayUtil;
import javax.swing.JComponent;
import java.awt.Graphics;

/*
* 
*/

public class SelectionSortComponent extends JComponent {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // private SelectionSorter sorter;
    private SelectionSorter2 sorter2;

    public SelectionSortComponent() {
        int[] values = ArrayUtil.randomIntArray(30, 300);
        // sorter = new SelectionSorter(values, this);
        sorter2 = new SelectionSorter2(values, this);
    }

    @Override
    public void paintComponent(Graphics g) {
        sorter2.draw(g);
    }

    public void startAnimation() {

        // * run by thread, can run multiple frames
        class AnimationRunnable implements Runnable {

            @Override
            public void run() {
                // try {
                    // sorter.sort();
                    sorter2.sort();
                // } catch (InterruptedException exception) {
                //     exception.printStackTrace();
                // }
            }
        }

        Runnable r = new AnimationRunnable();
        Thread t = new Thread(r);
        t.start();

        // * directly call sort(), still work for single frame
        // try {
        // sorter.sort();
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
    }
}