package com.javaThreads;

public class TestClass {

	public static void main(String[] args) //main program/application/process
	{

		Example1 example1 = new Example1();
		Thread thread1 = new Thread(example1);
		thread1.start();
		
		Example1 example2 = new Example1();
		Thread thread2 = new Thread(example2);
		thread2.start();
		
		Example1 example3 = new Example1();
		Thread thread3 = new Thread(example3);
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread3.start();
		
	}

}
