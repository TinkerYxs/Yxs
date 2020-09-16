/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Num2.java   
 * @Package yxs.huawei2021   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月26日 下午5:27:08   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.huawei2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

/**
 * @ClassName: Num2
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月26日 下午5:27:08
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Num2 {

	/**
	 * @Title: Num2 @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public Num2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String string = scanner.nextLine();

		String[] strings = string.split("\\]\\,\\[");

		String s1 = strings[0].substring(1, strings[0].length());

		String s2 = strings[1].substring(0, strings[0].length() - 1);

		String[] w = s1.split(",");

		String[] h = s2.split(",");

		if (w.length != h.length || w.length == 0 || h.length == 0) {
			System.out.println(0);
			return;
		}
		int[] wids = new int[w.length];
		int[] higs = new int[h.length];

		for (int i = 0; i < w.length; i++) {
			wids[i] = Integer.valueOf(w[i]);
			higs[i] = Integer.valueOf(h[i]);
			if (wids[i] < 0 || higs[i] < 0) {
				System.out.println(0);
				return;
			}
			// System.out.println(wids[i] + " " + higs[i]);
		}

		System.out.println(method(wids, higs));

	}

	public static int method(int[] w, int[] h) {

		if (h == null || h.length == 0) {

			return 0;
		}
		int[] l = new int[h.length];

		int[] r = new int[h.length];

		Arrays.fill(r, h.length);

		System.out.println(Arrays.toString(r));

		Deque<Integer> stack = new ArrayDeque();

		int result = 0;

		for (int i = 0; i < h.length; i++) {

			while (!stack.isEmpty() && h[i] <= h[stack.peek()]) {
				r[stack.peek()] = i;
				stack.pop();
			}
			if (stack.isEmpty()) {
				l[i] = 0;
			} else {
				l[i] = stack.peek() + 1;
			}
			stack.push(i);

		}

		System.out.println(Arrays.toString(l));
		System.out.println(Arrays.toString(r));
		for (int k = 0; k < h.length; k++) {

			int width = 0;
			for (int i = l[k]; i < r[k]; i++) {
				width += w[i];

			}
			result = Math.max(result, width * h[k]);

		}

		return result;
	}

}
