/*
 2017��3��5��11:33:18
 �ַ������������
	������������洢��������ȡ�
	�ҵ�ָ��ͬһ������ʱ����ָ����ڴ���ȡ�
	��������������ȵı�������ַ��ͬ��
*/

class TestConstString
{
	public static void main(String[] args)
	{
		String aa = new String("china"); //ջ������ָ�����������������������ͬһ���ڴ���
		String bb = new String("china");
		System.out.println(aa);
		System.out.println(bb);
		
		if(aa == bb) //��ָ�ڴ��Ƿ����
			System.out.println("aa == bb");
		else
			System.out.println("aa != bb");

		String cc = "china"; //�����Ǵ���data���У�����ջ����ָ����ͬһ��data���ڴ�
		String dd = "china";
		if(cc == dd)
			System.out.println("cc == dd");
		else
			System.out.println("cc != dd");
	}
}