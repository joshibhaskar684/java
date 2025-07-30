public class m21 {
    public static void main(String[] args) {
        BST bs=new BST();
        // bs.insert(50);
        // bs.insert(30);
        // bs.insert(20);
        // bs.insert(10);
        // bs.insert(70);
        // bs.insert(60);
        // bs.insert(80);
        bs.display();
        System.out.println(bs.balanced());
        int a[]={10,3,1,30,45,5,6,74,3,2,5};
        bs.populate(a);
        bs.display();
    }
}
class BST{
    Node root;

    class Node {
        int value;
        int height;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            this.left=null;
            this.right=null;
        }
        public int getvalue()
        {
            return value;
        }
    }
    public void populate (int a[]){
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }
    public void insert(int value){
        root = insert( value,root);


    }
    public boolean balanced(){
        return isBalanced(root);
    }
    public boolean isBalanced(Node node){
        if(node== null) return true;
       return Math.abs(height(node.left)-height(node.right))<=1&& isBalanced(node.left)&&isBalanced(node.right);
    }
    private Node insert(int value,Node node){
        if(node==null){
            return new Node(value);
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void display(){
        displays(root," ROOT NODE is ");
    }
    private void displays(Node node ,String details){
        if (node == null) {
            return;
        }
        System.out.println(details+" is "+node.getvalue());
        displays(node.left,"left child of "+node.getvalue());
        displays(node.right, "right child of "+node.getvalue());

    }
    public boolean isEmpty(){
        return root==null;
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
}