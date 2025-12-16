import java.util.*;

public class LCA {

    static LcaNode insert(LcaNode root, int value) {

        if (root == null) {
            return new LcaNode(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static LcaNode lca(LcaNode root, int v1, int v2) {

        while (root != null) {

            if (v1 < root.data && v2 < root.data) {
                root = root.left;
            } else if (v1 > root.data && v2 > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LcaNode root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        LcaNode result = lca(root, v1, v2);
        if (result != null) {
            System.out.println(result.data);
        }
    }
}

class LcaNode {
    int data;
    LcaNode left, right;

    LcaNode(int data) {
        this.data = data;
        left = right = null;
    }
}
