/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main5.java   
 * @Package yxs.meituan   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��9��6�� ����11:07:29   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.meituan;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		Deque<Integer> qDeque = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			int temp = scanner.nextInt();
			if (qDeque.contains(temp)) {
				qDeque.remove(temp);
				qDeque.addFirst(temp);
			} else {
				qDeque.addFirst(temp);
			}
		}

		while (!qDeque.isEmpty()) {
			System.out.println(qDeque.getFirst());
			qDeque.removeFirst();
		}

	}

}
