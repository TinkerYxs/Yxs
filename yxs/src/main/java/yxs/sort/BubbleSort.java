/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  BubbleSort.java   
 * @Package yxs.sort   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月28日 下午5:52:05   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.sort;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: BubbleSort
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月28日 下午5:52:05
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class BubbleSort {

	/**
	 * @Title: BubbleSort @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.err.println(bubbleSort(list));

	}

	public static int bubbleSort(ArrayList<Integer> list) {
		int count = 0;
		int n = list.size();
		if (n <= 1)
			return 0; // 如果只有一个元素就不用排序了

		for (int i = 0; i < n; ++i) {
			// 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
			boolean flag = false;
			for (int j = 0; j < n - i - 1; ++j) { // 此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面，
				// 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
				if (list.get(j) > list.get(j + 1)) { // 即这两个相邻的数是逆序的，交换
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					count++;
					flag = true;
				}
			}
			if (!flag)
				break;// 没有数据交换，数组已经有序，退出排序
		}
		return count;
	}

}
