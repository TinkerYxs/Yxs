/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  AnonymousInnerClass.java   
 * @Package yxs.shuma   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��14�� ����3:43:04   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.shuma;

/**
 * @ClassName: AnonymousInnerClass
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��14�� ����3:43:04
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class AnonymousInnerClass {

	public final int a = 123;

	public int b = 333;

	/**
	 * @Title: AnonymousInnerClass @Description:
	 *         TODO(������һ�仰�����������������) @param: @throws
	 */
	public AnonymousInnerClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();

		P p = anonymousInnerClass.new P();
		p.method();

	}

	class P {
		private int c;
		private String dString;

		public void method() {

			if (a == 123) {
				System.out.println(true);
			}

		}
	}

}
