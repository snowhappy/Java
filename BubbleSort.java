/*
���ߣ�ѩ
ʱ�䣺2015��5��11��
���ܣ�ð������
˼·��
	ð��������ǽ������������ĶԱ�
	��һ��Ԫ�غ� �ڶ���Ԫ�ضԱȣ��ڶ���Ԫ�غ͵�����Ԫ�ؽ��жԱȡ�����
	Ҳ���ǽ����ŵ�Ԫ�ؽ��жԱȣ�������ѭ������ѭ����Ҫ������������������һ����Ҫ���ж��ٴ�
ԭ��:
	ð�������ԭ����ÿ��һ����ͻ�ɸѡ�����ֵ��Ȼ���һ�ο϶�ɸѡ����������ֵ
	�ڶ��ξͼ���һ��Ԫ�صıȽ�
	�����μ�������Ԫ�صıȽ�
	֪�����ʣ�µ�����Ԫ�ؾͿ��Բ����бȽ��ˡ���
*/
public class BubbleSort
{
	public static void Bubble(int arry[])
	{
		for(int x=0;x<arry.length;x++)
		{
			for(int y=0;y<arry.length-1-x;y++)//x��ÿһ������Ԫ�ؼ��ٵĸ�����-1��Ϊ�˲�Ҫ���±�Խ��
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
		//���������ù���
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
				//���x�������һ��Ԫ��
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
			//������ð�����򣬻���ѡ��������һ����ͬ�Ĺ��ܾ��ǱȽϴ�С�Ĺ���
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