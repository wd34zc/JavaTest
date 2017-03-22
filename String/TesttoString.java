/*
 toString
	Object类下的一个方法。
	返回一个自我描述这个类的字符串。（默认返回"类名@地址"）。
	建议每个类重写这个类，使它实现价值。
*/

class Fruit
{
	private String kind;
	public Fruit(String kind)
	{
		this.kind = kind;
	}
	public String toString() //重写对Fruit类的描述。
	{
		return "这是一个" + kind + "。";
	}
}
public class TesttoString
{
	public static void main(String[] args)
	{
		Fruit a = new Fruit("苹果");
		System.out.println(a);
	}
}