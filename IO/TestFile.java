import java.io.*;
public class TestFile
{
	public static void main(String[] args) throws IOException
	{
//		String fileDirectory = "dir1/dir2";
//		File f1 = new File(fileDirectory,"mydir.txt"); //�ڻ����д���·�����ļ���
//		if(f1.exists())
//		{
//			System.out.println(f1.getAbsolutePath());
//			System.out.println(f1.length());
//		}
//		else
//		{
//			f1.getParentFile().mkdirs();	//��Ӳ�̴�����Ӧ·�����ļ���
//			f1.createNewFile();	//���ڴ��ļ����ڶ�Ӧ��·������һ���ļ�,�����Ӧ·�������ڣ����׳��쳣��
//		}

		File file = new File("HelloWorld");
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile().getParent());
		String[] filelist = file.list();
		System.out.println("====��ǰĿ¼�ļ�====");
		for(String filename: filelist)
		{
			System.out.println(filename);
		}
	}
}