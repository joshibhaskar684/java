import java.awt.*;
import java.awt.event.*;
public class ne extends Frame implements ActionListener  {
    Label l ;
    Button b;
    ne(){
        setLayout(new GridLayout(4,4));
        l=new Label("mere jaan");
        add(l);
add(new Button("1"));
add(new Button("2"));
add(new Button("3"));
add(new Button("4"));
add(new Button("5"));
add(new Button("6"));
        setVisible(true);
    }
    public static void main(String[] args) {
        new ne();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("nknknjbm m ");
         }
}
