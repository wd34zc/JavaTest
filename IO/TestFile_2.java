/*
File ��
�����·������һ���ļ�
ע�⣺File�����ļ�Ҳ��·��
	 f.getParentFile().mkdirs(); //ֻ����������JAVA����ʶ����Ǵ����ļ�
	 f.mkdirs��//����ļ�����·���������
*/
import java.io.*;
public class TestFile_2
{
	public static void main(String[] args)
	{
		File f = new File("test/test.txt");	
		System.out.println(f.getParentFile());	//�鿴���ļ���
		System.out.println(f.getAbsolutePath());	//�鿴����·��
		System.out.println(f.getParentFile().getAbsoluteFile()); //�鿴���ļ��еľ���·��
		if(!f.getParentFile().exists()) //�����·�������ڸ���Ŀ¼
			f.getParentFile().mkdirs();	//����һ����Ŀ¼
		try
		{
			f.createNewFile(); //����Ŀ¼�����Ӧ���ļ�
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}