/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main2.java   
 * @Package yxs.sina   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月13日 下午4:46:13   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.sina;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @ClassName: Main2
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月13日 下午4:46:13
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main2 {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] strings = scanner.nextLine().split(",");
		int[] A = new int[strings.length];

		for (int i = 0; i < strings.length; i++) {

			A[i] = Integer.parseInt(strings[i]);
		}

		TreeNode root = buildBST(A);
		levelOrderPrintBST(root);
		levelOrderPrintBST(change(root));

	}

	public static TreeNode buildBST(int[] A) {
		TreeNode root = new TreeNode(A[0]);
		for (int i = 1; i < A.length; i++) {
			creatBST(root, A[i]);
		}

		return root;
	}

	public static void creatBST(TreeNode node, int val) {
		if (val < node.val) {
			if (node.left == null) {
				node.left = new TreeNode(val);
			} else {
				creatBST(node.left, val);
			}
		} else {
			if (node.right == null) {
				node.right = new TreeNode(val);
			} else {
				creatBST(node.right, val);
			}

		}

	}

	public static TreeNode change(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return root;
		} else {
			TreeNode leftRoot = new TreeNode(0);
			leftRoot = change(root);
			TreeNode tmpNode = leftRoot;
			while (tmpNode.right != null) {
				tmpNode = tmpNode.right;
			}
			tmpNode.left = root.right;
			tmpNode.right = root;
			root.right = null;
			root.left = null;
			return leftRoot;
		}

	}

	public static void levelOrderPrintBST(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();

		if (root == null) {
			return;
		}
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node == null) {
				continue;

			} else {
				arrayList.add(node.val);
				queue.offer(node.left);
				queue.offer(node.right);
			}
		}

		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < arrayList.size() - 1; i++) {
			sBuilder.append(arrayList.get(i) + ",");
		}
		sBuilder.append(arrayList.get(arrayList.size() - 1));

		System.out.println(sBuilder.toString());
	}

}
