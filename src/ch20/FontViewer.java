package ch20;


import javax.swing.JFrame;

/**
   This program allows the user to view font effects.
*/
public class FontViewer
{  
   public static void main(String[] args)
   {  
      JFrame frame = new FontFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("FontViewer");
      frame.setVisible(true);      
   }
}

