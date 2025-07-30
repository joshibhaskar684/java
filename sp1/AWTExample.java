import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame implements ActionListener {
    TextField tf;
    Button btn;
    Checkbox cb;
    Choice dropdown;

    AWTExample() {
        setTitle("AWT Components Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        Label label = new Label("Enter your name:");
        tf = new TextField(20);
        btn = new Button("Submit");

        cb = new Checkbox("I agree");
        dropdown = new Choice();
        dropdown.add("Option 1");
        dropdown.add("Option 2");

        btn.addActionListener(this);  // Event handling

        add(label);
        add(tf);
        add(btn);
        add(cb);
        add(dropdown);

        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked! Name: " + tf.getText());
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
