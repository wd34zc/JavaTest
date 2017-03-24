/*
OutputStreamWriter and InputStreamReader
	把字节流转换为字符流
*/
import java.io.*;

public class TestTransfrom 
{
	public static void main(String[] args) 
	{
		try
		{
			//把字节流输出变成字符流
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:/java/javatest/IO/te"));
			osw.write("hello kugou");
			osw.close();
			InputStreamReader isr = new InputStreamWriter(new FileInputStream("e:/java/javatest/IO/texting"));
			BufferedReader bf = new BufferedReader(isr);
			String b = null;
			while((b=bf.readLine())!=null)
			{
				System.out.println(b);
			}
			bf.close();
			isr.close();
		}
		catch(FileNotFoundException e2)
		{
			e2.getStackTrace();
		}
		catch(IOException e1)
		{
			e1.getStackTrace();
		}
	}

}