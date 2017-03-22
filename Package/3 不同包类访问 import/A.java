package bag3;

import java.lang.System; //包含System类。
//可以省略System类以前的所有路径。
//	因为java.lang.*默认可以省略，所以效果不是很明显。
import static java.lang.System.*;//静态包含System类下的全部静态方法
//可以省略该类名，直接写方法。
//	例如 out.printf();


public class A// 类名要和文件名相同
{
	public void f()
	{
		out.println("AAAA");
	}
}
