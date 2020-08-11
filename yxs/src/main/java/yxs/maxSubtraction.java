/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  maxSubtraction.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月10日 下午7:16:34   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: maxSubtraction
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月10日 下午7:16:34
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class maxSubtraction {

	/**
	 * @Title: maxSubtraction @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public maxSubtraction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		ArrayList<IndexNum> list = new ArrayList<IndexNum>();
		int i = 0;
		while (scanner.hasNext()) {
			int x = scanner.nextInt();

			if (x == -1) {
				break;
			} else {
				IndexNum indexNum = new IndexNum();
				indexNum.setIndex(i);
				indexNum.setValue(x);
				list.add(indexNum);
				i++;
			}
		}

		System.out.println(method2(list));

	}

	public static int method(ArrayList<Integer> a) {
		int res = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				list.add(a.get(i) - a.get(j));
			}
		}
		res = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > res) {
				res = list.get(i);
			}
		}
		return res;
	}

	public static int method2(ArrayList<IndexNum> a) {

		int res = 0;
		quickSort(a, 0, a.size() - 1);
		int i = 0, j = a.size() - 1;
		while (i < j) {

			if (a.get(j).getIndex() < a.get(i).getIndex()) {
				res = a.get(i).getValue() - a.get(j).getValue();
			} else {

			}

		}
		return res;
	}

	public static void quickSort(ArrayList<IndexNum> s, int l, int r) {
		if (l < r) {
			int i = adjust(s, l, r);
			quickSort(s, l, i - 1);
			quickSort(s, i + 1, r);
		}
	}

	public static int adjust(ArrayList<IndexNum> s, int l, int r) {

		int i = l, j = r, X = s.get(l).getValue();

		while (i < j) {
			while (i < j && s.get(j).getValue() >= X) {
				j--;
			}
			if (i < j) {
				s.get(i).setValue(s.get(j).getValue());
				s.get(i).setIndex(s.get(j).getIndex());
				i++;
			}
			while (i < j && s.get(i).getValue() < X) {
				i++;
			}
			if (i < j) {
				s.get(j).setValue(s.get(i).getValue());
				s.get(j).setIndex(s.get(i).getIndex());
				j--;
			}
		}
		s.get(i).setValue(X);
		s.get(i).setIndex(l);
		return i;
	}

}
