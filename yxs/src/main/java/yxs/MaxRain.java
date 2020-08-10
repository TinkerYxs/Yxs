/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  MaxRain.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月10日 下午4:34:27   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.ArrayList;

/**
 * @ClassName: MaxRain
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月10日 下午4:34:27
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class MaxRain {

	/**
	 * @Title: MaxRain @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public MaxRain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(6);
		a.add(5);
		a.add(4);
		a.add(3);
		a.add(2);
		a.add(1);

		System.out.println(method(a, 0, 5, 0));

		// TODO Auto-generated method stub

	}

	public static int method(ArrayList<Integer> a, int left, int right, int maxArea) {

		System.out.println(left + " " + a.get(left));
		System.out.println(right + " " + a.get(right));

		int high = (a.get(left) > a.get(right) ? a.get(right) : a.get(left));

		maxArea = maxArea + (right - left) * high;
		System.out.println(maxArea);
		for (int i = 0; i < a.size(); i++) {
			a.set(i, a.get(i) - high);

			System.out.println(" a" + i + "：" + a.get(i));

		}

		for (int i = left; i <= right; i++) {
			if (a.get(i) > 0) {
				left = i;
				break;
			}
		}
		for (int i = right; i >= 0; i--) {
			if (a.get(i) > 0) {
				right = i;
				break;
			}
		}

		System.out.println("   " + left + " " + a.get(left));
		System.out.println("   " + right + " " + a.get(right));

		if (left < right) {

			maxArea = method(a, left, right, maxArea);

		}

		System.out.println("   " + maxArea);
		return maxArea;

	}
}
