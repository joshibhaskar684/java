import java.util.*;
public class m17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binarytree bt=new Binarytree();
        bt.insert();
        bt.display();
    }
}
class Binarytree{
    int data;
   Node root;

    class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;

        }
    }
    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the root node: ");
        root = new Node(sc.nextInt());
        populate(root);

    }
    public void populate(Node root){
        Scanner sc = new Scanner(System.in);
        System.out.println(" do you want to enter the left child of"+ root.data+" node: ");
        boolean ans=sc.nextBoolean();
        if(ans){
            root.left = new Node(sc.nextInt());
            populate(root.left);

        }
        System.out.println(" do you want to enter the right child of"+ root.data+" node: ");
        boolean ansr=sc.nextBoolean();
        if(ansr){
            root.right = new Node(sc.nextInt());
            populate(root.right);

        }
    }
    public void display(){

       inorder(root);
       System.out.println();
       d(root," | ",false);
       System.out.println();
       posto(root);
       System.out.println();
       preo(root);
    }
    public void d(Node r,String i,boolean isr){
        if(r==null){
            return;
        }
        d(r.right,"->",true);
        System.out.print("\t"+i+r.data);
        d(r.left, "--", false);
    }
    public void preo(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preo(root.left);
            preo(root.right);
        }
    }
    public void posto(Node root){
        if(root!=null){
            posto(root.left);
            posto(root.right);
            System.out.print(root.data+" ");
        }
    }
    public void inorder(Node root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}