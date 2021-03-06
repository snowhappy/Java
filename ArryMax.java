/*
作者：雪
时间：2015年5月11号
功能：获取数组中值最大、最小的
思路：1.获取最大值，每一次都要进行比较，所以声明一个变量
      2.每个数组的元素和变量进行比较
      3.所有元素比较完后，最后剩下的肯定是存储的最大值
步骤：1.定义变量，同时将其初始化为数组中的任意一个值
			2.对数组进行便利
      3.判断条件，如果便利的数组比定义的变量的数值大的话就进行交换，最后得到的肯定是最大值
      4.需要定义一个函数，提高代码的复用性
*/

public class ArryMax{
	//自定义一个函数，函数返回值为一个最大值所以返回值的类型为int类型
	//传递一个数组参数，此参数为未知变量
	/*public static int getMax(int[] arry)
	{
		// 定义一个变量,变量的初始值设定为数组的第一个
		int max=arry[0];
		//便利数组
		for (int x=0;x<arry.length;x++){
			if(arry[x]>max)
			{
				max=arry[x];
				}
			}
			return max;
	 }
	 */
		//主函数
		public static void main(String[] args)
		{
			int arr[]={1,4,8,4,9,6,7};
			int max=getMax_2(arr);
			System.out.println(max);
			}
			
			//比较最小的和最大的同样道理
	
		//方法二
			public static int getMax_2(int arry[])
			{
				//将变量的初始值化为0，这个max的值是同数组的下标的值是一致的
				int max=0;
				for(int x=0;x<arry.length;x++)
				{
					if(arry[x]>arry[max])
					{
						//如果arry[x]的值大于arry[max]的值，那么就把两个数组元素的下标交换一下就OK了
						max=x;
						}
					}
					return arry[max];
				}
	}