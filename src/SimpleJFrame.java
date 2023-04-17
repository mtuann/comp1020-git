import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleJFrame extends JFrame {
    
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu;
    private JMenuItem newMenuItem, saveMenuItem, copyMenuItem, pasteMenuItem;
    private JToolBar toolBar;
    private JButton newButton, saveButton, copyButton, pasteButton;
    
    public SimpleJFrame() {
        setTitle("My Frame");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create label and text field
        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        
        // Create button
        button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
            }
        });
        
        // Create menus and menu items
        fileMenu = new JMenu("File");
        newMenuItem = new JMenuItem("New");
        saveMenuItem = new JMenuItem("Save");
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        
        editMenu = new JMenu("Edit");
        copyMenuItem = new JMenuItem("Copy");
        pasteMenuItem = new JMenuItem("Paste");
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        
        // Create menu bar
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);
        
        // Create toolbar
        toolBar = new JToolBar();
        newButton = new JButton("New");
        saveButton = new JButton("Save");
        copyButton = new JButton("Copy");
        pasteButton = new JButton("Paste");
        toolBar.add(newButton);
        toolBar.add(saveButton);
        toolBar.add(copyButton);
        toolBar.add(pasteButton);
        
        // Add components to frame
        setLayout(new BorderLayout());
        add(label, BorderLayout.NORTH);
        add(textField, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.PAGE_START);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SimpleJFrame();
    }
}
