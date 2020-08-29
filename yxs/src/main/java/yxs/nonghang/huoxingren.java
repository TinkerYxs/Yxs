/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  huoxingren.java   
 * @Package yxs.nonghang   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月29日 上午10:08:44   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.nonghang;

import java.util.Scanner;

/**
 * @ClassName: huoxingren
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月29日 上午10:08:44
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class huoxingren {

	/**
	 * @Title: huoxingren @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public huoxingren() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println(fun(num));

	}

	public static String fun(int num) {

		String str = "";
		int yushu; // 保存余数
		int shang = num; // 保存商
		while (shang > 0) {
			yushu = shang % 3;
			shang = shang / 3;
			if (yushu == 0) {
				str = "@" + str;
			} else if (yushu == 1) {
				str = "$" + str;
			} else if (yushu == 2) {
				str = "&" + str;
			}

		}

		return str;
	}

}
