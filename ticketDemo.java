/*
���󣺴�����Ʊ
��������ͨ��ʵ��runnable�ӿڣ��ô�������java����Ҫ�ǵ��̳У����ܶ�̳У��������ʵ�ֽӿڣ���ʵ�����Լ̳���
Runnable Ҫ��д
//���ֵ�������ǳ�����4��100�ŵ�Ʊ
����Ľ��������
	��������

*/
class ticket implements Runnable
{
	public static int tic=100;
	public void run()
	{
		while(true)
		{
			if(tic>0)
			{
				System.out.println(Thread.currentThread().getName()+"sale-----"+tic);
				tic--;
				}
			}
		}
	}
	class ticketDemo
	{
		public static void main(String[] args)
		{
			ticket t=new ticket();
			Thread t1=new Thread(t);
			Thread t2=new Thread(t);
			Thread t3=new Thread(t);
			Thread t4=new Thread(t);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			}
		}