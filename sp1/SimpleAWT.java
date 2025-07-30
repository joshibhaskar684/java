import java.awt.*;  // Import AWT package
import java.awt.event.*; // Import for event handling

class simple1 extends Frame{
    public simple1(){
        setTitle("my first try ");
        setSize(700, 600);
        setLayout(null);
        Button b=new Button("choose me");
        b.setBounds(100, 100, 100, 50);
          setVisible(true);
}
}
public class SimpleAWT extends Frame {
    SimpleAWT() {
        setTitle("My First AWT App");  // Set window title
        setSize(400, 300);  // Set window size (width, height)
        setLayout(null);  // No default layout

        // Creating a button
        Button b = new Button("Click Me");
        b.setBounds(150, 130, 100, 50);  // Set position and size (x, y, width, height)

        // Add action listener to button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
                Dialog d = new Dialog(SimpleAWT.this, "Message", true);
                d.setSize(200, 100);
                d.setLayout(new FlowLayout());

                Label l = new Label("Hello! This is a Dialog.");
                Button closeBtn = new Button("Close");

                closeBtn.addActionListener(e1 -> d.dispose()); // Close dialog

                d.add(l);
                d.add(closeBtn);
                d.setVisible(true);
            }
        });

        add(b);  // Add button to Frame

        // Closing the window on click
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();  // Close the window
            }
        });

        setVisible(true);  // Make the frame visible
    }

    public static void main(String[] args) {
        new SimpleAWT();  // Create and show the window
    }
}
