/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  MathRound.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��8�� ����5:20:14   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**
 * @ClassName: MathRound
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��8�� ����5:20:14
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class MathRound {

	/**
	 * @Title: MathRound @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public MathRound() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f = 1.233445f;
		System.out.println(f);

		float f1 = (float) Math.round(f * 10) / 10;

		System.out.println(f1);

	}

}
