/*
同步函数
什么是同步函数：
	同步函数，同步代码快是一样的道理，同步函数就是将函数代码换成是一个函数就是同步函数
	
	实例：
		银行存钱取钱为一个实例
	注意：
		在没有上锁之前，没有写同步代码或者是同步函数的时候，这个结果是错误的，就是会出现两个200或者是两个100
		所以要把同步的代码上锁一个线程一个线程的进行
	写法：
		两种写法
		一种就是objsynchronized（object） 同步代码块
		另一种就是 直接在函数上写，同步函数
*/
class Bank
{
	private int sum;
	//Object obj=new Object();
		public synchronized void add(int b)
		{
		//	synchronized(obj)
			//{
			sum+=b;
			System.out.println("sum="+sum);
			//}
		}
	}
	class CUs implements Runnable
	{
		Bank b=new Bank();
		public void run()
		{
			for(int x=0;x<3;x++)
			{
				b.add(100);
				}
			}
		}
		class functionDemo
		{
			public static void main(String[] args)
			{
				CUs c=new CUs();
				Thread t=new Thread(c);
				Thread t1=new Thread(c);
				t.start();
				t1.start();
				}
			}