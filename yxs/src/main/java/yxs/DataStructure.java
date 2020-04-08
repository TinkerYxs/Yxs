/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  DataStructure.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年4月8日 上午10:20:17   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

/**
 * @ClassName: DataStructure
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年4月8日 上午10:20:17
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class DataStructure implements Comparable<DataStructure> {

	private int age;

	private String name;

	public DataStructure() {
		super();
	}

	public DataStructure(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(DataStructure s) {
		// 此处的this和s前后位置改变会影响排序方式
		int num1 = this.age - s.age;

		int num2 = num1 == 0 ? this.name.compareTo(s.name) : num1;

		return num2;
	}

	public static void main(String[] args) {

		System.out.println("List:++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		testList();
		System.out.println("SortSet:+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		testSortSet();
		System.out.println("Set:+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		testSet();
		System.out.println("TreeSet:自然排序+++++++++++++++++++++++++++++++++++++++++++++++");
		testTreeSet();
		System.out.println("TreeSet:比较器排序++++++++++++++++++++++++++++++++++++++++++++++");
		testTreeSet2();
	}

	public static void testSet() {

		HashSet<Integer> set1 = new HashSet<>();

		TreeSet<Integer> set2 = new TreeSet<>();

		LinkedHashSet<Integer> lSet = new LinkedHashSet<>();

		Random r = new Random();

		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() < 10) {
			hs.add((r.nextInt(20) + 1));
		}
		for (Integer i : hs) {
			System.out.println(i);
		}

	}

	public static void testSortSet() {

		SortedSet<Integer> set = new TreeSet<>();
		set.add(0);
		set.add(3);
		set.add(2);
		set.add(6);
		set.add(3);
		System.out.println(set);
		SortedSet<Integer> set2 = new TreeSet<>();
		set2.add(5);
		set.addAll(set2);
		System.out.println(set);
		set.remove(set2.first());
		System.out.println(set);
		set.add(5);
		System.out.println(set);
		set.removeAll(set2);
		System.out.println(set);

		System.out.println(set.contains(9));
		System.out.println(set.containsAll(set2));
		System.out.println(set.isEmpty());

		Iterator<Integer> sIterator = set.iterator();

		while (sIterator.hasNext()) {
			System.out.println(sIterator.next());

		}

		System.out.println(set.size());
		set.add(5);
		System.out.println(set.retainAll(set2));
		// 把set2和set的交集给set
		System.out.println(set);
		System.out.println(set.toString());
		System.out.println(set.retainAll(set));
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.hashCode());

		set.clear();
		System.out.println(set);

	}

	public static void testTreeSet() {
		TreeSet<DataStructure> ts = new TreeSet<DataStructure>();

		DataStructure s1 = new DataStructure("zfliu", 18);
		DataStructure s2 = new DataStructure("zfliu", 20);
		DataStructure s3 = new DataStructure("zfliu", 18);
		DataStructure s4 = new DataStructure("ZFLIU", 18);
		DataStructure s5 = new DataStructure("Java", 18);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (DataStructure s : ts) {
			System.out.println(s.getName() + s.getAge());
		}
	}

	public static void testTreeSet2() {
		TreeSet<DataStructure> ts = new TreeSet<DataStructure>(new Comparator<DataStructure>() {

			// 匿名内部类实现比较器排序接口
			@Override
			public int compare(DataStructure s1, DataStructure s2) {

				int num1 = s1.getAge() - s2.getAge();

				int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;

				return num2;
			}

		});

		DataStructure s1 = new DataStructure("zfliu", 18);
		DataStructure s2 = new DataStructure("zfliu", 20);
		DataStructure s3 = new DataStructure("zfliu", 18);
		DataStructure s4 = new DataStructure("ZFLIU", 18);
		DataStructure s5 = new DataStructure("Java", 18);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (DataStructure s : ts) {
			System.out.println(s.getName() + s.getAge());
		}

	}

	public static void testList() {

		List<Integer> l = new ArrayList<Integer>();

		ArrayList<Integer> list = new ArrayList<>();
		list = (ArrayList<Integer>) l;
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		Vector<Integer> list3 = new Vector<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		System.out.println(list.get(0));

		ListIterator<Integer> it = list.listIterator();

		// 正向遍历List

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		it.add(500000);

		it.add(500001);

		// 逆向遍历List
		// 逆向遍历必须先正向遍历使指针指到后面位置才能使用（使用意义不大）
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}

		list.set(1, 1000);
		System.out.println(list.get(1));

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		String[] s = new String[] { "A", "B", "C", "D", "E" };
		List<String> lista = Arrays.asList(s);

		System.out.println(lista.get(3));

		String[] dest = lista.toArray(new String[0]);// new String[0]是指定返回数组的类型
		System.out.println("dest: " + Arrays.toString(dest));

		list2.add(2);
		list2.add(3);

		System.out.println(list2.getFirst() + "  " + list2.getLast());
		list2.removeFirst();
		list2.removeLast();
		System.out.println(list2);
		list2.add(8888);
		list2.addFirst(0);
		list2.addLast(0);
		System.out.println(list2);

		list3.add(3);
		list3.add(4);
		list3.addElement(99999);
		System.out.println(list3.elementAt(2));
		Iterator<Integer> vIterator = list3.iterator();
		// 使用Iterator遍历 Collection

		// 使用elements
		Enumeration<Integer> elements = list3.elements();

		while (elements.hasMoreElements()) {

			System.out.println(elements.nextElement());
		}

	}
}
