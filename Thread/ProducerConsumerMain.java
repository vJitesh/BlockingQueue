package com.Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerMain {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
		
		new Thread(new ProducerThread(bq)).start();
        new Thread(new ConsumerThread(bq)).start();		
		
	}

}
