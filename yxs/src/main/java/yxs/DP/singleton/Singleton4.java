/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Singleton4.java   
 * @Package yxs.DP.singleton   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��31�� ����4:43:55   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.DP.singleton;

/**
 * @ClassName: Singleton4
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��31�� ����4:43:55
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
// ˫�ؼ��
public class Singleton4 {
	private volatile static Singleton4 singleton;

	private Singleton4() {
	}

	public static Singleton4 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}
