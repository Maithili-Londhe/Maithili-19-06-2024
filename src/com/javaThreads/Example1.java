package com.javaThreads;

public class Example1 implements Runnable
{

	@Override
	public void run()//common resource used by all thread objects
	{
		int value = 1;
		
		while(value <= 20)
		{
			
			System.out.println(Thread.currentThread()+": "+value);
			value = value+1;
			
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
