/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  QueueConsumer.java   
 * @Package yxs.jmsdemo   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��12�� ����8:11:35   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.jmsdemo;

import java.io.IOException;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @ClassName: QueueConsumer
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��12�� ����8:11:35
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class QueueConsumer {
	public static void main(String[] args) throws JMSException, IOException {
		// 1.�������ӹ���
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");
		// 2.��ȡ����
		Connection connection = connectionFactory.createConnection();
		// 3.��������
		connection.start();
		// 4.��ȡsession (����1���Ƿ���������,����2����Ϣȷ��ģʽ)
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		// 5.�������ж���
		Queue queue = session.createQueue("test-queue");
		// 6.������Ϣ����
		MessageConsumer consumer = session.createConsumer(queue);

		// 7.������Ϣ
		consumer.setMessageListener(new MessageListener() {
			@Override
			public void onMessage(Message message) {
				TextMessage textMessage = (TextMessage) message;
				try {
					System.out.println("���յ���Ϣ��" + textMessage.getText());
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		// 8.�ȴ���������
		System.in.read();
		// 9.�ر���Դ
		consumer.close();
		session.close();
		connection.close();

	}

}