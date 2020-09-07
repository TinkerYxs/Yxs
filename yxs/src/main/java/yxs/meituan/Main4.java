/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main4.java   
 * @Package yxs.meituan   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月6日 上午11:23:05   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.meituan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			if (n % 2 == 2) {
				System.out.println("NO");
				return;
			}
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				if (a[i] % 2 == 0) {
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
		}

	}

	public static String method(ArrayList<Integer> list) {

		return "YES";
	}

}
