/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  QuickSort.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年7月27日 上午10:37:18   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName: QuickSort
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年7月27日 上午10:37:18
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class QuickSort {

	/**
	 * @Title: QuickSort @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s = new int[] { 2, 3, 4, 1, 4, 6, 2, 8, 5 };

		// 快速排序
		quickSort(s, 0, s.length - 1);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		int[] t = new int[] { 2, 3, 4, 1, 4, 6, 2, 8, 5 };

		// java自带的排序
		Arrays.sort(t);
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}

		// 生成随机数
		Random random = new Random();
		int q = random.nextInt(t.length - 1);
		System.out.println(q);
	}

	public static void quickSort(int s[], int l, int r) {
		if (l < r) {
			int i = adjust(s, l, r);
			quickSort(s, l, i - 1);
			quickSort(s, i + 1, r);
		}
	}

	public static int adjust(int s[], int l, int r) {

		int i = l, j = r, X = s[l];

		while (i < j) {
			while (i < j && s[j] >= X) {
				j--;
			}
			if (i < j) {
				s[i] = s[j];
				i++;
			}
			while (i < j && s[i] < X) {
				i++;
			}
			if (i < j) {
				s[j] = s[i];
				j--;
			}
		}
		s[i] = X;
		return i;
	}

}
