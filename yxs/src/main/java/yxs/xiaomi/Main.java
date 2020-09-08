/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main.java   
 * @Package yxs.xiaomi   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月8日 下午6:43:38   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.xiaomi;

import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月8日 下午6:43:38
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string;
		string = scanner.nextLine();
		String[] strings = string.split(".");
		for (int i = 0; i < strings.length; i++) {
			System.out.println(method(strings[i]));
		}
	}

	public static int method(String string) {

		if (string.length() < 8 || string.length() > 120) {
			return 1;

		}
		boolean uper = false;

		boolean lower = false;
		boolean num = false;
		boolean simple = false;
		for (int i = 0; i < string.length(); i++) {
			if (isNum(string.charAt(i))) {
				num = true;
			} else if (isUp(string.charAt(i))) {
				uper = true;
			} else if (isLow(string.charAt(i))) {
				lower = true;
			} else if (isSimple(string.charAt(i))) {
				simple = true;
			}
		}
		if (simple == false || uper == false || lower == false || num == false) {
			return 1;
		} else {
			return 0;
		}
	}

	public static boolean isNum(char c) {
		if (c > '0' && c < '9') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isUp(char c) {
		if (c > 'A' && c < 'Z') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isLow(char c) {
		if (c > 'a' && c < 'z') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isSimple(char c) {
		if (!isUp(c) && !isLow(c) && !isNum(c)) {
			return true;
		} else {
			return false;
		}
	}

}
