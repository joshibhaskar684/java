import java.util.Scanner;
public class n {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.insert();
        bt.inorder();
    }
}
class  BinaryTree{
    private Node root;
    BinaryTree(){
        root = null;
    }
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
        System.out.println("Enter the root node");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        root = new Node(r);
        populate(sc, root);

    }
    private void populate(Scanner sc, Node root){
        System.out.println(" do you want to Enter left child of (True/false) " + root.data);
        boolean Ansl=sc.nextBoolean();
        if(Ansl){
            System.out.println("Enter the left child");
            int l = sc.nextInt();
            root.left = new Node(l);
            populate(sc, root.left);
        }
        System.out.println(" do you want to Enter right child of (True/false) " + root.data);
        boolean Ansr=sc.nextBoolean();
        if(Ansr){
            System.out.println("Enter the right child");
            int r = sc.nextInt();
            root.right = new Node(r);
            populate(sc, root.right);
        }
    }
    public void inorder(){
        // in order left root right
        inorders(root);
    }
    public void inorders(Node root){
        if (root != null) {
            inorders(root.left);
            System.out.print(root.data + " ");
            inorders(root.right);    
        }
    
}
public void preorder(){
    preorders(root);
}
private void preorders(Node root)
{
    if (root != null) {
        
    }
}
}