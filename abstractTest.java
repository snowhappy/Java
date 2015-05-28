/*
作者：雪
日期：2015年5月20号
功能：
		主要是静态
		可以给静态变量赋值
		静态只能由静态来调用，非静态既可以调用静态的又可以调用非静态的。 
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
			System.out.println("午休三个小时");
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
			System.out.println("午休五个小时");
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
单利模式

作用：只能有一个对象使用，不能再创建类
饿汉式  懒汉式
*/

//饿汉式加载，就是先要创建一个对象
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
	//懒汉式加载：就是延迟加载
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
		 				//上锁，避免对象之间冲突
				 		  synchronized(lazyPerson.class)
				 		  {
				 		    if(p==null)
				 		    {p= new lazyPerson();}
				 		  }
		 			}
		 		return p;
	 		
		 }
 	}*/
 	
 	//模板方法，一部分是已经固定的方法另一部分却不是
 	//固定的方法用final，不确定的可以使用abstract
 	
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
	