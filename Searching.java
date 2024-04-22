class BinaryTree {
    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
}

public class Searching{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();


        TreeNode result = tree.search(tree.root, 15);
        if (result != null) {
            System.out.println("Node found: " + result.data);
        } else {
            System.out.println("Node not found.");
        }
    }
}
