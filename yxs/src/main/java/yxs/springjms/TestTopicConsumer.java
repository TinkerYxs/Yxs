/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TestTopicConsumer.java   
 * @Package yxs.springjms   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��12�� ����8:50:23   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.springjms;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: TestTopicConsumer
 * @Description:���Է�������������
 * @author: Ԫ��˧
 * @date: 2020��8��12�� ����8:50:23
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/yxs/springjms/applicationContext-jms-consumer-topic.xml")
public class TestTopicConsumer {

	@Test
	public void testTopicQueue() {
		// TODO Auto-generated method stub
		try {
			// Ϊ���������м���
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
