/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main.java   
 * @Package yxs.ZTE2021   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��9��5�� ����2:56:04   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.ZTE2021;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��9��5�� ����2:56:04
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main {

	public Main() {

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

	}

	// public static int method(ArrayList<Integer> list) {

	// return count;
	// }

}
