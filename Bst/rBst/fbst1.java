import java.util.Arrays;

public class fbst1 {
    public static void main(String[] args) {
        BST bs = new BST();
        BST bs1 = new BST();
        
        int a[] = {5,2,7,1,4,6,9,8,3,7};
        bs.populate(a);  // Insert elements first
Arrays.sort(a);
System.out.println("Sorted array: " + Arrays.toString(a));
bs1.populate1(a,0,a.length);
System.out.println("Sorted array: " + Arrays.toString(a));
bs1.display();
        bs.display();
        System.out.println("Is the tree balanced? " + bs.balanced());
    }
}

class BST {
    Node root;

    class Node {
        int value;
        int height;
        Node left, right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.height = 0;  // Initialize height
        }

        public int getvalue() {
            return value;
        }
    }
    public void populate1(int a[],int start,int end) {
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(a[mid]);
        populate1(a, start, mid);
        populate1(a, mid+1, end);

    }
    
    public void populate(int a[]) {
        for (int value : a) {
            insert(value);
        }
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }
        
        // Update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        
        return node;
    }

    public boolean balanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 
            && isBalanced(node.left) 
            && isBalanced(node.right);
    }

    public void display() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        displays(root, "ROOT NODE");
    }

    private void displays(Node node, String details) {
        if (node == null) return;
        System.out.println(details + " -> " + node.getvalue());
        displays(node.left, "Left child of " + node.getvalue());
        displays(node.right, "Right child of " + node.getvalue());
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int height(Node node) {
        return node == null ? -1 : node.height;
    }
}