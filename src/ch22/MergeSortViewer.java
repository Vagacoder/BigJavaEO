package ch22;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

/*
* E22.2 Implement the merge sort algorithm of Chapter 14 by spawning a new thread
for each smaller MergeSorter. Hint: Use the join method of the Thread class to wait
for the spawned threads to finish. Look up the method’s behavior in the API docu-
mentation.

*/

public class MergeSortViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final MergeSortComponent component = new MergeSortComponent();

        // * E22.6
        JButton startBtn = new JButton("Start");
        startBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                component.startAnimation();
            }

        });
        frame.add(component, BorderLayout.CENTER);
        frame.add(startBtn, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}