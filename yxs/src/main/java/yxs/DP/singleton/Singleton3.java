/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Singleton3.java   
 * @Package yxs.DP.singleton   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��31�� ����4:37:37   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.DP.singleton;

/**
 * @ClassName: Singleton3
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��31�� ����4:37:37
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
// �������̰߳�ȫ
public class Singleton3 {
	private static Singleton3 instance = new Singleton3();

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return instance;
	}
}
