package yxs.deadlock;

class DeadLockDemo1 {
	public static void main(String[] args) {
		// �����߳�
		Thread t1 = new Thread(new Dead(true));
		Thread t2 = new Thread(new Dead(false));

		// �����߳�
		t1.start();
		t2.start();
	}
}