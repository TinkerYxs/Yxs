/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main.java   
 * @Package yxs.iqiyi   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月13日 下午3:48:15   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.iqiyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(method(string));

	}

	public static int method(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j <= s.length(); j++) {
				if (isTrue(s, i, j)) {
					res = Math.max(res, j - i);
				}
			}

		}
		return res;

	}

	public static boolean isTrue(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			if (set.contains(s.charAt(i)))
				return false;
			set.add(s.charAt(i));
		}
		return true;
	}
}
