/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  LinkList.java   
 * @Package yxs.linklist   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月31日 上午10:07:52   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.linklist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName: LinkList
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月31日 上午10:07:52
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class LinkList {

	/**
	 * @Title: LinkList @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public LinkList() {
		// TODO Auto-generated constructor stub
	}

	public static LinkedList<Integer> listIntersection(LinkedList<Integer> L1, LinkedList<Integer> L2) {
		LinkedList<Integer> intersection = new LinkedList<>();
		Iterator<Integer> iter1 = L1.iterator();
		Iterator<Integer> iter2 = L2.iterator();
		int a = iter1.next();
		int b = iter2.next();
		while (true) {
			if (a == b) {
				intersection.add(a);
				if (iter1.hasNext() && iter2.hasNext()) {
					a = iter1.next();
					b = iter2.next();
				} else
					break;
			} else if (a > b) {
				if (iter2.hasNext())
					b = iter2.next();
				else
					break;
			} else {
				if (iter1.hasNext())
					a = iter1.next();
				else
					break;
			}
		}
		return intersection;
	}

	public static LinkedList<Integer> listUnion(LinkedList<Integer> L1, LinkedList<Integer> L2) {
		LinkedList<Integer> union = new LinkedList<>();
		Iterator<Integer> iter1 = L1.iterator();
		Iterator<Integer> iter2 = L2.iterator();
		int a = iter1.next();
		int b = iter2.next();

		while (true) {
			if (a == b) {
				union.add(a);
				if (iter1.hasNext() && iter2.hasNext()) {
					a = iter1.next();
					b = iter2.next();
				} else
					break;
			} else if (a > b) {
				union.add(b);
				if (iter2.hasNext())
					b = iter2.next();
				else
					break;
			} else {
				union.add(a);
				if (iter1.hasNext())
					a = iter1.next();
				else
					break;
			}
		}
		while (iter1.hasNext())
			union.add(iter1.next());
		while (iter2.hasNext())
			union.add(iter2.next());
		return union;
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 * void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
