/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  xxxxxxx.java   
 * @Package yxs.alibaba   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��29�� ����9:48:28   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.nonghang;

/**
 * @ClassName: xxxxxxx
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��29�� ����9:48:28
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class xxxxxxx {

	/**
	 * @Title: xxxxxxx @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public xxxxxxx() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 * void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 5;
			int b = 0;
			System.out.println(a / b);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			System.out.println("end!");
		}
	}

}
