/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  MaxArea.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��6��5�� ����10:19:51   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**
 * @ClassName: MaxArea
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��6��5�� ����10:19:51
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class MaxArea {

	/**
	 * @Title: MaxArea @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public MaxArea() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea2(height));

	}

	public static int maxArea(int[] height) {

		int maxArea = 0;

		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {

				int Area = height[i] < height[j] ? height[i] * Math.abs(j - i) : height[j] * Math.abs(j - i);
				if (Area > maxArea) {
					maxArea = Area;
				}

			}
		}

		return maxArea;

	}

	public static int maxArea2(int[] height) {
		int maxArea = 0;
		int i = 0;
		int j = height.length - 1;

		while (i < j) {
			int width = j - i;
			int Area = 0;
			if (height[j] > height[i]) {
				Area = height[i] * width;
				if (maxArea < Area) {
					maxArea = Area;
				}
				i++;
			} else {

				Area = height[j] * width;
				if (maxArea < Area) {
					maxArea = Area;
				}
				j--;
			}

		}
		return maxArea;

	}
}
