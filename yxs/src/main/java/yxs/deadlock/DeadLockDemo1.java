package yxs.deadlock;

class DeadLockDemo1 {
	public static void main(String[] args) {
		// 创建线程
		Thread t1 = new Thread(new Dead(true));
		Thread t2 = new Thread(new Dead(false));

		// 开启线程
		t1.start();
		t2.start();
	}
}