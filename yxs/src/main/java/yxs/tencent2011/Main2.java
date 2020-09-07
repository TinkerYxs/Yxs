/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main2.java   
 * @Package yxs.tencent2011   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月6日 下午8:17:21   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.tencent2011;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[][] array = new int[n][m];
		int[] size = new int[m];
		for (int i = 0; i < m; i++) {
			size[i] = scanner.nextInt();
			for (int j = 0; j < size[i]; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		int res = 0;
		while (res != list.size()) {
			res = list.size();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < size[i]; j++) {
					if (list.contains(array[i][j])) {
						for (int k = 0; k < size[i]; k++) {
							if (!list.contains(array[i][k])) {
								list.add(array[i][k]);
							}
						}
					}
				}
			}
		}
		System.out.println(res);
		/*
		 * scanner.nextLine();
		 * 
		 * ArrayList<Integer>[] lists = new ArrayList[m]; for (int i = 0; i < m; i++) {
		 * 
		 * lists[i] = new ArrayList<>(); String[] strings =
		 * scanner.nextLine().split(" "); int x = Integer.valueOf(strings[0]); for (int
		 * j = 0; j < x; j++) {
		 * 
		 * lists[i].add(Integer.valueOf(strings[j + 1]));
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
