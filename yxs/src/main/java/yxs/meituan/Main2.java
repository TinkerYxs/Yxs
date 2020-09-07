/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main2.java   
 * @Package yxs.meituan   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月6日 上午10:21:08   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.meituan;

import java.util.Scanner;

/**
 * @ClassName: Main2
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月6日 上午10:21:08
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] cs = string.toCharArray();
		int upc = 0;
		int lowerc = 0;

		for (int i = 0; i < cs.length; i++) {

			if (Character.isUpperCase(cs[i])) {
				upc++;
			} else if (Character.isLowerCase(cs[i])) {
				lowerc++;
			}
		}

		System.out.println((upc > lowerc ? (upc - lowerc) / 2 : (lowerc - upc) / 2));
	}

}
