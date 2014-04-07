import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
   This program demonstrates how to install an action listener.
*/
public class ButtonViewer {  
   private static final int FRAME_WIDTH = 100;
   private static final int FRAME_HEIGHT = 100;

   public static void main(String[] args) {  
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      
      JButton button1 = new JButton("Click me!");
      panel.add(button1);
      JButton button2 = new JButton("NO! CLICK ME!!!");
      panel.add(button2);
     
     
      ActionListener listener1 = new ClickListener();
      ActionListener listener2 = new ClickListener();
      button1.addActionListener(listener1);
      button2.addActionListener(listener2);
      
      
      frame.add(panel);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
