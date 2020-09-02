package yxs.deadlock;

//�����߳�
class Dead implements Runnable {
	// ��־λ
	private boolean flag;

	Dead(boolean flag) {
		this.flag = flag;
	}

	// ��дrun����
	@Override
	public void run() {
		while (true) {
			if (flag) {
				// ӵ��locka�����ȡlockb
				synchronized (Lock.locka) {
					System.out.println("if locka");

					synchronized (Lock.lockb) {
						System.out.println("if lockb");
					}
				}
			} else {
				// ӵ��lockb�����ȡlocka
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

// ������
