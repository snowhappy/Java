/*
���ߣ�ѩ
���ڣ�2015��5��20��
���ܣ�
		��Ҫ�Ǿ�̬
		���Ը���̬������ֵ
		��ֻ̬���ɾ�̬�����ã��Ǿ�̬�ȿ��Ե��þ�̬���ֿ��Ե��÷Ǿ�̬�ġ� 
*/

/*
class Person{
	
	String name;
	int age;
	static String contry="Am";
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		}
	public void speak(String name)
	{
		System.out.println("I'm"+name);
		}
	public static void Contry(String cn)
	{
		contry=cn;
		System.out.println(contry);
		}
	
	}
	
 abstract class Person
	{
			public abstract void sleep();
			public abstract void study();	
		}
 class Fore extends Person
	{
		public void sleep()
		{
			System.out.println("��������Сʱ");
			}	
		public void study()
		{
			System.out.println("English");
			}
		}
		
	class japanes extends Person
	{
		public void sleep()
		{
			System.out.println("�������Сʱ");
			}
		public void study()
		{
			System.out.println("Japanese");
			}
		}
		class Common{
			public void function(Person p)
			{
				p.sleep();
				p.study();
				}
			
*/
/*
����ģʽ

���ã�ֻ����һ������ʹ�ã������ٴ�����
����ʽ  ����ʽ
*/

//����ʽ���أ�������Ҫ����һ������
/*
class Person
{
	private Person(){System.out.println("success");};
	private static Person p=new Person();
	public static Person getInstance()
	{
		return p;
		}
	}
	*/
	//����ʽ���أ������ӳټ���
 /*class lazyPerson
 {
		 	private lazyPerson()
		 	{
		 		System.out.println("this  is  lazyPerson");
		 		}
		 	private static lazyPerson p;
		 	public  static lazyPerson getInstance()
		 	{
		 		if(p==null)
		 		{
		 				//�������������֮���ͻ
				 		  synchronized(lazyPerson.class)
				 		  {
				 		    if(p==null)
				 		    {p= new lazyPerson();}
				 		  }
		 			}
		 		return p;
	 		
		 }
 	}*/
 	
 	//ģ�巽����һ�������Ѿ��̶��ķ�����һ����ȴ����
 	//�̶��ķ�����final����ȷ���Ŀ���ʹ��abstract
 	
 abstract	class GetTime
 	{
 		public final void getTime()
 		{
 			long startTime=System.currentTimeMillis();
 			runCod();
 			long endTime=System.currentTimeMillis();
 			System.out.println(endTime-startTime);
 		}
 		public abstract void runCod();
 	}
 	class SubTime extends GetTime
 	{
 		public  void runCod()
 		{
 			for(int i=0;i<1000;i++)
 			{
 				System.out.print(i);
 				}
 			}
 		}
	public class abstractTest
	{
		public static void main(String[] args)
		{
					//Person p=new Person("lisi",20);
					//p.speak("lisi");
				//	p.Contry("China");
					//Person.Contry("China");
			
			/*	Person p=new Fore();
				p.sleep();
				p.study();
				
				Person pj=new japanes();
				pj.sleep();
				
				Common c =new Common();
				c.function(new Fore());*/
				//Person.getInstance();
				//lazyPerson.getInstance();
				GetTime g=new SubTime();
				g.getTime();
			}
			

		}
	