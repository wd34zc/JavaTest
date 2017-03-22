/*
组合
在类里面调用其他类作为成员。
功能与继承相似
*/
class Animal
{
	public void breath()
	{
		System.out.println("呼一口气，吸一口气，呼吸中...");
	}
}
class Bird
{
	private Animal a = new Animal();
//	public Bird(Animal a)
//	{
//		this.a = a;
//	}
	public void fly()
	{
		System.out.println("厉害吧，爷会飞！");
	}
	public void breath()
	{
		a.breath();
	}
}
public class TestComposite
{
	public static void main(String[] args)
	{
//		Animal a = new Animal();
		Bird b = new Bird();
		b.breath();
		b.fly();
	}
}