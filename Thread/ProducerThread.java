package com.Thread;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable {

	BlockingQueue queue = null;

	public ProducerThread(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		Random random = new Random();
		try {
			int num = random.nextInt(50);
			for (int i = 0; i < num ; i++) {
				queue.put(i);
				System.out.println("Producer:-" + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
