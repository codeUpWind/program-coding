package leecode.algorithm;

import leecode.algorithm.structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 力扣153：找出二叉树 根节点到叶子节点的和=target的数组
 *
 * @author wind
 * @create 2024/4/22
 */
public class OneFiveThree {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        OneFiveThree test = new OneFiveThree();
        List<List<Integer>> result = test.pathTarget(root, 22);
        result.forEach(item -> System.out.println(Arrays.toString(item.toArray())));
    }

    public List<List<Integer>> pathTarget(TreeNode root, int target) {

        recursion(root, target);
        return result;
    }

    public void recursion(TreeNode root, int target) {

        // 如果为空不符合
        if (root == null) {
            return;
        }
        // 加入根节点
        path.add(root.value);
        target -= root.value;
        // 符合的加入
        if (target == 0 && root.left == null && root.right == null) {
            result.add(new LinkedList<>(path));
        }
        // 分别查找左右节点
        recursion(root.left, target);
        recursion(root.right, target);
        // 如果不满足进行上一个回溯
        path.removeLast();
    }

}
