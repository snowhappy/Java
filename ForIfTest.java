/*
作者：雪
时间：2015年5月11日
功能：求出1-100之间能被其整出的数
步骤：
1.创建一个类
2.主函数
3.使用for循环嵌套if
*/
public class ForIfTest{
	public static void main(String[] args)
	{
		//1.1-100之间所以是有一个循环	
		
		//计算一共有多少个数能够被七整出
		int count =0;
		for (int x=0;x<=100;x++){
				//2.被7整除
				//注意等号 是双等号，如果不是如等号就会报错。
				if(x%7==0)
				{			
					count++;
					}
			}
			//打印最终的结果是不需要再循环中写的。有些不参与循环
			System.out.println(count);
		}
	}
