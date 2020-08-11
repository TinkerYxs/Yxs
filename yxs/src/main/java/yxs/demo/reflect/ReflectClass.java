package yxs.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectClass {
	private final static String TAG = "yxs.demo.reflect.ReflectClass";

	// ��������
	public static void reflectNewInstance() {
		try {
			Class<?> classBook = Class.forName("yxs.demo.reflect.Book");
			Object objectBook = classBook.newInstance();
			Book book = (Book) objectBook;
			book.setName("Android����֮��");
			book.setAuthor("������");
			System.out.println(TAG + "  " + "reflectNewInstance book = " + book.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// ����˽�еĹ��췽��
	public static void reflectPrivateConstructor() {
		try {
			Class<?> classBook = Class.forName("yxs.demo.reflect.Book");
			Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor(String.class, String.class);
			declaredConstructorBook.setAccessible(true);
			Object objectBook = declaredConstructorBook.newInstance("Android��������̽��", "�����");
			Book book = (Book) objectBook;
			System.out.println(TAG + "  " + "reflectNewInstance book = " + book.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// ����˽������
	public static void reflectPrivateField() {
		try {
			Class<?> classBook = Class.forName("yxs.demo.reflect.Book");
			Object objectBook = classBook.newInstance();

			Field fieldTag = classBook.getDeclaredField("TAG");
			fieldTag.setAccessible(true);
			String tag = (String) fieldTag.get(objectBook);
			System.out.println(TAG + "  " + "reflectNewInstance tag = " + tag);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// ����˽�з���
	public static void reflectPrivateMethod() {
		try {
			Class<?> classBook = Class.forName("yxs.demo.reflect.Book");
			Method methodBook = classBook.getDeclaredMethod("declaredMethod", int.class);
			methodBook.setAccessible(true);
			Object objectBook = classBook.newInstance();
			String string = (String) methodBook.invoke(objectBook, 0);

			System.out.println(TAG + "  " + "reflectNewInstance string = " + string);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// ���乫�з���
	public static void reflectPublicMethod() {
		try {
			Class<?> classBook = Class.forName("yxs.demo.reflect.Book");

			Method[] methods = classBook.getMethods();
			for (Method m : methods) {
				System.out.println(m.getName());
			}
			Field[] fields = classBook.getFields();
			for (Field f : fields) {
				System.out.println(f.toString());
			}

			Method methodBook = classBook.getMethod("setName", String.class);
			methodBook.setAccessible(true);
			Object objectBook = classBook.newInstance();
			methodBook.invoke(objectBook, "hhhhhhhh");
			Book book = (Book) objectBook;

			System.out.println(TAG + "  " + "reflectNewInstance bookname = " + book.getName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			// ��������
			ReflectClass.reflectNewInstance();

			// ����˽�еĹ��췽��
			ReflectClass.reflectPrivateConstructor();

			// ����˽������
			ReflectClass.reflectPrivateField();

			// ����˽�з���
			ReflectClass.reflectPrivateMethod();

			// ���乫�з���
			ReflectClass.reflectPublicMethod();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}