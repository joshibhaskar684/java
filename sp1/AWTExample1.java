import java.awt.*;  // Import AWT package
import java.awt.event.*;  // Import for event handling

public class AWTExample1 extends Frame {
    AWTExample1() {
        // Set Frame Title
        setTitle("My First AWT Window");

        // Set Size (Width, Height)
        setSize(400, 300);

        // Set Layout (Default: BorderLayout)
        setLayout(new FlowLayout());

        // Create a Button
        Button btn = new Button("Click Me");

        // Add Button to Frame
        add(btn);

        // Add Window Closing Event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the window
            }
        });

        // Make Frame Visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTExample1();  // Create and Show Window
    }
}

