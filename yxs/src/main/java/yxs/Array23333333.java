/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Array23333333.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月8日 下午3:23:57   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.Scanner;

/**
 * @ClassName: Array23333333
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月8日 下午3:23:57
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Array23333333 {

	/**
	 * @Title: Array23333333 @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public Array23333333() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int rst = 0;
		while (scanner.hasNext()) {
			int n = scanner.nextInt();

			for (int i = 0; i < n; i++) {
				rst = rst + chai(scanner.nextInt());

			}
			System.out.println(rst);
		}

	}

	public static int chai(int n) {

		int res = 0;
		if (n > 1) {
			res = n / 2;
		}

		return res;
	}

}
