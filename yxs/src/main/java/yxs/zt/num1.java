/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  num1.java   
 * @Package yxs.zt   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��24�� ����7:03:15   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.zt;

import java.util.Scanner;

/**
 * @ClassName: num1
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��24�� ����7:03:15
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class num1 {

	/**
	 * @Title: num1 @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public num1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */

	static long maxA;

	static long maxB;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		double s = (double) a / (double) b;
		long i = A;
		long j = B;
		maxA = A;
		maxB = B;
		if (A == 0 || B == 0 || a == 0 || b == 0) {
			System.out.println(0 + " " + 0);
			return;
		} else {

			while (i > 0) {
				while (j > 0) {
					double t = (double) i / (double) j;
					System.out.println(t);
					if (t == s) {
						System.out.println(i + " " + j);
						return;
					} else if (t > s) {
						i--;
					} else if (t < s) {
						j--;
					}

				}
			}

			// method(A, B, s);
		}
	}

	public static void method(long A, long B, double s) {

		double t = (double) A / (double) B;
		if (t == s) {
			System.out.println(A + " " + B);
			return;
		} else if (t > s) {
			method(A - 1, B, s);
			if (B < maxB) {
				method(A, B + 1, s);
			}
		} else if (t < s) {
			method(A, B - 1, s);
			if (A < maxA) {
				method(A + 1, B, s);
			}
		}
	}

}
