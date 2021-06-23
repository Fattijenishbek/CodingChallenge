package dataStructure;

class Inorder {
    Node root;
    Inorder() {
        root = null;
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    void printInorder() { printInorder(root); }

    public static void main(String[] args)
    {
        Inorder tree = new Inorder();
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
                "\nInorder traversal of binary tree is ");
        tree.printInorder();
    }
}

