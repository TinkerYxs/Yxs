/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main.java   
 * @Package yxs.didi   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月13日 下午7:35:49   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月13日 下午7:35:49
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String string = scanner.nextLine();

		System.out.println(method(n, string));
	}

	public static String method(int n, String s) {

		int size = s.length() / n;
		if (s.length() % n != 0) {
			size = size + 1;
		}
		List<String> list = new ArrayList<String>();
		for (int index = 0; index < size; index++) {

			String childstr = subSting(s, index * n, (index + 1) * n);
			list.add(childstr);
		}

		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sBuilder.append(reverse(list.get(i)));
		}

		return sBuilder.toString();

	}

	public static String reverse(String string) {
		return new StringBuilder(string).reverse().toString();
	}

	public static String subSting(String str, int f, int t) {
		if (f > str.length()) {
			return null;
		}
		if (t > str.length()) {
			return str.substring(f, str.length());
		} else {
			return str.substring(f, t);
		}
	}

}
