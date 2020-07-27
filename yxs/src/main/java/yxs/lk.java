/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  lk.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年7月15日 上午11:14:36   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**
 * @ClassName: lk
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年7月15日 上午11:14:36
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class lk {

	/**
	 * @Title: lk @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public lk() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {

		System.out.println(k(12345678, 3));
		// TODO Auto-generated method stub

	}

	public static int k(int a, int m) {

		int[] A = new int[n(a)];

		int i = 0;
		while (a / 10 > 0) {
			A[i] = a % 10;
			a = a / 10;
			i++;

		}
		A[i] = a;
		if (m < A.length) {
			int[] B = new int[m + 1];

		} else {
			return 0;
		}

		return 0;

	}

	public static int n(int num) {

		int n = 1;
		while (num / 10 > 0) {
			num = num / 10;
			n++;

		}

		return n;

	}

	public static int max(int[] A) {

		int max = A[0];
		int index = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] > max) {
				max = A[i];
				index = i;
			}
		}

		return index;

	}

}
