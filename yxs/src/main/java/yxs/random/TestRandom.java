/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TestRandom.java   
 * @Package yxs.random   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��28�� ����4:45:21   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.random;

import java.util.Random;

/**
 * @ClassName: TestRandom
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��28�� ����4:45:21
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class TestRandom {

	/**
	 * @Title: TestRandom @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public TestRandom() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 * void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); // ���ݵ�ǰϵͳ��ʱ����Ϊ��������ӣ�����һ�������������

		System.out.println(random.nextInt(10));

	}

}
