/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  BubbleSort.java   
 * @Package yxs.sort   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��28�� ����5:52:05   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.sort;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: BubbleSort
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��28�� ����5:52:05
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class BubbleSort {

	/**
	 * @Title: BubbleSort @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.err.println(bubbleSort(list));

	}

	public static int bubbleSort(ArrayList<Integer> list) {
		int count = 0;
		int n = list.size();
		if (n <= 1)
			return 0; // ���ֻ��һ��Ԫ�ؾͲ���������

		for (int i = 0; i < n; ++i) {
			// ��ǰ�˳�ð��ѭ���ı�־λ,��һ�αȽ���û�н����κ�Ԫ�أ����������Ѿ����������
			boolean flag = false;
			for (int j = 0; j < n - i - 1; ++j) { // �˴�����ܻ����ʵ�j<n-i-1����Ϊð���ǰ�ÿ��ѭ���нϴ����Ʈ�����棬
				// �����±����Ǵ�0��ʼ�ģ�i�±�����Ѿ�����ĸ����͵ö��1���ܽ����i�����٣�j��ѭ��λ�ü�����
				if (list.get(j) > list.get(j + 1)) { // �����������ڵ���������ģ�����
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					count++;
					flag = true;
				}
			}
			if (!flag)
				break;// û�����ݽ����������Ѿ������˳�����
		}
		return count;
	}

}
