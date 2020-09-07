/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main1.java   
 * @Package yxs.ZTE2021   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��9��5�� ����2:56:15   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.ZTE2021;

import java.util.Scanner;

/**
 * @ClassName: Main1
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��9��5�� ����2:56:15
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main1 {

	public Main1() {

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		System.out.println(method(n, m, k));

	}

	public static int method(int n, int m, int k) {
		int ans = 0;
		for (int i = 3; i <= n; i++) {
			if (2 <= (k - i) && (k - i) <= m) {
				ans = (int) ((ans + C(i, n) * C(k - i, m)) % (Math.pow(10, 9) + 7));
			}
		}
		return ans;
	}

	public static int C(int n, int m) {
		int ans = 1;
		int tag_1 = n;
		while (tag_1-- > 0) {
			ans = ans * (m--);
		}
		int tag_2 = n;
		while (tag_2-- > 0) {
			ans = ans / (n--);
		}
		return ans;
	}
}
