/*
作者：雪
时间：2015年5月11日
功能：冒泡排序
思路：
	冒泡排序就是进行两个两个的对比
	第一个元素和 第二个元素对比，第二个元素和第三个元素进行对比。。。
	也就是紧挨着的元素进行对比，这是内循环，外循环主要就是这样的两两排序一共需要进行多少次
原理:
	冒泡排序的原理，每次一排序就会筛选出最大值，然后第一次肯定筛选出的是最大的值
	第二次就减少一次元素的比较
	第三次减少两个元素的比较
	知道最后剩下的两个元素就可以不进行比较了。。
*/
public class BubbleSort
{
	public static void Bubble(int arry[])
	{
		for(int x=0;x<arry.length;x++)
		{
			for(int y=0;y<arry.length-1-x;y++)//x是每一次排序元素减少的个数，-1是为了不要让下表越界
			{
				/*
				if(arry[y]<arry[y+1])
				{
					int tmp=arry[y+1];
					arry[y+1]=arry[y];
					arry[y]=tmp;
					}
					*/
					compare(arry,y,y+1);
				}
			 }
		}
		//主函数调用功能
		public static void main(String[] args)
		{
			int arr[]={4,7,2,1,8,9,34};
			Print(arr);
			Bubble(arr);
			Print(arr);
			
			}
		public static void Print(int[] arry)
		{
			for(int x=0;x<arry.length;x++)
			{
				//如果x不是最后一个元素
				if(x!=arry.length-1)
				{
					System.out.print(arry[x]+",");
					}
				else
				{
					System.out.print(arry[x]);
					}
				}
				System.out.println("");
			}
			//不管是冒泡排序，还是选择排序都有一个共同的功能就是比较大小的功能
			public static void compare(int arry[],int a,int b)
			{
				if(arry[a]>arry[b])
				{
					int temp=arry[a];
					arry[a]=arry[b];
					arry[b]=temp;
					}
				}
	}