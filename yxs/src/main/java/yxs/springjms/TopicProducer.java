/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TopicProducer.java   
 * @Package yxs.springjms   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��12�� ����8:45:51   
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
 * @ClassName: TopicProducer
 * @Description:����������Ϣ������
 * @author: Ԫ��˧
 * @date: 2020��8��12�� ����8:45:51
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
@Component
public class TopicProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Destination topicTextDestination;

	/**
	 * �����ı���Ϣ
	 * 
	 * @param text
	 */
	public void sendTextMessage(final String text) {
		jmsTemplate.send(topicTextDestination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException, JMSException {
				return session.createTextMessage(text);
			}
		});
	}

}
