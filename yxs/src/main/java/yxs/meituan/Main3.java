/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main3.java   
 * @Package yxs.meituan   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月6日 上午10:33:10   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.meituan;

import java.util.Scanner;

/**
 * @ClassName: Main3
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月6日 上午10:33:10
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int a = scanner.nextInt();
		for (int j = 1; j <= n; j++) {
			a = a ^ (1 % j);
		}
		int res = a;

		for (int i = 1; i < n; i++) {
			int ax = scanner.nextInt();

			for (int j = 1; j <= n; j++) {
				ax = ax ^ ((i + 1) % j);
			}
			res = res ^ ax;
		}

		System.out.println(res);

	}

}
