// import java.awt.*;
// import java.awt.event.*;
// public class N extends Frame implements ActionListener{
//     Label l;
//     Button b;

//     N(){
      
//        l=new Label("hii");
//          l.setFont(new Font("Arial", Font.PLAIN, 24));
//        add(l);

//        l.setBounds(10, 10, 100, 50);
//        b=new Button("click me ");

//        add(b);
//        b.setBounds(110,70,150,50);
//        b.addActionListener(this);
//        Label p=new Label();
//        add(p);
//        setSize(1330,1220);
//        setVisible(true);
//        addWindowListener(new WindowAdapter() {
//     public void windowClosing(WindowEvent e) {
//         dispose();
//     }
// });



//     }
//     public void actionPerformed(ActionEvent e){
//        Label l=new Label("oh my baby ");
//        l.setBounds(200 ,90,300,100);
//        add(l);
//     }
//     public static void main(String[] args) {
//         new N();
//     }
// }
import java.awt.*;
import java.awt.event.*;

public class N extends Frame implements ActionListener {
    Label l;
    Button b;
    Label outputLabel;  // A label to update when button is clicked

    N() {
        setLayout(null);  // Important for using setBounds()

        // Initial Label
        l = new Label("Hi!");
        l.setFont(new Font("Arial", Font.PLAIN, 24));
        l.setBounds(10, 10, 100, 50);
        add(l);

        // Button
        b = new Button("Click me");
        b.setBounds(110, 70, 150, 50);
        b.addActionListener(this);
        add(b);

        // Output label to update on button click
        outputLabel = new Label("");
        outputLabel.setFont(new Font("Arial", Font.BOLD, 20));
        outputLabel.setBounds(200, 90, 300, 100);
        add(outputLabel);

        // Frame settings
        setSize(500, 300);
        setVisible(true);

        // Close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        // Update existing label text
        int a[]={1,2,3,45,6,12,78,9,9,7};
        for(int i=0;i<a.length;i++){
        outputLabel.setText("Oh my baby"+ a[i]);}
    }

    public static void main(String[] args) {
        new N();
    }
}
