/*
��ת�ַ���
���Ƚ��ַ����������
Ȼ�����鷴ת
Ȼ���������ַ���
*/
class transform
{
	public static String ReverseString(String s)
	{
		//�ַ���ת������
		char[] cha=s.toCharArray();
		//��ת����
		reserve(cha);
		//���������ַ���
		return new String(cha);
		}
		
		//�ǵ�ǰ����ַ���һ�µģ���ʼ�ӿ�ʼ����β�ӽ�βѭ����Ȼ����ʹ��Swap���������߽��л�λ
		public static void reserve(char[]arry)
		{
			//ע�⣺length��߲�Ӧ�ø�������
			for(int start=0,end=arry.length-1; start<end ; start++,end--)
			{
				Swap(arry,start,end);
				}
			
			}
			//��ת�ַ�����ʹ�õ�������
			public static void Swap(char[]arry,int x,int y)
			{
				char temp=arry[x];
				arry[x]=arry[y];
				arry[y]=temp;
				
				}
	}
	class transformDemo
	{
		public static void main(String[]args)
		{
			String s="a,b,c,d,e,f,g,h,i,j,k,m,l,n";
			System.out.println(transform.ReverseString(s));
			}
		}