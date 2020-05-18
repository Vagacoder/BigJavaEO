package ch22;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JComponent;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch14.ArrayUtil;

/*
* P22.7 Instead of using a thread and a pause method, use the Timer class introduced 
in Chapter 10 to ani­mate an algorithm. Whenever the timer sends out an action event, 
run the algorithm to the next step and display the state. That requires a more
extensive recoding of the algorithm. You need to implement a runToNextStep method
that is capable of running the algorithm one step at a time. Add sufficient instance
variables to the algorithm to remember where the last step left off. For example, in
the case of the selection sort algorithm, if you know the values of alreadySorted and
markedPosition, you can determine the next step.

? Turn for loop to a finity state machine
? 0: starting a loop
? 1: found a minPos (could add more states here, but for an easy work, use one state)
?       (also this causes red line: markedPosition is always the last one)
? 2: swaped minPos with i
? 0: updated i

*/

public class SelectionSorter2 {

    private int[] a;
    private int markedPosition = -1;
    private int alreadySorted = -1;

    // * Lock for multiple frames; For single frame, no need locl at all
    private Lock sortStateLock;

    private JComponent component;
    private static final int DELAY = 100;

    // * P22.7 state variables
    private int runningState = 0;
    private int index = 0;
    private int minPos = -1;

    private Timer timer;

    public SelectionSorter2(int[] anArray, JComponent aComponent) {
        a = anArray;
        sortStateLock = new ReentrantLock();
        component = aComponent;
    }

    public void sort() {
        int length = this.a.length;

        timer = new Timer(DELAY, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (index >= length) {
                    timerStop();
                    return;
                }
                if (runningState == 0) {
                    minPos = minimumPosition(index);
                } else if (runningState == 1) {
                    sortStateLock.lock();
                    try {
                        ArrayUtil.swap(a, minPos, index);
                        alreadySorted = index;
                    } finally {
                        sortStateLock.unlock();
                    }
                } else if (runningState == 2) {
                    index++;
                }
                runningState = (runningState + 1) % 3;
                component.repaint();
            }
        });
        timer.start();

    }

    private void timerStop(){
        if(this.timer != null){
            this.timer.stop();
        }
    }

    private int minimumPosition(int from) {
        int minPos = from;
        markedPosition = from;
        for (int i = from + 1; i < a.length; i++) {
            sortStateLock.lock();
            try {
                if (a[i] < a[minPos]) {
                    minPos = i;
                }
                markedPosition = i;
            } finally {
                sortStateLock.unlock();
            }
        }
        return minPos;
    }

    public void draw(Graphics g) {
        sortStateLock.lock();
        try {
            int deltaX = component.getWidth() / a.length;
            for (int i = 0; i < a.length; i++) {
                if (i == markedPosition) {
                    g.setColor(Color.RED);
                } else if (i <= alreadySorted) {
                    g.setColor(Color.BLUE);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.drawLine(i * deltaX, 0, i * deltaX, a[i]);
            }
        } finally {
            sortStateLock.unlock();
        }
    }

}
