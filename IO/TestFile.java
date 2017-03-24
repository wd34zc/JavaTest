import java.io.*;
public class TestFile
{
	public static void main(String[] args) throws IOException
	{
//		String fileDirectory = "dir1/dir2";
//		File f1 = new File(fileDirectory,"mydir.txt"); //在缓存中创建路径和文件名
//		if(f1.exists())
//		{
//			System.out.println(f1.getAbsolutePath());
//			System.out.println(f1.length());
//		}
//		else
//		{
//			f1.getParentFile().mkdirs();	//在硬盘创建对应路径的文件夹
//			f1.createNewFile();	//用内存文件名在对应的路径创造一个文件,如果对应路径不存在，则抛出异常。
//		}

		File file = new File("HelloWorld");
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile().getParent());
		String[] filelist = file.list();
		System.out.println("====当前目录文件====");
		for(String filename: filelist)
		{
			System.out.println(filename);
		}
	}
}