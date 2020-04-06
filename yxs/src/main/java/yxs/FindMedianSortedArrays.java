/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  FindMedianSortedArrays.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��4��6�� ����4:30:26   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: FindMedianSortedArrays
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��4��6�� ����4:30:26
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class FindMedianSortedArrays {

	/**
	 * @Title: FindMedianSortedArrays @Description:
	 *         TODO(������һ�仰�����������������) @param: @throws
	 */
	public FindMedianSortedArrays() {
		// TODO Auto-generated constructor stub
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int size1 = nums1.length;
		int size2 = nums2.length;
		int length = size1 + size2;
		int m = length / 2;

		List<Integer> list = new ArrayList<Integer>();
		int i = 0, j = 0, count = 0;
		while (count <= m && i < nums1.length && j < nums2.length) {

			if (nums1[i] <= nums2[j]) {
				list.add(nums1[i]);
				i++;
				count++;
			} else {
				list.add(nums2[j]);
				j++;
				count++;
			}

		}
		if (i >= nums1.length) {
			while (j < nums2.length && count <= m) {
				list.add(nums2[j]);
				j++;
				count++;
			}

		}
		if (j >= nums2.length) {
			while (i < nums1.length && count <= m) {
				list.add(nums1[i]);
				i++;
				count++;
			}
		}

		double result = 0;
		if (length % 2 == 0) {
			System.out.println(list);

			result = (double) (list.get(m) + list.get(m - 1)) / 2;

		} else {
			System.out.println(list);
			result = list.get(m);
		}
		return result;
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
