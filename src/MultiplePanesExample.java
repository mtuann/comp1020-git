import javax.swing.*;

public class MultiplePanesExample {

   public static void main(String[] args) {

      // Create a new JFrame object
      JFrame frame = new JFrame("Multiple Panes Example");

      // Set the size of the window
      frame.setSize(500, 500);

      // Create a new JPanel object
      JPanel panel = new JPanel();

      // Create a new JLabel object and add it to the panel
      JLabel label = new JLabel("This is pane 1");
      panel.add(label);

      // Create a new JButton object and add it to the panel
      JButton button = new JButton("Switch to pane 2");
      panel.add(button);

      // Create a new JLabel object and add it to the panel
      JLabel label2 = new JLabel("This is pane 2");
      panel.add(label2);
      label2.setVisible(false);

      // Create a new JButton object and add it to the panel
      JButton button2 = new JButton("Switch to pane 1");
      panel.add(button2);
      button2.setVisible(false);

      // Add an ActionListener to the first button to switch to pane 2
      button.addActionListener(e -> {
         label.setVisible(false);
         button.setVisible(false);
         label2.setVisible(true);
         button2.setVisible(true);
      });

      // Add an ActionListener to the second button to switch to pane 1
      button2.addActionListener(e -> {
         label2.setVisible(false);
         button2.setVisible(false);
         label.setVisible(true);
         button.setVisible(true);
      });

      // Add the panel to the JFrame
      frame.add(panel);

      // Set the window to be visible
      frame.setVisible(true);
   }
}
