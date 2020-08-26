package yxs.huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: StringSplite8
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月25日 下午8:59:43
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */

public class StringSplite8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ns = s.nextLine();
		int n = Integer.parseInt(ns);
		ArrayList<String> slist = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			slist.add(s.nextLine());
		}
		ArrayList<String> relist = new ArrayList<String>();
		relist = method(slist);
		for (int i = 0; i < relist.size(); i++) {
			System.out.println(relist.get(i));
		}

	}

	public static ArrayList<String> method(ArrayList<String> s) {

		ArrayList<String> res = new ArrayList<String>();
		StringBuilder sb;
		for (int i = 0; i < s.size(); i++) {
			String st = s.get(i);

			if (st.length() < 8) {
				sb = new StringBuilder("");
				sb.append(st);
				for (int k = 0; k < (8 - st.length()); k++) {
					sb.append("0");
				}
				res.add(sb.toString());

			} else if (st.length() == 8) {
				sb = new StringBuilder("");
				sb.append(st);
				res.add(sb.toString());
			} else if (st.length() > 8) {
				int count = st.length() / 8;
				int num0 = 8 - st.length() % 8;
				int t = 0;
				for (; t < count; t++) {
					sb = new StringBuilder("");
					sb.append(st.substring(t * 8, t * 8 + 8));
					res.add(sb.toString());
				}
				sb = new StringBuilder("");
				sb.append(st.substring(t * 8, st.length()));
				for (int x = 0; x < num0; x++) {
					sb.append("0");
				}
				res.add(sb.toString());

			}

		}

		return res;

	}

}
