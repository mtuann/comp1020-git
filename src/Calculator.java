import javax.swing.*;
import java.awt.event.*;

public class Calculator {
   public static void main(String[] args) {
      // Create a new JFrame object
      JFrame frame = new JFrame("My Window");

      // Set the size of the window
      frame.setSize(400, 300);

      // Set the default close operation to exit the program when the window is closed
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a new JPanel object
      JPanel panel = new JPanel();

      // Create a new JTextField object for the first number input
      JTextField numField1 = new JTextField(5);

      // Create a new JTextField object for the second number input
      JTextField numField2 = new JTextField(5);

      // Create a new JLabel object for the result
      JLabel resultLabel = new JLabel("Result:");

      // Create a new JButton object for addition
      JButton addButton = new JButton("+");

      // Create a new JButton object for subtraction
      JButton subButton = new JButton("-");

      // Create a new JButton object for multiplication
      JButton mulButton = new JButton("*");

      // Create a new JButton object for division
      JButton divButton = new JButton("/");

      // Add the number input fields and buttons to the panel
      panel.add(numField1);
      panel.add(numField2);
      panel.add(addButton);
      panel.add(subButton);
      panel.add(mulButton);
      panel.add(divButton);
      panel.add(resultLabel);

      // Add an event listener to the addition button
      addButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Code to be executed when the addition button is clicked
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                double result = num1 + num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
         }
      });

      // Add an event listener to the subtraction button
      subButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Code to be executed when the subtraction button is clicked
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                double result = num1 - num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
         }
      });

      // Add an event listener to the multiplication button
      mulButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Code to be executed when the multiplication button is clicked
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                double result = num1 * num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
         }
      });

      // Add an event listener to the division button
      divButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Code to be executed when the division button is clicked
            try {
                double num1 = Double.parseDouble(numField1.getText());
                double num2 = Double.parseDouble(numField2.getText());
                if (num2 == 0) {
                    resultLabel.setText("Result: Division by zero");
                } else {
                    double result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
         }
      });

      // Add the panel to the JFrame
      frame.add(panel);

      // Set the window to be visible
      frame.setVisible(true);
   }
}

