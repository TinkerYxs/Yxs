/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main.java   
 * @Package yxs.ZTE2021   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月5日 下午2:56:04   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.ZTE2021;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月5日 下午2:56:04
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main {

	public Main() {

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

	}

	// public static int method(ArrayList<Integer> list) {

	// return count;
	// }

}
