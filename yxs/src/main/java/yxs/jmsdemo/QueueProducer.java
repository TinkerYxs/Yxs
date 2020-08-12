/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  QueueProducer.java   
 * @Package yxs.jmsdemo   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��12�� ����8:10:30   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.jmsdemo;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @ClassName: QueueProducer
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��12�� ����8:10:30
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class QueueProducer {
	public static void main(String[] args) throws JMSException {

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
		// 6.������Ϣ������
		MessageProducer producer = session.createProducer(queue);
		// 7.������Ϣ
		TextMessage textMessage = session.createTextMessage("��ӭ�������������");
		// 8.������Ϣ
		producer.send(textMessage);
		// 9.�ر���Դ
		producer.close();
		session.close();
		connection.close();
	}

}