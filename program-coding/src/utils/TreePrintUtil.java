package utils;

import leecode.structure.TreeNode;

/**
 * @author wind
 * @create 2024/4/23
 */
public class TreePrintUtil {

    /**
     * 前序打印树
     *
     * @param root
     */
    public static void proPrintTree(TreeNode root) {

        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        proPrintTree(root.left);
        proPrintTree(root.right);
    }
}
