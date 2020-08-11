/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  ReflectIOCDemo.java   
 * @Package yxs.demo.reflectIoc   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��11�� ����3:48:53   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.demo.reflectIoc;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: ReflectIOCDemo
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��11�� ����3:48:53
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class ReflectIOCDemo {

	/**
	 * @Title: ReflectIOCDemo @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public ReflectIOCDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {

		String name = "sunzhifeng";
		int age = 20;

		Class clazz = null;
		try {
			clazz = Class.forName("yxs.demo.reflectIoc.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object object = null;
		try {
			object = clazz.newInstance();

		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BeanInfo info = null;
		try {
			info = Introspector.getBeanInfo(object.getClass());
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method method = null;
		PropertyDescriptor[] pds = info.getPropertyDescriptors();
		if (pds != null) {
			for (PropertyDescriptor pd : pds) {
				if ("name".equals(pd.getName())) {
					method = pd.getWriteMethod();
					try {
						method.invoke(object, name);
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if ("age".equals(pd.getName())) {
					method = pd.getWriteMethod();
					try {
						method.invoke(object, age);
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}

		A a = (A) object;
		System.out.println(a.getName());
		System.out.println(a.getAge());

	}

}
