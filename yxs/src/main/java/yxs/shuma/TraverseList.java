/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TraverseList.java   
 * @Package yxs.shuma   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��14�� ����3:42:30   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.shuma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @ClassName: TraverseList
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��14�� ����3:42:30
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class TraverseList {

	/**
	 * @Title: TraverseList @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public TraverseList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(62);
		list.add(7);
		list.add(36);
		list.add(53);

		for (int i = 0; i < list.size(); i++) {

			Collections.sort(list);

		}
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

		Iterator<Integer> iterator = list.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			if (46 == iterator.next()) {
				System.out.println(list.get(i));
				iterator.remove();
				list.remove(i);
			}
			i++;
		}

	}

}
