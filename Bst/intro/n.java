import java.util.Scanner;
public class n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        System.out.println("\nBinary Tree Structure:");
        tree.display();
        sc.close();
    }
}
class BinaryTree {
    private Node root;
    // Constructor
    public BinaryTree() {
        this.root = null;
    }
    // Node class
    private class Node {
        int value;
        Node left, right;

        public Node(int data) {
            this.value = data;
            this.left = this.right = null;
        }
    }
    // Method to populate the binary tree
    public void populate(Scanner sc) {
        System.out.println("Enter the root node:");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "? (true/false)");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left node:");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value + "? (true/false)");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right node:");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }
    // Method to display the binary tree
    public void display() {
        display(root, "", true);
    }
    private void display(Node node, String indent, boolean isRight) {
        if (node == null) {
            return;
        }
        // Print the right subtree first (for better indentation)
        display(node.right, indent + "   ", true);
        // Print the current node with an arrow to indicate left or right child
        if (!indent.isEmpty()) {
            System.out.println(indent + (isRight ? "|-->" : "|--") + node.value);
        } else {
            System.out.println(node.value);
        }
        // Print the left subtree
        display(node.left, indent + "   ", false);
    }
}
