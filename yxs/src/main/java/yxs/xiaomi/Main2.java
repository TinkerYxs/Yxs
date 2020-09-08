/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main2.java   
 * @Package yxs.xiaomi   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月8日 下午7:07:46   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.xiaomi;

import java.util.Scanner;

/**
 * @ClassName: Main2
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月8日 下午7:07:46
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main2 {

	public static boolean[][] flag;
	public static int m;
	public static int n;
	public static int[][] direction = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	public static char[][] chars = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'F' } };
	public static String word;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		word = scanner.next();
		if (exists(chars, word)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static boolean exists(char[][] chars, String word) {
		m = chars.length;
		if (m == 0)
			return false;
		n = chars[0].length;
		flag = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (find(i, j, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean find(int i, int j, int head) {
		if (head == word.length() - 1) {
			return chars[i][j] == word.charAt(head);
		}
		if (word.charAt(head) == chars[i][j]) {
			flag[i][j] = true;
			for (int k = 0; k < 4; k++) {
				int x = i + direction[k][0];
				int y = j + direction[k][1];
				if (x >= 0 && x < m && y >= 0 && y < n && !flag[x][y]) {
					if (find(x, y, head + 1)) {
						return true;
					}
				}
			}
			flag[i][j] = false;
		}
		return false;
	}

}
