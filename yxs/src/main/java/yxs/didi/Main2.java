/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main2.java   
 * @Package yxs.didi   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月13日 下午7:57:28   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.didi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName: Main2
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月13日 下午7:57:28
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < x; i++) {
			String[] string1 = scanner.nextLine().split(" ");
			int n = Integer.valueOf(string1[0]);
			int m = Integer.valueOf(string1[1]);
			int k = Integer.valueOf(string1[2]);
			List<Edge> list = new ArrayList<Edge>();
			for (int j = 0; j < m; j++) {
				String[] string2 = scanner.nextLine().split(" ");
				if (Integer.valueOf(string2[2]) <= k) {

					Edge edge = new Edge();
					edge.a = Integer.valueOf(string2[0]);
					edge.b = Integer.valueOf(string2[1]);
					list.add(edge);
				}

			}
			if (method(m, list)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}

	}

	public static boolean method(int m, List<Edge> list) {

		Set<Integer> dao = new HashSet<>();
		dao.add(list.get(0).a);

		dao.add(list.get(0).b);

		boolean flag = false;
		int count = 1;
		while (count < list.size()) {

			int x = count;
			for (int i = 1; i < list.size(); i++) {
				if (!dao.contains(list.get(i).a) && !dao.contains(list.get(i).b)) {
					i++;
				}
				if (!dao.contains(list.get(i).a) && dao.contains(list.get(i).b)) {

					dao.add(list.get(i).a);
					count++;
				}
				if (!dao.contains(list.get(i).b) && dao.contains(list.get(i).a)) {

					dao.add(list.get(i).b);
					count++;
				}
			}
			int y = count;
			return flag;

		}
		return flag;
	}

	public static class Edge {

		int a;
		int b;

	}

}
