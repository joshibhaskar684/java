import java.util.*;

public class m20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binarytree bt = new Binarytree();
        bt.insert(sc);
        bt.display();
        sc.close();
    }
}

class Binarytree {
    Node root;

    class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public void insert(Scanner sc) {
        System.out.print("Enter the root node: ");
        root = new Node(sc.nextInt());
        populate(root, sc);
    }

    public void populate(Node root, Scanner sc) {
        System.out.print("Do you want to enter the left child of " + root.data + "? (true/false): ");
        boolean ans = sc.nextBoolean();
        if (ans) {
            System.out.print("Enter left child of " + root.data + ": ");
            root.left = new Node(sc.nextInt());
            populate(root.left, sc);
        }

        System.out.print("Do you want to enter the right child of " + root.data + "? (true/false): ");
        boolean ansr = sc.nextBoolean();
        if (ansr) {
            System.out.print("Enter right child of " + root.data + ": ");
            root.right = new Node(sc.nextInt());
            populate(root.right, sc);
        }
    }

    public void display() {
        System.out.println("\nInorder Traversal:");
        inorder(root);
        System.out.println("\nTree Structure:");
        d(root, "", true);
        System.out.println("\nPostorder Traversal:");
        posto(root);
        System.out.println("\nPreorder Traversal:");
        preo(root);
    }

    public void d(Node r, String indent, boolean isRight) {
        if (r == null) return;

        d(r.right, indent + (isRight ? "    " : "│   "), true);
        System.out.println(indent + (isRight ? "|___ " : "|--- ") + r.data);
        d(r.left, indent + (isRight ? "    " : "│   "), false);
    }

    public void preo(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preo(root.left);
            preo(root.right);
                               
        }
    }
    public void posto(Node root) {
        if (root != null) {
            posto(root.left);
            posto(root.right);
            System.out.print(root.data + " ");

        }

    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
