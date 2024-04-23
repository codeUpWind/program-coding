package capriccio;

import leecode.structure.TreeNode;
import utils.TreePrintUtil;

/**
 * 二叉树反转：前后遍历都可以 中序不行会影响顺序
 * DFS
 *
 * @author wind
 * @create 2024/4/23
 */
public class BtreeFlip {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreePrintUtil.proPrintTree(root);
        TreeNode result = bTreeFlip(root);
        TreePrintUtil.proPrintTree(result);
    }

    private static TreeNode bTreeFlip(TreeNode root) {

        // 终止条件
        if (root == null) {
            return null;
        }
        // 反转左右节点 传引用进去
        reserveTree(root);
        bTreeFlip(root.left);
        bTreeFlip(root.right);
        return root;
    }

    private static void reserveTree(TreeNode root) {

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }


}
