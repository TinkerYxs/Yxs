/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Singleton2.java   
 * @Package yxs.DP.singleton   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��31�� ����4:36:30   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.DP.singleton;

/**
 * @ClassName: Singleton2
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��31�� ����4:36:30
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
// ���� �̰߳�ȫ
public class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
