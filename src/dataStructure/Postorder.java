package dataStructure;

class Postorder {
    Node root;
    Postorder() {
        root = null;
    }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
    void printPostorder() { printPostorder(root); }

    public static void main(String[] args)
    {
        Postorder tree = new Postorder();
        tree.root = new Node(11);
        tree.root.left = new Node(6);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(8);
        tree.root.left.left.left = new Node(1);
        tree.root.left.left.right = new Node(5);
        tree.root.right.left = new Node(13);
        tree.root.right.right = new Node(17);
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(14);
        tree.root.right.right.right = new Node(19);

        System.out.println(
                "\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}

