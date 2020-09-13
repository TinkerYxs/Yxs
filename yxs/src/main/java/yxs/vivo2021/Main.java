/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main.java   
 * @Package yxs.vivo2021   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月12日 下午8:16:20   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.vivo2021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String string = scanner.nextLine();

		if (string != null) {
			if (!isHW(string)) {
				char[] cs = string.toCharArray();
				boolean flag = false;
				for (int i = 0; i < string.length(); i++) {
					StringBuilder sb = new StringBuilder();

					for (int j = 0; j < string.length(); j++) {
						if (j != i) {
							sb.append(cs[j]);
						}
					}
					if (isHW(sb.toString())) {
						flag = true;
						System.out.println(sb.toString());
						break;
					}

				}
				if (flag == false) {
					System.out.println("false");
				}
			} else {
				System.out.println(string);
			}
		} else {
			System.out.println("false");
		}

	}

	public static boolean isHW(String string) {
		boolean flag = false;
		/*
		 * byte[] byteval = string.getBytes(); for (int k = 0; k < byteval.length; k++)
		 * { if (byteval[k] == byteval[byteval.length - k - 1]) { flag = true; } else {
		 * flag = false; k = byteval.length - 1; } }
		 */
		StringBuilder sb = new StringBuilder(string);
		String afterReverser = sb.reverse().toString();
		int iseq = afterReverser.compareTo(string);
		if (iseq == 0) {
			flag = true;

		} else {
			flag = false;
		}
		return flag;
	}

}
