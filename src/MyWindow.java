import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyWindow {
   public static void main(String[] args) {
      // Create a new JFrame object
      JFrame frame = new JFrame("My Window");

      // Set the size of the window
      frame.setSize(400, 300);

      // Set the default close operation to exit the program when the window is closed
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a new JPanel object
      JPanel panel = new JPanel();

      // Create a new JLabel object with some text
      JLabel label = new JLabel("Hello, World!");

      // Create a new JButton object with some text
      JButton button = new JButton("Click me!");

      // Create a new JTextField object with some initial text
      JTextField textField = new JTextField("Enter your name");

      // Create a new JTextArea object with some initial text
      JTextArea textArea = new JTextArea("This is a text area.");

      // Set the size of the text area
      textArea.setPreferredSize(new Dimension(200, 100));
      
      // Add the label, button, and text field to the panel
      panel.add(label);
      panel.add(button);
      panel.add(textField);
      panel.add(textArea);
      
      // Add an event listener to the button
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Code to be executed when the button is clicked
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
            JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
            textArea.setText("Hello, " + name + "!\n");
         }
      });
      

      // Add the panel to the content pane of the window
      frame.getContentPane().add(panel);

      // Set the window to be visible
      frame.setVisible(true);
   }
}
