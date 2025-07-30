// import java.awt.*;
// import java.awt.event.*;
// public class awt extends Frame implements ActionListener {
//     Label l;
//     Button b;
//     int count=0;
//     public awt(){
//         setLayout(null);
//         setSize(600, 100);
//         setTitle("MENE BANAYA H ");
//         b=new Button("click me");
//         b.addActionListener(this);
//         b.setBounds(120,250,100,200);
//         add(b);
//         setVisible(true);
//           l=new Label();
//         l.setBounds(40,40,152,112);
//         add(l);}
//     public void actionPerformed(ActionEvent e){
//         count++;
//         System.out.println("event click");
//       l.setText("hello" +count); }
//       public static void main(String[] args) {
//         new awt();}}
import javax.swing.*;
import java.awt.event.*;
public class awt extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;
    public awt() {
        setLayout(null);
        setSize(600, 100);
        setTitle("MENE BANAYA H");
        b = new JButton("click me");
        b.addActionListener(this);
        b.setBounds(120, 250, 100, 200);
        add(b);
        l = new JLabel();
        l.setBounds(40, 40, 152, 112);
        add(l);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
    public void actionPerformed(ActionEvent e) {
        count++;
        System.out.println("event click");
        l.setText("hello" + count);}
    public static void main(String[] args) {
        new awt();}}
