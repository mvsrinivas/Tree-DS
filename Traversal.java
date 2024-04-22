class BinaryTree {
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Preorder traversal
    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Postorder traversal
    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class Traversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        System.out.print("Inorder traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println();

        // Preorder traversal
        System.out.print("Preorder traversal: ");
        tree.preorderTraversal(tree.root);
        System.out.println();

        // Postorder traversal
        System.out.print("Postorder traversal: ");
        tree.postorderTraversal(tree.root);
        System.out.println();
    }
}
