package yxs.huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: StringSplite8
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��25�� ����8:59:43
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */

public class SubSgtring8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {

			int n = s.nextInt();
			for (int i = 0; i < n; i++) {
				ArrayList<String> relist = new ArrayList<String>();
				relist = method(s.next());
				for (int z = 0; z < relist.size(); z++) {
					System.out.println(relist.get(z));
				}

			}

		}

	}

	public static ArrayList<String> method(String st) {

		ArrayList<String> res = new ArrayList<String>();
		StringBuilder sb;
		StringBuffer  stringBuffer=new StringBuffer();

		if (st.length() < 8 && st.length() > 0) {
			sb = new StringBuilder();
			sb.append(st);
			for (int k = 0; k < (8 - st.length()); k++) {
				sb.append("0");
			}
			res.add(sb.toString());

		} else if (st.length() == 8) {
			sb = new StringBuilder();
			sb.append(st);
			res.add(sb.toString());
		} else if (st.length() > 8) {
			int count = st.length() / 8;
			int num0 = 8 - st.length() % 8;
			int t = 0;
			for (; t < count; t++) {
				sb = new StringBuilder();
				sb.append(st.substring(t * 8, t * 8 + 8));
				res.add(sb.toString());
			}
			if (num0 < 8) {
				sb = new StringBuilder();
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
