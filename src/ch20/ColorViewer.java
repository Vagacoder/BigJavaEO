package ch20;


import javax.swing.JFrame;

public class ColorViewer
{  
   public static void main(String[] args)
   {  
      JFrame frame = new ColorFrame();
      frame.setTitle("Color slider demo");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

