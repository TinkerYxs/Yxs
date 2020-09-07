/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main1.java   
 * @Package yxs.tencent2011   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月6日 下午8:01:40   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.tencent2011;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Long> list1 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list1.add(scanner.nextLong());
		}
		int m = scanner.nextInt();
		ArrayList<Long> list2 = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			list2.add(scanner.nextLong());
		}
		ArrayList<Long> res = method(list1, list2);

		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
		System.out.println();

	}

	public static ArrayList<Long> method(ArrayList<Long> list1, ArrayList<Long> list2) {

		ArrayList<Long> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		// String string="";
		// string.equals(anObject)
		// string.
		while (i < list1.size() && j < list2.size()) {
			if (list1.get(i) == list2.get(j)) {
				list.add(list1.get(i));
				i++;
				j++;
			} else if (list1.get(i) > list2.get(j)) {
				i++;
			} else if (list2.get(j) > list1.get(i)) {
				j++;
			}

		}
		String s1 = "";
		String s2 = "";
		s1.compareTo(s2);
		return list;
	}
}
