package ch22;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
* E22.6 Enhance the SelectionSortViewer of Section 22.6 so that the sorting only 
starts when the user clicks a “Start” button.

*/

public class SelectionSortViewer {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final SelectionSortComponent component = new SelectionSortComponent();

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
        // component.startAnimation();

    }


}