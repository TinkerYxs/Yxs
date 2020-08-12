/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  QueueProducer.java   
 * @Package yxs.springjms   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��12�� ����5:37:33   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.springjms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

/**
 * @ClassName: QueueProducer
 * @Description:��Ե���Ϣ������
 * @author: Ԫ��˧
 * @date: 2020��8��12�� ����5:37:33
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
@Component
public class QueueProducer {
	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	// Destination�ǽӿڣ�queueTextDestination�������õ�ʵ���������
	private Destination queueTextDestination;

	/**
	 * �����ı���Ϣ
	 * 
	 * @param text
	 */
	public void sendTextMessage(final String text) {
		// MessageCreatorʹ��������ķ�ʽ����
		jmsTemplate.send(queueTextDestination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(text);
			}
		});
	}

}
