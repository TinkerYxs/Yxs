package yxs.deadlock;

//定义线程
class Dead implements Runnable {
	// 标志位
	private boolean flag;

	Dead(boolean flag) {
		this.flag = flag;
	}

	// 复写run方法
	@Override
	public void run() {
		while (true) {
			if (flag) {
				// 拥有locka，想获取lockb
				synchronized (Lock.locka) {
					System.out.println("if locka");

					synchronized (Lock.lockb) {
						System.out.println("if lockb");
					}
				}
			} else {
				// 拥有lockb，想获取locka
				synchronized (Lock.lockb) {
					System.out.println("else lockb");

					synchronized (Lock.locka) {
						System.out.println("else locka");
					}
				}
			}
		}
	}
}

// 定义锁
