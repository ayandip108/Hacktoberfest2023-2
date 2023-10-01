class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " -> ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " -> ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " -> ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insertNode(tree.root, 50);
        tree.insertNode(tree.root, 30);
        tree.insertNode(tree.root, 20);
        tree.insertNode(tree.root, 40);
        tree.insertNode(tree.root, 70);
        tree.insertNode(tree.root, 60);
        tree.insertNode(tree.root, 80);

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println("\n");

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);
        System.out.println("\n");

        System.out.println("Postorder traversal:");
        tree.postorder(tree.root);
        System.out.println("\n");
    }
}
