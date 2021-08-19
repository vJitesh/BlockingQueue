package com.Thread;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread implements Runnable {

	BlockingQueue queue = null;

	public ConsumerThread(BlockingQueue queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Consumer:-" + queue.take());
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
