/*
FileInputStream
	���ֽ�Ϊ��λ����������
	��Ҫ��׽IOException�쳣;
	��β������-1��
	
*/
import java.io.*;
public class TestFileInputStream
{
	public static void main(String[] args)
	{
		FileInputStream in = null;
		try
		{
			in = new FileInputStream("e:/java/javatest/IO/testing.txt");
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("�Ҳ���ָ���ļ���");
			System.exit(-1);
		}

		int b=0;
		long num = 0;
		try
		{
			System.out.println(in.available()); //��ȡ�ļ��ֽ�����
			while((b=in.read())!= -1)
			{
				System.out.printf("%c",b);
				num++;
			}
			in.close();
			System.out.println();
			System.out.println("�ļ�����ȡ��" + num + "���ֽڡ�");
		}
		catch (IOException e2)
		{
			System.out.println("�ļ���ȡ����");
			System.exit(-1);
		}
	}
}