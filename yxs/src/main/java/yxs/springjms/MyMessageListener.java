/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  MyMessageListener.java   
 * @Package yxs.springjms   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��12�� ����6:04:33   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.springjms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @ClassName: MyMessageListener
 * @Description:������
 * @author: Ԫ��˧
 * @date: 2020��8��12�� ����6:04:33
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class MyMessageListener implements MessageListener {
	// ������message
	@Override
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
		try {
			System.out.println("���յ���Ϣ��" + textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
