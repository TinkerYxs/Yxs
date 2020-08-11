package yxs.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectClass {
	private final static String TAG = "yxs.demo.reflect.ReflectClass";

	// 创建对象
	public static void reflectNewInstance() {
		try {
			Class<?> classBook = Class.forName("yxs.demo.reflect.Book");
			Object objectBook = classBook.newInstance();
			Book book = (Book) objectBook;
			book.setName("Android进阶之光");
			book.setAuthor("刘望舒");
			System.out.println(TAG + "  " + "reflectNewInstance book = " + book.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// 反射私有的构造方法
	public static void reflectPrivateConstructor() {
		try {
			Class<?> classBook = Class.forName("yxs.demo.reflect.Book");
			Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor(String.class, String.class);
			declaredConstructorBook.setAccessible(true);
			Object objectBook = declaredConstructorBook.newInstance("Android开发艺术探索", "任玉刚");
			Book book = (Book) objectBook;
			System.out.println(TAG + "  " + "reflectNewInstance book = " + book.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// 反射私有属性
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

	// 反射私有方法
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

	// 反射公有方法
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
			// 创建对象
			ReflectClass.reflectNewInstance();

			// 反射私有的构造方法
			ReflectClass.reflectPrivateConstructor();

			// 反射私有属性
			ReflectClass.reflectPrivateField();

			// 反射私有方法
			ReflectClass.reflectPrivateMethod();

			// 反射公有方法
			ReflectClass.reflectPublicMethod();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}