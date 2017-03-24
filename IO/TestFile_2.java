/*
File 类
用相对路径创造一个文件
注意：File既是文件也是路径
	 f.getParentFile().mkdirs(); //只有这样调用JAVA才能识别出是创建文件
	 f.mkdirs；//会把文件当成路径创造出来
*/
import java.io.*;
public class TestFile_2
{
	public static void main(String[] args)
	{
		File f = new File("test/test.txt");	
		System.out.println(f.getParentFile());	//查看父文件夹
		System.out.println(f.getAbsolutePath());	//查看绝对路径
		System.out.println(f.getParentFile().getAbsoluteFile()); //查看父文件夹的绝对路径
		if(!f.getParentFile().exists()) //如果父路径不存在该子目录
			f.getParentFile().mkdirs();	//创建一个子目录
		try
		{
			f.createNewFile(); //在子目录创造对应的文件
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}