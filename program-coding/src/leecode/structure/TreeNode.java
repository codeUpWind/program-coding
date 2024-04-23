package leecode.structure;

/**
 * @author wind
 * @create 2024/4/22
 */
public class TreeNode {

    public TreeNode left;

    public TreeNode right;

    public int value;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(TreeNode left, TreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
}
