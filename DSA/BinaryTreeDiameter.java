
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinaryTreeDiameter {

    // To store diameter (number of edges)
    static int diameter = 0;

    // Height function
    static int height(TreeNode node) {
        // Base case
        if (node == null) {
            return 0;
        }

        // Go left (must finish completely)
        int leftHeight = height(node.left);

        // Go right (starts only after left finishes)
        int rightHeight = height(node.right);

        // Update diameter at this node
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height to parent
        return Math.max(leftHeight, rightHeight) + 1;
    } 

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \
         * 4 5
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int treeHeight = height(root);

        System.out.println("Height of tree: " + treeHeight);
        System.out.println("Diameter of tree (edges): " + diameter);
    }
}
